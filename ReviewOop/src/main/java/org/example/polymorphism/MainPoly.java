package org.example.polymorphism;

import org.example.polymorphism.poverloading.Adder;
import org.example.polymorphism.poverriding.Circle;
import org.example.polymorphism.poverriding.Retangle;
import org.example.polymorphism.poverriding.Triangle;
import org.example.polymorphism.pupcasting.*;

import java.util.Scanner;

public class MainPoly {
    public static void MainPolymorphism(){
        System.out.println("===Upcasting===");
        Bank bidv= new BIDV();
        Bank scb= new SCB();
        Bank tcb= new TCB();
        Bank agr= new AGR();
        System.out.println("\nBIDV: "+ bidv.getRateofInterest());
        System.out.println("\nSCB: "+ scb.getRateofInterest());
        System.out.println("\nTCB: "+ tcb.getRateofInterest());
        System.out.println("\nAGR: "+ agr.getRateofInterest());

        System.out.println("\n===Overloading===");
        Adder a= new Adder();
        System.out.println("\n===Same add in class===");
        System.out.println("\nAdd 2: "+ a.add(1,2));
        System.out.println("\nAdd 3: "+ a.add(1,2,3));
        System.out.println("\n===Same add in class with different type method===");
        System.out.println("\nAdd int: "+ a.add(1,2));
        System.out.println("\nAdd double: "+ a.add(1.5,2.5));
        System.out.println("\n===Same add in class with ep kieu long int type method===");
        System.out.println("\nSum int: "); a.sum(1,2);
        System.out.println("\nSum long: "); a.add(1.5,2.5);

        System.out.println("\n===Overriding===");
        Circle circle= new Circle();
        Retangle retangle= new Retangle();
        Triangle triangle= new Triangle();
        circle.shape();
        retangle.shape();
        triangle.shape();

    }
}
