/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTH4.Bai8;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
    ArrayList<HinhPhang> hinh = new ArrayList<>();
    HinhVuong hv = new HinhVuong();
    HinhTron ht = new HinhTron();
    HinhChuNhat hcn = new HinhChuNhat();
    hinh.add(hv);
    hinh.add(ht);
    hinh.add(hcn);
    for(HinhPhang h: hinh){
        h.nhap();
    }
    for (HinhPhang h : hinh){
        h.xuat();
    }
    }
}
