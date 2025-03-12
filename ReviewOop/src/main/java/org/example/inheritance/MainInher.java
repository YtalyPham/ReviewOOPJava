package org.example.inheritance;

import org.example.inheritance.Entity.Dog;

import java.util.Scanner;


public class MainInher {
    public static void MainInheritance(){
       Dog d = new Dog();
       NhapDog(d);
       XuatDog(d);

    }
    public static Dog NhapDog(Dog d){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Id: ");
        d.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Input name: ");
        d.setName(sc.nextLine());
        System.out.println("Input food: ");
        d.setFood(sc.nextLine());
        System.out.println("Input environment: ");
        d.setEnvironment(sc.nextLine());
        System.out.println("Input birthtype: ");
        d.setBirthType(sc.nextLine());
        return d;
    }
    public static void XuatDog(Dog d){
        System.out.println("\nInput Id: "+d.getId());
        System.out.println("\nInput name: "+d.getName());
        System.out.println("\nInput environment: "+d.getEnvironment());
        System.out.println("\nInput birthtype: "+d.getBirthType());

    }


}
