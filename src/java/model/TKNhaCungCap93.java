/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class TKNhaCungCap93 {

    public TKNhaCungCap93(int NhaCungCap93id, int so_luong) {
        this.NhaCungCap93id = NhaCungCap93id;
        this.so_luong = so_luong;
    }
    
    private int so_luong;
    private int NhaCungCap93id;

    public TKNhaCungCap93() {
    }

    public int getNhaCungCap93id() {
        return NhaCungCap93id;
    }

    public void setNhaCungCap93id(int NhaCungCap93id) {
        this.NhaCungCap93id = NhaCungCap93id;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }
}
