package kr.or.nextit.springtutorial.cal;

public class ForLoop implements Calculator {
    @Override
    public long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
