// Packages
package br.inatel.exzumbis.zumbis;

public class Zumbis {

    // Atributos
    private String name;
    private int age;
    private double height;
    private double weight;
    private int wickedness;

    // Construtor
    public Zumbis() {
    }

    // Métodos
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getWickedness() {
        return wickedness;
    }

    public void setWickedness(int wickedness) {
        this.wickedness = wickedness;
    }

    public String whoop() {
        return "Hahahahaha...";
    }

    public String run() {
        return "Run...run...run...";
    }

    public String devour() {
        return "Uhuhuhuhuh...";
    }
}