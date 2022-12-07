package lotto.view;

public enum ErrorMessage {
    RANDOM_NUMBER_RANGE("[ERROR] 1부터 ~ 45의 수만 가능합니다."),
    SIX_NUMBER_POSSBLITY("[ERROR] 6개의 숫자만 입력해 주세요"),
    ONLY_1000_UNIT("[ERROR] 1000원 단위만 가능합니다"),
    SPLIT_INPUT("[ERROR] 쉼표를 기준으로 입력해주세요"),
    OVERLAP_INPUT("[ERROR] 당첨 번호와 중복된 번호가 있습니다");

    private final String Message;

    ErrorMessage(String Message){
        this.Message = Message;
    }

    public String getMessage(){
        return Message;
    }

}
