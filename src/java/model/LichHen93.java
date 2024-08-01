/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class LichHen93 {
    private int id;
    private String ngay;
    private String gio;
    private int KhachHang93ThanhVien93id;

    public LichHen93() {
    }

    public LichHen93(int id, String ngay, String gio, int KhachHang93ThanhVien93id) {
        this.id = id;
        this.ngay = ngay;
        this.gio = gio;
        this.KhachHang93ThanhVien93id = KhachHang93ThanhVien93id;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getGio() {
        return gio;
    }

    public void setGio(String gio) {
        this.gio = gio;
    }

    public int getKhachHang93ThanhVien93id() {
        return KhachHang93ThanhVien93id;
    }

    public void setKhachHang93ThanhVien93id(int KhachHang93ThanhVien93id) {
        this.KhachHang93ThanhVien93id = KhachHang93ThanhVien93id;
    }
    
}
