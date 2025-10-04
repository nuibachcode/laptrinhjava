/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTH4.Bai8;

/**
 *
 * @author admin
 */
public class HinhTron extends HinhPhang {
    float r;

    public HinhTron() {
    }

    public HinhTron(float r) {
        this.r = r;
    }
    
    @Override
    void nhap() {
        System.out.print("nhap ban kinh: ");
        r = sc.nextFloat();
    }

    @Override
    void xuat() {
        System.out.println("thong tin hinh tron la: ");
        System.out.printf("%-15s %-15.2f %-15.2f %n",r,tinhCV(),tinhDT());
    }

    @Override
    float tinhCV() {
        return (float)(r*2*Math.PI);
    }

    @Override
    float tinhDT() {
        return (float)(r*r*Math.PI);
    }
    
}
