/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO.Praktikum.Pertemuan10.Tugas;

import java.util.*;

/**
 *
 * @author akbar
 */
public class ControllerTugas {
    
    private ArrayList<ModelTugas> listTugas = new ArrayList<>();
    
    public ControllerTugas(){}
    public ControllerTugas(ArrayList<ModelTugas> listTugas){
        this.listTugas = listTugas;
    }
    
    public ArrayList<ModelTugas> getListTugas() {
        return this.listTugas;
    }
    public void setListTugas(ArrayList<ModelTugas> listTugas) {
        this.listTugas = listTugas;
    }
    
    public void insertTugas(String nim, String nama, String lahir, String gender, String jurusan) {
        ModelTugas mt = new ModelTugas(nim, nama, lahir, gender, jurusan);
        listTugas.add(mt);
        System.out.println("DATA TELAH DITAMBAHKAN");
    }
    
    public void updateTugas(int index, String nim, String nama, String lahir, String gender, String jurusan) {
        ModelTugas mt = new ModelTugas(nim, nama, lahir, gender, jurusan);
        listTugas.get(index).setNim(mt.getNim());
        listTugas.get(index).setNama(mt.getNama());
        listTugas.get(index).setLahir(mt.getLahir());
        listTugas.get(index).setGender(mt.getGender());
        listTugas.get(index).setJurusan(mt.getJurusan());
        System.out.println("DATA TELAH DIPERBARUI");
    }
    
    public void deleteTugas(int index) {
        listTugas.remove(index);
        System.out.println("DATA TELAH DIHAPUS");
    }
    
    public int getArraySize() {
        return listTugas.size();
    }
}
