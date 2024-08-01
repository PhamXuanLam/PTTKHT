/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import model.TKNhaCungCap93;

/**
 *
 * @author Admin
 */
public class TKNCCDAO93 extends DBContext {

    // Phương thức lấy danh sách nhà cung cấp theo khoảng ngày
    public List<TKNhaCungCap93> getDSNCC(LocalDate start, LocalDate end) {
        List<TKNhaCungCap93> result = new ArrayList<>();
        
        // Câu lệnh để lọc nhà cung cấp theo khoảng thời gian và sắp xếp theo tổng số lượng
        String query2 = "SELECT ncc.id, ncc.ten, ncc.sdt, ncc.email, ncc.dia_chi, COALESCE(stats.tong_so_luong, 0) AS tong_so_luong "
                       + "FROM NhaCungCap93 ncc "
                       + "JOIN (SELECT hdn.NhaCungCap93id, COALESCE(SUM(hdnpt.so_luong), 0) AS tong_so_luong "
                       + "      FROM HoaDonNhapPhuTung93 hdnpt "
                       + "      JOIN HoaDonNhap93 hdn ON hdnpt.HoaDonNhap93HoaDon93id = hdn.HoaDon93id "
                       + "      JOIN HoaDon93 hd ON hdn.HoaDon93id = hd.id "
                       + "      WHERE hd.ngay BETWEEN ? AND ? "
                       + "      GROUP BY hdn.NhaCungCap93id) AS stats "
                       + "ON ncc.id = stats.NhaCungCap93id "
                       + "ORDER BY stats.tong_so_luong DESC";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(query2)) {
            preparedStatement.setDate(1, java.sql.Date.valueOf(start));
            preparedStatement.setDate(2, java.sql.Date.valueOf(end));
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int nhaCungCap93id = resultSet.getInt("id");
                int soLuong = resultSet.getInt("tong_so_luong");
                result.add(new TKNhaCungCap93(nhaCungCap93id, soLuong));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}

