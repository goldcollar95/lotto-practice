package lotto.view;

public class OutputView {

    public void resultCount(int number){
        int count = number / 1000;
        System.out.println(count + "개를 구매했습니다.");
    }
}
