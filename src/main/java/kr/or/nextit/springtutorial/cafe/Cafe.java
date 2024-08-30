package kr.or.nextit.springtutorial.cafe;

public class Cafe {
    private Barista barista;
    private int balance;
    public Cafe(Barista barista) {
        this.barista = barista;
    }

    public Barista getBarista() {
        return barista;
    }

    public void setBarista(Barista barista) {
        this.barista = barista;
    }

    public int getBalance() {
        return balance;
    }

    public Coffee orderCoffee(int money) {
        balance += money;
        return barista.makeCoffee();
    }
}
