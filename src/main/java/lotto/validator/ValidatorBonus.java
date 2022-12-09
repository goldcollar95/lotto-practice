package lotto.validator;

import lotto.view.ErrorMessage;

public class ValidatorBonus {

    public static void ValidatorBonusTwoSummary(String BonusNumber){
        ValidatorBonusLength(BonusNumber);
        ValidatorBonusRange(BonusNumber);
    }


    public void ValidatorBonusLength(String BonusNumber){
        int[] checkpoint = new int[]{Integer.parseInt(BonusNumber)};

        if(checkpoint.length != 1){
            throw new IllegalArgumentException(ErrorMessage.BONUS_INPUT_LENGTH.getMessage());
        }
    }



    public void ValidatorBonusRange(String BonusNumber){
        int[] checkpoint = new int[]{Integer.parseInt(BonusNumber)};

        if(checkpoint[0]<1 || checkpoint[0]>45){
            throw new IllegalArgumentException(ErrorMessage.BONUS_INPUT_RANGE.getMessage());
        }
    }

}
