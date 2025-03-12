package org.example.encapsulation;

import org.example.Main;
import org.example.encapsulation.Entity.NhanVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MainEncap {
    public static void MainEncapsulation(){
        System.out.printf("Hello and welcome!\n");
        ArrayList arr= new ArrayList<NhanVien>();
        for(int i=0;i<1;i++){
            NhapNV(arr);
        }

        XuatTTNV(arr);
    }


    public static Date StringToDate(String dob) throws ParseException {
        //Instantiating the SimpleDateFormat class
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        //Parsing the given String to Date object
        Date date = formatter.parse(dob);
        System.out.println("\nDate object value: "+date);
        return date;
    }


    public static void NhapNV(ArrayList<NhanVien> arr){
        Scanner sc= new Scanner(System.in);
        NhanVien nv= new NhanVien();
        System.out.println("\nNhap ma nhan vien");
        nv.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("\nNhap ten nhan vien");
        String name = sc.nextLine();
        nv.setHovaten(name);
        System.out.println("\nNhap ngay sinh dd-MM-yyyy");
        String dob= sc.nextLine();
        Date date = new Date();
        try {
            date = MainEncap.StringToDate(dob);
            nv.setBirhday(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        arr.add(nv);

//        Instant instant = date.toInstant();
//        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
//        LocalDate givenDate = zone.toLocalDate();
        //Calculating the difference between given date to current date.
//        Period period = Period.between(givenDate, LocalDate.now());
//        System.out.print("Hello "+name+" your current age is: ");
//        System.out.print(period.getYears()+" years "+period.getMonths()+" and "+period.getDays()+" days");

    }
    public static void XuatTTNV(ArrayList<NhanVien> arr){
        for (NhanVien nv:arr){
            System.out.println("STT Nhan vien "+ (arr.indexOf(nv)+1));
            nv.XuatNV();
        }
    }
}
