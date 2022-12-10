package lotto.controller;


import lotto.model.LottoNumbers;
import lotto.model.Match;
import lotto.model.RankList;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Controller {

    public void process() {
        int inputPrice = InputView.LottoInputPrice();
        OutputView.resultCount(OutputView.divideCount(inputPrice));
        List<List<Integer>> lottos = LottoNumbers.LottoRandomNumbers(OutputView.divideCount(inputPrice));
        OutputView.printLotto(lottos);  //가격 + 로또 번호 생성

        List<Integer> WinningMode = InputView.WinningListNumber();
        int BonusNum = InputView.BonusNumber();
        OutputView.Overlap(WinningMode, BonusNum); //보너스 까지

        List<Integer> rankMatch = Match.matchingCorrector(lottos, WinningMode);
        int matchCount = Match.getMatchCount();
        boolean bonusCheck = Match.BonusCheck(rankMatch, BonusNum);
        Map<RankList, Integer> result = MatchRank(matchCount, bonusCheck);
        OutputView.countProcess(result);
        OutputView.countResult(result, inputPrice);

    }

    private static Map<RankList, Integer> MatchRank(int match, boolean bonus){
        Map<RankList, Integer> result = setResult();
        RankList rank = RankList.getRankResult(match, bonus);
        result.put(rank, result.get(rank) + 1);
        return result;
    }

    private static Map<RankList, Integer> setResult(){
        Map<RankList, Integer> result = new LinkedHashMap<>();
        for(RankList rank : RankList.values()){
            result.put(rank, 0);
        }
        return result;
    }
}
