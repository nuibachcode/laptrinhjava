/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTH4.Bai2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class HinhTron {
    private float bk;
    Scanner sc = new Scanner(System.in);
    public HinhTron() {
    }

    public HinhTron(float bk) {
        setBk(bk);
    }

    public void setBk(float bk) {
        if(bk<=0){
            throw new IllegalAccessError("ban kinh phai lon hon 0");
        }
        else{
            this.bk = bk; 
        }
    }
    public void nhap(){
        bk = sc.nextFloat();
        setBk(bk);
    }
    public float chuVi(){
        return (float )( this.bk*2*Math.PI);
    }
    public float dienTich(){
        return (float)(this.bk * this.bk *Math.PI);
    }
    public void inTieuDe(){
        System.out.printf("%-15s %-15s %-15s %n","ban kinh","chu vi","dien tich");
    }
    public void inThongTin(){
        System.out.printf("%-15s %-15.2f %-15.2f %n",bk,chuVi(),dienTich());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<HinhTron> ht = new ArrayList<>();
        System.out.println("nhap so hinh tron: ");
        int n = sc.nextInt();
        for (int i = 1;i<=n;i++){
            System.out.printf("nhap bk hinh tron %s :",i);
            HinhTron h = new HinhTron();
            h.nhap();
            ht.add(h);
        }
        if(!ht.isEmpty())
        {
            ht.get(0).inTieuDe();
        }
        for(HinhTron H: ht){
            H.inThongTin();
            System.out.println("");
        }
}
}
