/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTH4.Bai9;

/**
 *
 * @author admin
 */
public class KhachHangNuocNgoai extends KhachHang{
    private String quocTich;

    public KhachHangNuocNgoai() {
    }

    public KhachHangNuocNgoai( String maKH, String hoTen, int ngay, int thang, int nam, int soLuong, int donGia,String quocTich) {
        super(maKH, hoTen, ngay, thang, nam, soLuong, donGia);
        this.quocTich = quocTich;
    }
    public float thanhTien(){
        return soLuong*donGia;
    }
    public void nhap() {
        super.nhap();
        System.out.print("Quoc tich: ");
        quocTich = sc.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.printf("%-15s",quocTich);
    }
}
