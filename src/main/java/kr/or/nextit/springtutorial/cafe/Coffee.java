package kr.or.nextit.springtutorial.cafe;

public class Coffee {
    private String title;
    private double capacity;

    public Coffee(String title, double capacity) {
        this.title = title;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "title='" + title + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
