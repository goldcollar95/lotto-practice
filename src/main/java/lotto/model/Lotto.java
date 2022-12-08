package lotto.model;

import lotto.view.ErrorMessage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(ErrorMessage.LOTTO_SIX_NUMBER_POSSBLITY.getMessage());
        }
    }
    // TODO: 추가 기능 구현

    public boolean LottoPrice(int LottoPrice){
        if(LottoPrice % 1000 == 0){
            return true;
        }
        return false;

    }

    public void totalResult(int LottoPrice){

    }

    public void ValidatorRange(List<Integer> number){
        for(Integer one : number){
            if(one < 1 || one > 45){
                throw new IllegalArgumentException(ErrorMessage.LOTTO_RANDOM_NUMBER_RANGE.getMessage());
            }
        }
    }

    public void ValidatorDuplicate(List<Integer> number){
        Set<Integer> hash = new HashSet<>(number);
        if(hash.size() != number.size()){
            throw new IllegalArgumentException(ErrorMessage.LOTTO_OVERLAP_INPUT.getMessage());
        }
    }

}
