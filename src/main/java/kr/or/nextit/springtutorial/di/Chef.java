package kr.or.nextit.springtutorial.di;

public class Chef {
    private String name;
    private int age;

    public Chef() {
    }

    public Chef(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
