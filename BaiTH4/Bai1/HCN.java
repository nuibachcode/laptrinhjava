/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTH4.Bai1;


import java.util.Scanner;

/**
 *
 * @author admin
 */
public class HCN {
    private int cd;
    private int cr;

    public HCN() {
    }
    public HCN(int cd, int cr) {
        this.cd = cd;
        setCr(cr);
    }
    public void setCr(int cr) {
    if (cr >= cd) {
        throw new IllegalArgumentException("Chieu rong phai nho hon chieu dai!");
    } else {
        this.cr = cr;
    }
}
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu dai hcn: ");
        cd = sc.nextInt();
        System.out.print("nhap chieu rong hcn: ");
        cr = sc.nextInt();
        setCr(cr);
    }
    public int dienTich(){
        return this.cd*this.cr;
    }
    public int chuVi(){
        return (this.cd+this.cr)*2;
    }
    public void inTieuDe(){
        System.out.printf("%-15s %-15s %-15s %-15s%n","Chieu Dai","Chieu Rong","Chu Vi","Dien Tich" );
        
    }
    public void inThongTin(){
        System.out.printf("%-15s %-15s %-15s %-15s%n",cd,cr,chuVi(),dienTich());
    }
    public static void main(String[] args) {
        HCN hcn = new HCN(3,2);
        //hcn.nhap();
        hcn.inTieuDe();
        hcn.inThongTin();
    }
}
