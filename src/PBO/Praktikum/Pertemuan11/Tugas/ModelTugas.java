/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO.Praktikum.Pertemuan11.Tugas;

import PBO.Praktikum.Pertemuan10.Tugas.*;

/**
 *
 * @author akbar
 */
public class ModelTugas {
    
    private String nim, nama, lahir, gender, jurusan;
    
    public ModelTugas(){}
    public ModelTugas(String nim, String nama, String lahir, String gender, String jurusan){
        this.nim = nim;
        this.nama = nama;
        this.lahir = lahir;
        this.gender = gender;
        this.jurusan = jurusan;
    }
    
    public String getNim() {
        return this.nim;
    }
    public String getNama() {
        return this.nama;
    }
    public String getLahir() {
        return this.lahir;
    }
    public String getGender() {
        return this.gender;
    }
    public String getJurusan() {
        return this.jurusan;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setLahir(String lahir) {
        this.lahir = lahir;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
