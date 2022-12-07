package lotto.view;

public enum ErrorMessage {
    GAME_RANDOM_NUMBER_RANGE("[ERROR] 1부터 ~ 45의 수만 가능합니다."),
    GAME_SIX_NUMBER_POSSBLITY("[ERROR] 6개의 숫자만 입력해 주세요"),
    ONLY_1000_UNIT("[ERROR] 1000원 단위만 가능합니다"),
    INPUT_SPLIT_INPUT("[ERROR] 쉼표를 기준으로 입력해주세요"),
    OVERLAP_INPUT("[ERROR] 당첨 번호와 중복된 번호가 있습니다"),
    INPUT_IS_NOT_STRING("[ERROR] 문자를 입력할 수 없습니다."),
    INPUT_IS_NOT_EMPTY("[ERROR] 빈칸은 들어올 수 없습니다."),
    BONUS_INPUT_RANGE("[ERROR] 1부터 45의 숫자만 가능합니다."),
    BONUS_INPUT_LENGTH("[ERROR] 보너스의 숫자는 한개만 가능합니다");

    private final String Message;

    ErrorMessage(String Message){
        this.Message = Message;
    }

    public String getMessage(){
        return Message;
    }

}
