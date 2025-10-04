/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTH4.Bai9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
         ArrayList<KhachHang> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("\n1. Nhap hoa don VN");
            System.out.println("2. Nhap hoa don NN");
            System.out.println("3. Xuat tat ca hoa don");
            System.out.println("4. Tong san luong tung loai");
            System.out.println("5. Trung binh thanh tien KH nuoc ngoai");
            System.out.println("6. Hoa don thang 9/2013");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            int chon = sc.nextInt(); sc.nextLine();
            switch (chon) {
                 case 1 -> {
                    KhachHangVietNam vn = new KhachHangVietNam();
                    vn.nhap();
                    list.add(vn);
                }
                case 2 -> {
                    KhachHangNuocNgoai nn = new KhachHangNuocNgoai();
                    nn.nhap();
                    list.add(nn);
                }
                case 3 -> {
                    System.out.println("=== DANH SACH HOA DON ===");
                    for (KhachHang hd : list)
                        hd.xuat();
                }
                case 4 -> {
                    double tongVN = 0, tongNN = 0;
                    for (KhachHang hd : list) {
                        if (hd instanceof KhachHangVietNam)
                            tongVN += hd.soLuong;
                        else
                            tongNN += hd.soLuong;
                    }
                    System.out.println("Tong san luong KH VN: " + tongVN);
                    System.out.println("Tong san luong KH NN: " + tongNN);
                }
                case 5 -> {
                    double tong = 0; int dem = 0;
                    for (KhachHang hd : list) {
                        if (hd instanceof KhachHangNuocNgoai) {
                            tong += hd.thanhTien();
                            dem++;
                        }
                    }
                    System.out.println("TB thanh tien KH NN = " + (dem == 0 ? 0 : tong / dem));
                }
                case 6 -> {
                    System.out.println("=== HOA DON THANG 9/2013 ===");
                    for (KhachHang hd : list) {
                        if (hd.getThang() == 9 && hd.getNam() == 2013)
                            hd.xuat();
                    }
                }
                case 0 -> System.exit(0);
            }
        }
}
}
