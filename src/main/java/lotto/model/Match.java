package lotto.model;

import lotto.view.InputView;

import java.util.*;
import java.util.stream.Collectors;

public class Match {
    private static int matchCount = 0;
    private static int countCheck;

    InputView inputView = new InputView();
    public int compareResult(List<Integer> WinningNumber, List<Integer> RandomsNumber){

        int result = 0;
        List<Integer> Winning = WinningNumber.stream().collect(Collectors.toList());
        List<Integer> Randoms = RandomsNumber.stream().collect(Collectors.toList());

        int count = 0;
        for(Integer sr : RandomsNumber){
            if(RandomsNumber.contains(WinningNumber)){
                result = count++;
            }
        }
        return result;
    }

    public List<Integer> matchingCorrector(List<List<Integer>> lottoNumbers, List<Integer> WinningNumbers){
        Map<List<Integer>, Integer> map = new HashMap<>();
        for(List<Integer> lotto: lottoNumbers){
            countCheck(map, lotto, WinningNumbers);
            countCheck = 0;
        }
        setMatchCount(map);
        List<Integer> MatchingLotto = new ArrayList<>();
        for (Map.Entry<List<Integer>, Integer> entry : map.entrySet()){
            if(entry.getValue().equals(matchCount)){
                MatchingLotto = entry.getKey();
                break;
            }
        }
        return MatchingLotto;
    }

    public static int getMatchCount(){
        return matchCount;
    }

    private void setMatchCount(Map<List<Integer>, Integer> map){
        countCheck = Collections.max(map.values());
        matchCount = countCheck;
    }


    // 3개일치 --> 1개 추가
    public void countCheck(Map<List<Integer>, Integer> map, List<Integer> lotto, List<Integer> winningNumbers) {
            for(Integer match : winningNumbers){
                if(lotto.contains(match)){
                    countCheck++;
                    map.put(lotto, countCheck);
                }
            }
    }


    public boolean BonusCheck(List<Integer> MatchingLotto, int BonuseNumber){
        if(MatchingLotto.contains(BonuseNumber)){
            return true;
        }
        return false;
    }
}
