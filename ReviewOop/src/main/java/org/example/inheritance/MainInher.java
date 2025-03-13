package org.example.inheritance;

import org.example.inheritance.Entity.Dog;

import java.util.Scanner;


public class MainInher {
    public static void MainInheritance(){
       Dog d = new Dog();
       NhapDog(d);
       XuatDog(d);
       Mosquito m= new Mosquito();
       NhapMosquito(m);
       XuatMosquito(m);

    }
    public static Mosquito NhapMosquito(Mosquito m){
        Scanner sc= new Scanner(System.in);
        System.out.println("===Mosquito===");
        System.out.println("Input Id: ");
        m.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Input name: ");
        m.setName(sc.nextLine());
        System.out.println("Input food: ");
        m.setFood(sc.nextLine());
        System.out.println("Input environment: ");
        m.setEnvironment(sc.nextLine());
        return m;
    }
    public static void XuatMosquito(Mosquito m){
        System.out.println("\nInput Id: "+m.getId());
        System.out.println("\nInput name: "+m.getName());
        System.out.println("\nInput environment: "+m.getEnvironment());
        m.Bite();
    }

    public static Dog NhapDog(Dog d){
        Scanner sc = new Scanner(System.in);
        System.out.println("===Dog===");
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
