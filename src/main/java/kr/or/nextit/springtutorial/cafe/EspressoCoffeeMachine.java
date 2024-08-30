package kr.or.nextit.springtutorial.cafe;

public class EspressoCoffeeMachine implements CoffeeMachine {
    @Override
    public Coffee brew() {
        System.out.println("Brewing Espresso Coffee...");
        return new Coffee("에스프레소", 250);
    }
}
