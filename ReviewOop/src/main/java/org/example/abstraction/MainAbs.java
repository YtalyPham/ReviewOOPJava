package org.example.abstraction;

import org.example.abstraction.Entity.Cat;
import org.example.abstraction.Entity.Dog;

public class MainAbs {
    public static void mainAbstraction(){
        Dog d= new Dog();
        Cat c= new Cat();
        d.sound();
        c.sound();
    }
}
