/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTH4.Bai7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SinhVien {
    private String maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;
    private float diemTB;
    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
        this.diemTB = (diemLT+diemTH)/2;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public float getDiemTB() {
        return diemTB;
    }
    
    public void nhap(Scanner sc){
        System.out.print("nhap ma sinh vien: ");
        maSV = sc.nextLine();
        System.out.print("nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("nhap diem ly thuyet: ");
        diemLT = sc.nextFloat();
        sc.nextLine();
        System.out.print("nhap diem thuc hanh: ");
        diemTH = sc.nextFloat();
        sc.nextLine();
        diemTB = (diemLT+diemTH)/2;
    }
    public void inTieuDe(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n","ma sv","ho ten","diem LT","diem Th","diem Tb","ket qua");
    }
    public void inThongTin(){
        String ketQua = (diemTB>=5) ? "dau":"rot";
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n",maSV,hoTen,diemLT,diemTH,diemTB,ketQua);
    }
    
    @Override
    public String toString(){
        return String.format("%-15s %-15s %-15s %-15s %-15s %n",maSV,hoTen,diemLT,diemTH,diemTB);
    }
    
    
    public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList<>();
        SinhVien svkt = new SinhVien();
        SinhVien sv1 = new SinhVien("m01","bach sy nui",8,9);
        SinhVien sv2 = new SinhVien("m02","Truong Van Phong",8,2);
        SinhVien sv3 = new SinhVien("m03","Nguyen Tra My",6,9);
        list.add(sv1);
        list.add(sv2);
        list.add(sv3);
        
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien a, SinhVien b) {
                String tenA = a.getHoTen().substring(a.getHoTen().lastIndexOf(" ") + 1);
                String tenB = b.getHoTen().substring(b.getHoTen().lastIndexOf(" ") + 1);
                String tenC = b.getHoTen().substring(b.getHoTen().lastIndexOf(" ")+1);
                int cmp = tenA.compareToIgnoreCase(tenB);
                
                if (cmp == 0) {
                    return Double.compare(b.getDiemLT(), a.getDiemLT());
                }
                return cmp;
            }
        });
         SinhVien maxSV = Collections.max(list, Comparator.comparingDouble(SinhVien::getDiemTB));
         SinhVien minSV = Collections.min(list,Comparator.comparingDouble(SinhVien::getDiemTB));
         svkt.inTieuDe();
         for(SinhVien sv : list){
         sv.inThongTin();
        }
         System.out.println("danh sach sinh vien co diem trung binh lon nhat la: ");
         for(SinhVien s :list){
             if(s==maxSV)
                 System.out.println(maxSV);
             
         }
        
    }
}
