/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tx1;

/**
 *
 * @author admin
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThueBaoTheoDungLuong> ds = new ArrayList<>();

        System.out.print("Nhập số lượng thuê bao: ");
        int n = Integer.parseInt(sc.nextLine());

        // Ý 3: Nhập danh sách
        for (int i = 0; i < n; i++) {
            System.out.println("\nThuê bao thứ " + (i + 1) + ":");
            ThueBaoTheoDungLuong tb = new ThueBaoTheoDungLuong();
            tb.nhap();
            ds.add(tb);
        }

        System.out.println("\n--- Danh sách sau khi nhập ---");
        inDanhSach(ds);

        // Ý 4: Sắp xếp theo mã thuê bao
        Collections.sort(ds, Comparator.comparing(ThueBao::getMaThueBao));
        System.out.println("\n--- Danh sách sau khi sắp xếp ---");
        inDanhSach(ds);

        // Ý 5: Tìm kiếm
        System.out.print("\nNhập mã thuê bao cần tìm: ");
        String maTim = sc.nextLine();
        boolean found = false;
        for (ThueBaoTheoDungLuong tb : ds) {
            if (tb.getMaThueBao().equalsIgnoreCase(maTim)) {
                System.out.println("Thông tin thuê bao cần tìm:");
                System.out.printf("%-10s %-20s %-20s %-12s %-12s\n",
                        "Mã", "Chủ TB", "Địa chỉ", "Dung lượng", "Cước");
                tb.xuat();
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Không tìm thấy mã thuê bao này!");
    }

    private static void inDanhSach(ArrayList<ThueBaoTheoDungLuong> ds) {
        System.out.printf("%-10s %-20s %-20s %-12s %-12s\n",
                "Mã", "Chủ TB", "Địa chỉ", "Dung lượng", "Cước");
        for (ThueBaoTheoDungLuong tb : ds) {
            tb.xuat();
        }
    }
}
