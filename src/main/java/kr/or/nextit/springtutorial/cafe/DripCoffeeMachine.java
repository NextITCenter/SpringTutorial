package kr.or.nextit.springtutorial.cafe;

public class DripCoffeeMachine implements CoffeeMachine {
    @Override
    public Coffee brew() {
        System.out.println("Brewing Drip Coffee ...");
        return new Coffee("드립커피", 355);
    }
}
