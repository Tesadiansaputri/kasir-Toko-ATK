/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADVAN
 */
public class User {
    private int id_user;
    private String nama;
    private String jabatan;
    private String username;
    private String password;

    // 🔹 Constructor kosong (biar bisa bikin objek tanpa isi dulu)
    public User() {}

    // 🔹 Constructor lengkap (biar gampang bikin objek langsung isi semua data)
    public User(int id_user, String nama, String jabatan, String username, String password) {
        this.id_user = id_user;
        this.nama = nama;
        this.jabatan = jabatan;
        this.username = username;
        this.password = password;
    }

    // 🔹 Getter dan Setter (buat ambil & ubah nilai variabel)
    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
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
}

