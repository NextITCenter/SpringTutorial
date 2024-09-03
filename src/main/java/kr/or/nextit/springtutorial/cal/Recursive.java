package kr.or.nextit.springtutorial.cal;

public class Recursive implements Calculator {
    @Override
    public long factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
