/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO.Praktikum.Pertemuan10;

/**
 *
 * @author akbar
 */
public class ModelMhs {
    
    //DEKLARASI
    private String nama, jurusan, alamat;
    
    //CONSTRUCTOR
    public ModelMhs(){}
    public ModelMhs(String nama, String jurusan, String alamat){
        this.nama = nama;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }
    
    //GETTER
    public String getNama() {
        return this.nama;
    }
    public String getJurusan() {
        return this.jurusan;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    //SETTER
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
