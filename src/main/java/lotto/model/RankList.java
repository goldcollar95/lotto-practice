package lotto.model;

public enum RankList {

    MATCH_NOTTHING(0, " 당첨번호가 없습니다." , 0),
    MATCH_THREE(3, "3개 일치 (5,000원) - ", 5_000),
    MATCH_FOUR(4, "4개 일치 (50,000원) - ", 50_000),
    MATCH_FIVE(5, "5개 일치 (1,500,000원) - ", 1_500),
    MATCH_FIVE_AND_BONUS(5, "5개 일치, 보너스 볼 일치 (30,000,000원) - ", 30_000_000),
    MATCH_SIX(6, "6개 일치 (2,000,000,000원) - ", 2_000_000_000);


    private final int match;
    private final String rank;
    private final int money;

    RankList(int match, String rank, int money){
        this.match = match;
        this.rank = rank;
        this.money = money;
    }

    public static RankList getRankResult(int matchCount, boolean bonus){
        if (MATCH_FIVE_AND_BONUS.match == matchCount && bonus){
            return MATCH_FIVE_AND_BONUS;
        }

        for(RankList rank : values()){
            if(rank.match == matchCount && rank != MATCH_FIVE_AND_BONUS){
                return rank;
            }
        }
        return MATCH_NOTTHING;
    }

    public String getRank(){return rank;}

    public int getMoney(){return money;}

}
