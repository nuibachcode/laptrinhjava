/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTH4.Bai8;

import java.util.Scanner;

/**
 *
 * @author admin
 */
abstract class HinhPhang {
    Scanner sc = new Scanner (System.in);
    abstract void nhap();
    abstract void xuat();
    abstract float tinhCV();
    abstract float tinhDT();
}
