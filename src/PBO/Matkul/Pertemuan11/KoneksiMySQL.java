package PBO.Matkul.Pertemuan11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiMySQL {
    
    public static Connection koneksi;
    
    public static Connection getKoneksi() throws SQLException{
        
        if(koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost/pbo";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi Berhasil");

            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
        return koneksi;
    }
}
