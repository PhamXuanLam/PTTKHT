/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class ThanhVien93 {
    private int id;
    private String username;
    private String password;
    private String ho_ten;
    private String sdt;
    private String email;
    private String ghi_chu;
    private String ngay_sinh; 

    public ThanhVien93(){
    }
    
    public ThanhVien93(int id, String username, String password, String ho_ten, String sdt, String email, String ghi_chu, String ngay_sinh) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.ho_ten = ho_ten;
        this.sdt = sdt;
        this.email = email;
        this.ghi_chu = ghi_chu;
        this.ngay_sinh = ngay_sinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGhi_chu() {
        return ghi_chu;
    }

    public void setGhi_chu(String ghi_chu) {
        this.ghi_chu = ghi_chu;
    }

    public String getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(String ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }
}
