package lotto.validator;

import lotto.view.ErrorMessage;

public class ValidatorPrice {


    private final int CHECK = 1000;
    private final int ZERO = 0 ;


    public void ValidatorPriceLimit(int purcharsePrice){
        if(purcharsePrice % CHECK != ZERO){
            throw new IllegalArgumentException(ErrorMessage.ONLY_1000_UNIT.getMessage());
        }
    }

    public void ValidatorPriceNotEmpty(int purcharsePrice){
        if(purcharsePrice == ZERO){
            throw new IllegalArgumentException(ErrorMessage.PRICE_NOT_ZERO.getMessage());
        }
    }

}
