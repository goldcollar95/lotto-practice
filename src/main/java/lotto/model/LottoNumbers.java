package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LottoNumbers {


    public List<Integer> LottoRandomNumber(){
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);

        return numbers.stream().sorted().collect(Collectors.toList());
    }


    public List<List<Integer>> LottoRandomNumbers(int price){
        List<List<Integer>> RandomNumbers = new ArrayList<>();
        for(int index = 0; index < price; index++){

        List<Integer> Number = LottoRandomNumber();
        RandomNumbers.add(Number);
        }
        return RandomNumbers;
    }
}
