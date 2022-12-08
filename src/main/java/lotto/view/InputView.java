package lotto.view;


import lotto.validator.ValidatorInput;
import lotto.validator.ValidatorPrice;

import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    public int LottoInputPirce(){
        System.out.println(GameMessage.FIRST_START_MESSAGE.getgameMessage());
        String InputPirce = readLine();
        ValidatorInput.ValidatorAllSummary(InputPirce);
        int toIntPirce = Integer.parseInt(InputPirce);
        ValidatorPrice.ValidatorPriceLimit(toIntPirce);
        ValidatorPrice.ValidatorPriceNotEmpty(toIntPirce);


        return toIntPirce;
    }

    public List<String> WinningListNumber(List<String> number){
        System.out.println(GameMessage.THIRD_INPUT_WINNINGNUMBER.getgameMessage());
        String InputWinning = readLine();

        List<String> toList = TypeToList(InputWinning);
        return toList;
    }

    public List<String> TypeToList(String number){
        String str = "";
        List<String> list = Arrays.asList(str.split(","));
        return list;
    }

    public int BonusNumber(int bonuseNum){
        System.out.println(GameMessage.FOUR_INPUT_BONUSNUMBER.getgameMessage());
        String input = readLine();
        int toinput = Integer.parseInt(input);
        return toinput;
    }

}
