/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.ThanhVien93;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Admin
 */
public class ThanhVienDAO93 extends DBContext{
    public ThanhVien93 login(String username, String password) {
        String query = "SELECT * FROM ThanhVien93 WHERE username = ? AND password = ?";
        
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet  = statement.executeQuery();
            if (resultSet.next()) {
                Date sqlDate = resultSet.getDate("ngay_sinh");
                String ngaySinh = (sqlDate != null) ? new SimpleDateFormat("yyyy-MM-dd").format(sqlDate) : null;
                
                return new ThanhVien93(
                    resultSet.getInt("id"),
                    resultSet.getString("username"),
                    resultSet.getString("password"),
                    resultSet.getString("ho_ten"),
                    resultSet.getString("sdt"),
                    resultSet.getString("email"),
                    resultSet.getString("ghi_chu"),
                    ngaySinh
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        return null;
    }
}
