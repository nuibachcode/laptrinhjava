/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTH4.Bai8;



/**
 *
 * @author admin
 */
public class HinhChuNhat extends HinhPhang {
    float cd;
    float cr;

    public HinhChuNhat() {
    }

    public HinhChuNhat(float cd, float cr) {
        this.cd = cd;
        this.cr = cr;
    }
    
    @Override
    void nhap() {
        System.out.println("nhap chieu dai: ");
        cd = sc.nextFloat();
        sc.nextLine();
        System.out.println("nhap chieu rong: ");
        cr = sc.nextFloat();
    }

    @Override
    void xuat() {
        System.out.println("thong tin hinh chu nhat la: ");
        System.out.printf("%-15s %-15s %-15s %-15s %n",cd,cr,tinhCV(),tinhDT());
    }

    @Override
    float tinhCV() {
        return cd*cr;
    }

    @Override
    float tinhDT() {
        return (cd+cr)*2;
    }
    
}
