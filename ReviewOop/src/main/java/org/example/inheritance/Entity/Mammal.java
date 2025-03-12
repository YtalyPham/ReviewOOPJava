package org.example.inheritance.Entity;

public class Mammal extends Animal{
    String birthType;

    public String getBirthType() {
        return birthType;
    }

    public void setBirthType(String birthType) {
        this.birthType = birthType;
    }

    public Mammal(int id, String name, String food, String environment, String birthType) {
        super(id, name, food, environment);
        this.birthType = birthType;
    }

    public Mammal(String birthType) {
        this.birthType = birthType;
    }

    public Mammal() {

    }

    public void XuatMammal(){
        System.out.println("\nBirthType la: "+birthType);
    }
}
