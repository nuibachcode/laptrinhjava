/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTH4.Bai9;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public abstract class KhachHang {
    protected String maKH;
    protected String hoTen;
    protected int ngay;
    protected int thang;
    protected int nam;
    protected int soLuong;
    protected int donGia;

    public KhachHang() {
    }

    public KhachHang(String maKH, String hoTen, int ngay, int thang, int nam, int soLuong, int donGia) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }  
    
    public int getNam() {
        return nam;
    }

    public int getThang() {
        return thang;
    }
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        
        System.out.print("Ma KH: ");
        maKH = sc.nextLine();
        System.out.print("Ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Ngay ra hoa don (ngay thang nam): ");
        ngay = sc.nextInt();
        thang = sc.nextInt();
        nam = sc.nextInt();
        System.out.print("So luong (KW): ");
        soLuong = sc.nextInt();
        System.out.print("Don gia: ");
        donGia = sc.nextInt();
        sc.nextLine(); 
    }
    abstract float thanhTien();
    public void xuat() {
        System.out.printf("%-10s %-20s %02d/%02d/%d %-10d %-10.2f %-15.2f",
                maKH, hoTen, ngay, thang, nam, soLuong,(float) donGia, thanhTien());
    }
}
