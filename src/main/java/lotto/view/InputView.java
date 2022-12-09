package lotto.view;


import lotto.validator.ValidatorBonus;
import lotto.validator.ValidatorInput;
import lotto.validator.ValidatorPrice;
import lotto.validator.ValidatorWinngingNumber;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    public static int LottoInputPrice(){
        System.out.println(GameMessage.FIRST_START_MESSAGE.getgameMessage());
        String InputPirce = readLine();
        ValidatorInput.ValidatorAllSummary(InputPirce);
        int toIntPirce = Integer.parseInt(InputPirce);
        ValidatorPrice.ValidatorPriceLimit(toIntPirce);
        ValidatorPrice.ValidatorPriceNotEmpty(toIntPirce);


        return toIntPirce;
    }

    public List<Integer> WinningListNumber(){
        System.out.println(GameMessage.THIRD_INPUT_WINNINGNUMBER.getgameMessage());
        String InputWinning = readLine();
        ValidatorWinngingNumber.ValidatorWinningSummary(InputWinning);
        List<Integer> WinningNumber = TypeToList(InputWinning);
        return WinningNumber;
    }

    public List<Integer> TypeToList(String number){
//        String str = "";
//        List<Integer> list = Arrays.asList(str.split(","));
//        return list;
          return Arrays.stream(number.split(",")).map(Integer::parseInt).collect(Collectors.toList());
    }

    public int BonusNumber(){
        System.out.println(GameMessage.FOUR_INPUT_BONUSNUMBER.getgameMessage());
        String input = readLine();
        int toinput = Integer.parseInt(input);
        ValidatorBonus.ValidatorBonusTwoSummary(input);
        ValidatorInput.ValidatorAllSummary(input);
        return toinput;
    }

}
