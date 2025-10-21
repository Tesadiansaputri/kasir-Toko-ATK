package koneksi;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection conn;

    public static Connection getConnection() {
         
            try {
                // Ganti sesuai database kamu
                String url = "jdbc:mysql://localhost:3306/pos_db";
                String user = "root"; // username MySQL kamu
                String pass = "";     // password MySQL kamu (kosong jika default XAMPP)
                
                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("✅ Koneksi ke database berhasil!");
            } catch (SQLException e) {
                System.out.println("❌ Koneksi gagal: " + e.getMessage());
            }
    
            return conn;
    }

    public static void main(String[] args) {
        // Tes koneksi
        getConnection();
    }
}
