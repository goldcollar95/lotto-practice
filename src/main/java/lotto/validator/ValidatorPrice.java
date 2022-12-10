package lotto.validator;

import lotto.view.ErrorMessage;

public class ValidatorPrice {


    private static final int CHECK = 1000;
    private static final int ZERO = 0 ;


    public static void ValidatorPriceLimit(int purcharsePrice){
        if(purcharsePrice % CHECK != ZERO){
            throw new IllegalArgumentException(ErrorMessage.ONLY_1000_UNIT.getMessage());
        }
    }

    public static void ValidatorPriceNotEmpty(int purcharsePrice){
        if(purcharsePrice == ZERO){
            throw new IllegalArgumentException(ErrorMessage.PRICE_NOT_ZERO.getMessage());
        }
    }

}
