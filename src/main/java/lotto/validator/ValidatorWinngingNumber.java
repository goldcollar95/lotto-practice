package lotto.validator;

import lotto.view.ErrorMessage;

public class ValidatorWinngingNumber {


    public static void ValidatorWinningSummary(String WinningNum){
        ValidatorNotString(WinningNum);
        ValidatorNotSeparator(WinningNum);
        ValidatorNotBlank(WinningNum);

    }

    public static void ValidatorNotString(String WinningNum){
        String[] check = WinningNum.split(",");
        for(String str : check){
            if(check.equals(" ")){
                throw new IllegalArgumentException(ErrorMessage.INPUT_IS_NOT_EMPTY.getMessage());
            }
        }
    }

    public static void ValidatorNotSeparator(String WinningNum){
        String[] check = WinningNum.split(",");
        for(String str : check){
            if(!str.matches("^[0-9]*$")){
                throw new IllegalArgumentException(ErrorMessage.INPUT_IS_NOT_STRING.getMessage());
            }
        }
    }

    public static void ValidatorNotBlank(String WinningNum){
        if(WinningNum.contains(",")){
            throw new IllegalArgumentException(ErrorMessage.INPUT_SPLIT_INPUT.getMessage());
        }
    }

//    public void ValidatorNotMorethanMore(String WinningNum){
//        int[] listpoint = new int[] {Integer.parseInt(WinningNum)};
//
//        if(listpoint[0] < 1 || listpoint[0] > 45){
//            throw new IllegalArgumentException(ErrorMessage.GAME_RANDOM_NUMBER_RANGE.getMessage());
//        }
//    }
}
