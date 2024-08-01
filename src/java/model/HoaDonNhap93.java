/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class HoaDonNhap93 extends HoaDon93{
    private int HoaDon93id;
    private int NhaCungCap93id;

    public HoaDonNhap93(int HoaDon93id, int NhaCungCap93id) {
        this.HoaDon93id = HoaDon93id;
        this.NhaCungCap93id = NhaCungCap93id;
    }

    public HoaDonNhap93(int HoaDon93id, int NhaCungCap93id, int id, String ngay, String gio) {
        super(id, ngay, gio);
        this.HoaDon93id = HoaDon93id;
        this.NhaCungCap93id = NhaCungCap93id;
    }

    public int getHoaDon93id() {
        return HoaDon93id;
    }

    public void setHoaDon93id(int HoaDon93id) {
        this.HoaDon93id = HoaDon93id;
    }

    public int getNhaCungCap93id() {
        return NhaCungCap93id;
    }

    public void setNhaCungCap93id(int NhaCungCap93id) {
        this.NhaCungCap93id = NhaCungCap93id;
    }
    
}
