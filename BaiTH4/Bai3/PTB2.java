/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTH4.Bai3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class PTB2 {
    private int a;
    private int b;
    private int c;
    
    public PTB2() {
    }

    public PTB2(int a, int b, int c) {
        setA(a);
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        if(a==0){
            throw new IllegalArgumentException("a phai khac 0");
        }
        this.a = a;
    }
    public void nhap(Scanner sc){
        System.out.print("nhap a: ");
        a = sc.nextInt();
        setA(a);
        System.out.print("nhap b: ");
        b=sc.nextInt();
        System.out.print("nhap c: ");
        c=sc.nextInt();
    }
    public void GPT(){
        int denta = b*b-4*a*c;
        float x1,x2;
        if(denta>0){
            x1 =(float) (-b +Math.sqrt(denta))/(2*a);
            x2 =(float) (-b -Math.sqrt(denta))/(2*a);
            System.out.printf("nghiem cua phuong trinh la: x1 =%.2f ,x2 =%.2f",x1,x2);
        }
        else if(denta ==0){
            x1 = x2 = (float)(-b/2*a);
            System.out.printf("nghiem cua phuong trinh la: x = %s",x1);
        }
        else
            System.out.println("phuong trinh vo nghiem!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PTB2 pt = new PTB2();
        pt.nhap(sc);
        pt.GPT();
    }
}
