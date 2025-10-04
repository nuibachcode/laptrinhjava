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
public class Xe {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private float triGia;
    private float thue;
    Scanner sc = new Scanner(System.in);
    public Xe() {
    }

    public Xe(String tenChuXe, String loaiXe, int dungTich, float triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
        setThue(thue);
    }

    public void setThue(float thue) {
        if(dungTich<100){
            this.thue = (float) (0.01*triGia);
        }
        else if(100<=dungTich&&dungTich<=200){
            this.thue = (float) (0.03*triGia);
        }
        else{
            this.thue = (float) (0.05*triGia);
        }
    
    }
    public String getTenChuXe() {
        return tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public double getThue() {
        return thue;
    }

    ArrayList<Xe> xe = new ArrayList<>();
    public void nhap(int n){
        for(int i=1;i<=n;i++){
            System.out.printf("nhap xe thu %s :%n",i);
            System.out.print("ten chu xe: ");
            tenChuXe = sc.nextLine();
            System.out.print("loai xe: ");
            loaiXe = sc.nextLine();
            System.out.print("nhap dung tich: ");
            dungTich = sc.nextInt();
            sc.nextLine();
            System.out.println("nhap tri gia: ");
            triGia = sc.nextFloat();
            sc.nextLine();
            Xe x = new Xe(tenChuXe,loaiXe,dungTich,triGia);
            xe.add(x);
        }
    }
    public void inTieuDe(){
        System.out.printf("%-30s %-30s %-30s %-30s %-30s %n","ten chu xe",
        "loai xe","dung tich","tri gia","thue phai nop");
    }
    public void inThongTin(){
        for(Xe x : xe){
            System.out.printf("%-30s %-30s %-30s %-30s %-30s %n",x.tenChuXe,
        x.loaiXe,x.dungTich,x.triGia,x.thue);
        }
    }
    
    
    
}
