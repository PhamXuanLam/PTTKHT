/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.LichHen93;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/**
 *
 * @author Admin
 */
public class LichHenDAO93 extends DBContext {

    public boolean create (LichHen93 lichHen) {
        String sql = "INSERT INTO LichHen93 (ngay, gio, KhachHang93ThanhVien93id) VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, lichHen.getNgay());
            preparedStatement.setString(2, lichHen.getGio());
            preparedStatement.setInt(3, lichHen.getKhachHang93ThanhVien93id());
            preparedStatement.executeUpdate();
            
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}