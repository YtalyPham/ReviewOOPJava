package org.example.inheritance.Entity;

public class Animal {
    private int id;
    private String name;
    private String food;
    private String environment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public Animal(int id, String name, String food, String environment) {
        this.id = id;
        this.name = name;
        this.food = food;
        this.environment = environment;
    }

    public Animal() {
    }

    public void XuatAnimal(){
        System.out.println("\nId Animal: "+id);
        System.out.println("\nName Animal: "+name);
        System.out.println("\nFood Animal: "+food);
        System.out.println("\nEnvironment Animal: "+environment);
    }
}
