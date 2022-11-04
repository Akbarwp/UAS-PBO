/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO.Praktikum.Pertemuan11.Tugas;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akbar
 */

public class ControllerTugas {
    
    Connection conn;
    Statement cmd;
    ResultSet rs;
    DefaultTableModel tmMahasiswa;
    String SQL;
    
    public void insertTugas(String nim, String nama, String lahir, String gender, String jurusan) {
        try {
            conn = KoneksiTugas.getKoneksi();
            SQL = "INSERT INTO praktikum (NIM, Nama, Lahir, JK, Jurusan) VALUES"
                    + "('" + nim+ "',"
                    + "'" + nama + "',"
                    + "'" + lahir + "',"
                    + "'" + gender + "',"
                    + "'" + jurusan + "')";
            
            cmd = conn.createStatement();
            cmd.executeUpdate(SQL);
            
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    
    public void updateTugas(int index, String nim, String nama, String lahir, String gender, String jurusan) {
        try {
            conn = KoneksiTugas.getKoneksi();
            SQL = "UPDATE praktikum SET "
                    + "NIM = " + "'" + nim + "',"
                    + "Nama = " + "'" + nama + "',"
                    + "Lahir = " + "'" + lahir + "',"
                    + "JK = " + "'" + gender + "',"
                    + "Jurusan = " + "'" + jurusan + "'"
                    + "WHERE NIM = '" + nim + "'";
            
            cmd = conn.createStatement();
            cmd.executeUpdate(SQL);
            
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    
    public void deleteTugas(String nim) {
        try {
            conn = KoneksiTugas.getKoneksi();
            SQL = "DELETE FROM praktikum WHERE NIM = '" + nim + "'";
            cmd = conn.createStatement();
            cmd.executeUpdate(SQL);
            
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
