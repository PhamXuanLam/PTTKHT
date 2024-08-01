/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.HoaDonNhap93;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonNhapDAO93 extends DBContext{
    public List<HoaDonNhap93> getDSHDNhap(int nhaCungCap93id, LocalDate start, LocalDate end) {
        List<HoaDonNhap93> result = new ArrayList<>();
        String query = "SELECT hdn.* FROM HoaDonNhap93 hdn "
                     + "JOIN HoaDon93 hd ON hdn.HoaDon93id = hd.id "
                     + "WHERE hdn.NhaCungCap93id = ? "
                     + "AND hd.ngay BETWEEN ? AND ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, nhaCungCap93id);
            preparedStatement.setDate(2, java.sql.Date.valueOf(start));
            preparedStatement.setDate(3, java.sql.Date.valueOf(end));
            
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                HoaDonNhap93 hoaDonNhap = new HoaDonNhap93(
                    resultSet.getInt("HoaDon93id"),  // Assuming you have a constructor in HoaDonNhap93 class
                    resultSet.getInt("NhaCungCap93id")
                    // Add other fields as necessary
                );
                result.add(hoaDonNhap);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }   
}
