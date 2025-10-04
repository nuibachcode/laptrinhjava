/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTH4.Bai8;

/**
 *
 * @author admin
 */
public class HinhVuong extends HinhPhang{
        private float canh;

    public HinhVuong() {
    }

    public HinhVuong(float canh) {
        this.canh = canh;
    }
        
    @Override
    void nhap() {
        System.out.print("nhap canh cua hinh vuong: ");
        canh = sc.nextFloat();
    }

    @Override
    void xuat() {
        System.out.println("thong tin hinh vuong la: ");
        System.out.printf("%-15s %-15s %-15s %n",canh,tinhCV(),tinhDT());
    }

    @Override
    float tinhCV() {
        return canh *4;
    }

    @Override
    float tinhDT() {
        return canh *canh;
    }
    
}
