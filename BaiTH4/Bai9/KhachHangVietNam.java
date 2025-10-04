/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTH4.Bai9;

/**
 *
 * @author admin
 */
public class KhachHangVietNam extends KhachHang{
    private String doiTuong;
    private int dinhMuc;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam( String maKH, String hoTen, int ngay, int thang, int nam, int soLuong, int donGia,String doiTuong, int dinhMuc) {
        super(maKH, hoTen, ngay, thang, nam, soLuong, donGia);
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
    }
     public void nhap() {
        super.nhap();
        System.out.print("Doi tuong (sinh hoat/kinh doanh/san xuat): ");
        doiTuong = sc.nextLine();
        System.out.print("Dinh muc: ");
        dinhMuc = sc.nextInt();
        sc.nextLine();
    }
    @Override
    public float thanhTien(){
            float tien;
            if(soLuong<=dinhMuc){
                tien = soLuong *donGia;
            }
            else{
                tien = (float)(donGia*dinhMuc+(soLuong-dinhMuc)*donGia*2.5);
            }
            return tien;
        }
    public void xuat(){
        super.xuat();
        System.out.printf("%-15s %-15s",doiTuong,dinhMuc);
    }
    }
    
    

