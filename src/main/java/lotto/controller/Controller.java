package lotto.controller;

import lotto.view.InputView;

import java.util.List;
import java.util.stream.Collectors;

public class Controller {
    InputView inputView = new InputView();
    public int compareResult(List<String> WinningNumber, List<String> RandomsNumber){

        int result = 0;
        List<String> Winning = WinningNumber.stream().collect(Collectors.toList());
        List<String> Randoms = RandomsNumber.stream().collect(Collectors.toList());

        int count = 0;
        for(String sr : RandomsNumber){
            if(RandomsNumber.contains(WinningNumber)){
                result = count++;
            }
        }
        return result;
    }
}
