package lotto;

import lotto.controller.Controller;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        try{
            Controller lottoGame = new Controller();
            lottoGame.process();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
