package kr.or.nextit.springtutorial.cafe;

public class Barista {
    private CoffeeMachine coffeeMachine;

    public Barista(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public Coffee makeCoffee() {
        return coffeeMachine.brew();
    }
}
