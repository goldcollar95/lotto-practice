package lotto.model;

import lotto.view.InputView;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Match {

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


    // 3개일치 --> 1개 추가
    public void countCheck(Map<List<Integer>, Integer> map, List<Integer> lotto, List<Integer> winningNumbers) {
            for(Integer match : winningNumbers){
                if(lotto.contains(match)){
                    count++;
                    map.put(lotto, count);
                }
            }
    }
}
