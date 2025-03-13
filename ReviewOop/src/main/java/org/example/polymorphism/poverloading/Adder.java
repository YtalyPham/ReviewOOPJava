package org.example.polymorphism.poverloading;

public class Adder {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a, double b){
        return a+b;
    }

    public void sum(int a,int b){
        System.out.println("Int invoked");
    }

    public void sum(long a,long b){
        System.out.println("Long invoked");
    }
}
