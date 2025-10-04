/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTH4.Bai6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class NhanVien {
    private String maNV;
    private int soSP;

    public NhanVien() {
    }

    public NhanVien(String maNV, int soSP) {
        this.maNV = maNV;
        setSoSP(soSP);
    }

    public String getMaNV() {
        return maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setSoSP(int soSP) {
        if(soSP<0){
            this.soSP = 0;
        }
        else{
            this.soSP = soSP;
        }
        
    }
    public boolean coVuotChuan(){
        return (soSP>500);
    }
    public String getTongKet(){
        if(coVuotChuan()){
            return "vuot";
    }
        else{
            return "";
        }
}   
    public int getLuong(){
        if(coVuotChuan()){
            return 500 *20000+(soSP-500)*30000;
        }
        else
            return 20000*soSP;
    }
    public void xuatTieuDe(){
        System.out.printf("%-30s %-30s %-30s %-30s%n ","ma nhan vien","so san pham","luong","tong ket");
    }
    public void inDL(){
        System.out.printf("%-30s %-30s %-30s %-30s%n ",maNV,soSP,getLuong(),getTongKet());
    }
    public static void main(String[] args) {
        ArrayList<NhanVien> arraynv = new ArrayList<>();
        NhanVien nv = new NhanVien();
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=2;i++){
            System.out.printf("nhap nhan vien thu %s: %n",i);
            System.out.print("nhap ma nhan vien: ");
            String manv = sc.nextLine();
            System.out.println("nhap so luong san pham: ");
            int sosp = sc.nextInt();
            sc.nextLine();
            NhanVien nvm = new NhanVien(manv,sosp);
            arraynv.add(nvm);
        }
        nv.xuatTieuDe();
        for(NhanVien n: arraynv){
            if(n.coVuotChuan()){
            n.inDL();
                
            }
        }
    }
}
