/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.NhaCungCap93;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class NhaCungCap93DAO extends DBContext{
    public NhaCungCap93 findById(int id) {
        NhaCungCap93 ncc = new NhaCungCap93();
        String sql = "SELECT * FROM NhaCungCap93 WHERE id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                ncc = new NhaCungCap93(
                    resultSet.getInt("id"),
                    resultSet.getString("ten"),
                    resultSet.getString("sdt"),
                    resultSet.getString("email"),
                    resultSet.getString("dia_chi")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ncc;
    }
}
