package lotto.model;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }


    public boolean LottoPrice(int LottoPrice){
        if(LottoPrice % 1000 == 0){
            return true;
        }
        return false;
    }
    // TODO: 추가 기능 구현
}
