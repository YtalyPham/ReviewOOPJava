package org.example.encapsulation.Entity;

import java.util.Date;

public class NhanVien {
    private int Id;
    private String Hovaten;
    private Date Birhday;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getHovaten() {
        return Hovaten;
    }

    public void setHovaten(String hovaten) {
        Hovaten = hovaten;
    }

    public Date getBirhday() {
        return Birhday;
    }

    public void setBirhday(Date birhday) {
        Birhday = birhday;
    }

    public NhanVien(int id, String hovaten, Date birhday) {
        Id = id;
        Hovaten = hovaten;
        Birhday = birhday;
    }

    public NhanVien() {
    }
    public void XuatNV(){
        System.out.print("\nMa nhan vien: "+ Id);
        System.out.print("\nHo va ten nhan vien: "+Hovaten);
        System.out.print("\nNgay sinh nhan vien: "+Birhday);
    }
}
