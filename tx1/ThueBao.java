/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tx1;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class ThueBao {
    protected String maThueBao;
    protected String chuThueBao;
    protected String diaChi;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thuê bao: ");
        maThueBao = sc.nextLine();
        System.out.print("Nhập chủ thuê bao: ");
        chuThueBao = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
    }

    public void xuat() {
        System.out.printf("%-10s %-20s %-20s", maThueBao, chuThueBao, diaChi);
    }

    public String getMaThueBao() {
        return maThueBao;
    }
    
}

