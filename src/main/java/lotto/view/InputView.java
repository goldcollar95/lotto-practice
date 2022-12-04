package lotto.view;


import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    public int LottoInputPirce(){
        String InputPirce = readLine();
        int toIntPirce = Integer.parseInt(InputPirce);

        return toIntPirce;
    }
}
