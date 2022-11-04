/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO.Praktikum.Pertemuan10;

import java.util.ArrayList;

/**
 *
 * @author akbar
 */
public class ControllerMhs {
    
    //DEKLARASI ARRAY LIST
    private ArrayList<ModelMhs> listMhs = new ArrayList<>();
    
    //CONSTRUCTOR
    public ControllerMhs(){}
    public ControllerMhs(ArrayList<ModelMhs> listMhs){
        this.listMhs = listMhs;
    }
    
    //SETTER GETTER
    public ArrayList<ModelMhs> getListMhs() {
        return this.listMhs;
    }
    public void setListMhs(ArrayList<ModelMhs> listMhs) {
        this.listMhs = listMhs;
    }
    
    //INSERT UPDATE DELETE
    public void insertMhs(String nama, String jurusan, String alamat) {
        ModelMhs mMhs = new ModelMhs(nama, jurusan, alamat);
        listMhs.add(mMhs);
        System.out.println("DATA TELAH DITAMBAHKAN");
    }
    
    public void updateMhs(int index, String nama, String jurusan, String alamat) {
        ModelMhs mMhs = new ModelMhs(nama, jurusan, alamat);
        listMhs.get(index).setNama(mMhs.getNama());
        listMhs.get(index).setJurusan(mMhs.getJurusan());
        listMhs.get(index).setAlamat(mMhs.getAlamat());
        System.out.println("DATA TELAH DIPERBARUI");
    }
    
    public void deleteMhs(int index) {
        listMhs.remove(index);
        System.out.println("DATA TELAH DIHAPUS");
    }
    
    public int getArrayListSize() {
        return listMhs.size();
    }
}
