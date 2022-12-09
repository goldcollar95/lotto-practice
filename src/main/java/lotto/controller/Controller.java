package lotto.controller;


import lotto.model.LottoNumbers;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.List;

public class Controller {

    public void process() {
        int inputPrice = InputView.LottoInputPrice();
        OutputView.resultCount(OutputView.divideCount(inputPrice));
        List<List<Integer>> lottos = LottoNumbers.LottoRandomNumbers(OutputView.divideCount(inputPrice));

    }
}
