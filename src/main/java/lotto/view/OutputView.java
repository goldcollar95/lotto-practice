package lotto.view;

import lotto.model.RankList;

import java.text.DecimalFormat;
import java.util.Map;

public class OutputView {

    public void resultCount(int number){
        int count = number / 1000;
        System.out.println(count + "개를 구매했습니다.");
    }

    public void countProcess(Map<RankList, Integer> result){
        System.out.println(GameMessage.CORRECT_LIST.getgameMessage());
        for(RankList rank : RankList.values()){
            if(rank.getMoney() == 0){
                continue;
            }
            System.out.println(rank.getRank() + result.get(rank) + "개");
        }
    }

    public void countResult(Map<RankList, Integer> result, int purchase){
        for( RankList rank : result.keySet()){
            if(result.get(rank) == 1){
                Double dou = ((double) rank.getMoney() / purchase) * 100;
                DecimalFormat decimalFormat = new DecimalFormat("###,###.#");
                System.out.println(GameMessage.RATE.getgameMessage() + decimalFormat.format(dou) + GameMessage.PERCENT.getgameMessage());
            }
        }
    }
}
