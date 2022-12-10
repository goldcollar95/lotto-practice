package lotto.view;

import lotto.model.RankList;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

public class OutputView {
    private  static final int unit = 1000;

    public static void resultCount(int number){
//        int count = number / 1000;
        System.out.println(number + GameMessage.SECOND_BUY_MESSAGE.getgameMessage());
    }

    public static int divideCount(int price){
        int Amount = price / unit;
        return Amount;
    }

    public static void printLotto(List<List<Integer>> lottos){
        for(List<Integer> list : lottos){
            System.out.println(lottos);
        }
        System.out.println();
    }

    public static void Overlap(List<Integer> winningNum, int bonus){
        if(winningNum.contains(bonus)){
            throw new IllegalArgumentException(ErrorMessage.LOTTO_OVERLAP_INPUT.getMessage());
        }
    }

    public static void countProcess(Map<RankList, Integer> result){
        System.out.println(GameMessage.CORRECT_LIST.getgameMessage());
        for(RankList rank : RankList.values()){
            if(rank.getMoney() == 0){
                continue;
            }
            System.out.println(rank.getRank() + result.get(rank) + "개");
        }
    }

    public static void countResult(Map<RankList, Integer> result, int purchase){
        for( RankList rank : result.keySet()){
            if(result.get(rank) == 1){
                Double dou = ((double) rank.getMoney() / purchase) * 100;
                DecimalFormat decimalFormat = new DecimalFormat("###,###.#");
                System.out.println(GameMessage.RATE.getgameMessage() + decimalFormat.format(dou) + GameMessage.PERCENT.getgameMessage());
            }
        }
    }
}
