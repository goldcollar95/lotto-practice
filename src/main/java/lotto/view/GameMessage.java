package lotto.view;

public enum GameMessage {
    FIRST_START_MESSAGE("구입금액을 입력해 주세요."),
    SECOND_BUY_MESSAGE("개를 구매했습니다."),
    THIRD_INPUT_WINNINGNUMBER("당첨 번호를 입력해 주세요."),
    FOUR_INPUT_BONUSNUMBER("보너스 번호를 입력해 주세요."),
    CORRECT_LIST("당첨 통계\n---"),
    RATE("총 수익률은 "),
    PERCENT("%입니다.");

    private final String gameMessage;


    GameMessage(String gameMessage){
        this.gameMessage = gameMessage;
    }



    public String getgameMessage(){
        return gameMessage;
    }



}
