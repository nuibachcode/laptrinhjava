/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tx1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ThueBaoTheoDungLuong extends ThueBao implements NhapXuat {
    private double dungLuongMB;

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập dung lượng (MB): ");
        dungLuongMB = sc.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("  %-12.2f  %-12.2f\n", dungLuongMB, tinhCuoc());
    }

    public double tinhCuoc() {
        double cuoc = TIEN_THUE_BAO + dungLuongMB * 40;
        return cuoc > MUC_TRAN ? MUC_TRAN : cuoc;
    }
}

