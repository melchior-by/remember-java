package by.ekids.rememberjava;

public class Animal {
    private int age;
    private double weight;
    private String name;

    public Animal(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public Animal() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
