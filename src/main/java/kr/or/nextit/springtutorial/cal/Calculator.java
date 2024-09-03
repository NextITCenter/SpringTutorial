package kr.or.nextit.springtutorial.cal;

public interface Calculator {
    /**
     * factorial은 1부터 주어진 num까지 순차적으로 곱한 결과를 반환하는 메소드
     * factorial(5): 1 * 2 * 3 * 4 * 5 = 120
     * @param num
     * @return
     */
    long factorial(int num);
}
