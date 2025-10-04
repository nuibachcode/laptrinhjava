/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTH4.Bai4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class XeDemo {
        
    
    public static void main(String[] args) {
        Xe x1 = new Xe("Nguyen Thi Loan","Future Neo",100,35000000);
        Xe x2 = new Xe("Le Minh Tinh","Ford Ranger",1500,25000000);
        Xe x3 = new Xe("Nguyen Minh Triet","Landscape",1500,50000000);
        ArrayList<Xe> xee = new ArrayList<>();
        xee.add(x1);
        xee.add(x2);
        xee.add(x3);
//        int n;
//        System.out.print("nhap so luong dang ki: ");
//        Scanner sc = new Scanner(System.in);
//        n= sc.nextInt();
        Xe xe = new Xe();
//        xe.nhap(n);
        xe.inTieuDe();
        for(Xe c: xee){
            System.out.printf("%-25s %-15s %10s %15.0f %10.0f %n",c.getTenChuXe(),
        c.getLoaiXe(),c.getDungTich(),c.getTriGia(),c.getThue());
    }
}
}
