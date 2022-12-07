package lotto.view;


import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    public int LottoInputPirce(){
        String InputPirce = readLine();
        int toIntPirce = Integer.parseInt(InputPirce);

        return toIntPirce;
    }

    public List<String> WinningListNumber(List<String> number){
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
        String input = readLine();
        int toinput = Integer.parseInt(input);
        return toinput;
    }

}
