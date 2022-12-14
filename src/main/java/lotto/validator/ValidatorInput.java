package lotto.validator;

import lotto.view.ErrorMessage;

public class ValidatorInput {

    public static void ValidatorAllSummary(String input){
        ValidatorOtherException(input);
        ValidatorIsEmpty(input);
    }


    public static void ValidatorOtherException(String input){
        if(!input.matches("^[0-9]*$")){
            throw new IllegalArgumentException(ErrorMessage.INPUT_IS_NOT_STRING.getMessage());
        }
    }

    public static void ValidatorIsEmpty(String input){
        String[] blankMatching = input.split("");
        for (String split : blankMatching){
            if(split.equals(" ")){
                throw new IllegalArgumentException(ErrorMessage.INPUT_IS_NOT_EMPTY.getMessage());
            }
        }
    }
}
