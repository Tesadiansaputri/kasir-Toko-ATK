/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import koneksi.Koneksi;
import model.User;

/**
 *
 * @author ADVAN
 */
public class UserDAO {
    public User login(String username, String password) {
        User user = null;

        String sql = "SELECT * FROM tb_user WHERE username = ? AND password = ?";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                user = new User(
                    rs.getInt("id_user"),
                    rs.getString("nama"),
                    rs.getString("jabatan"),
                    rs.getString("username"),
                    rs.getString("password")
                );
            }

        } catch (SQLException e) {
            System.out.println("❌ Error di UserDAO.login(): " + e.getMessage());
            System.out.println("Login attempt: " + username + " | " + password);

        }
         if (user != null) {
            System.out.println("✅ Login berhasil untuk: " + user.getNama());
        } else {
            System.out.println("⚠ Login gagal untuk username: " + username);
        }

        return user;
    }
    public boolean insertUser(User user) {
    String sql = "INSERT INTO tb_user (nama, jabatan, username, password) VALUES (?, ?, ?, ?)";

    try (Connection conn = Koneksi.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, user.getNama());
        stmt.setString(2, user.getJabatan());
        stmt.setString(3, user.getUsername());
        stmt.setString(4, user.getPassword());

        int rowsInserted = stmt.executeUpdate();
        return rowsInserted > 0;

    } catch (SQLException e) {
        System.out.println("❌ Error insertUser(): " + e.getMessage());
        return false;
    }
}

}


