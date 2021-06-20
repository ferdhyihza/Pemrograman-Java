package Agregasi;

import java.util.ArrayList;

public class Dosen {

    private ArrayList<Mahasiswa> mhsList;
    private String nama;

    public ArrayList<Mahasiswa> getMhsList() {
        return mhsList;
    }

    public void setMhsList(ArrayList<Mahasiswa> mhsList) {
        this.mhsList = mhsList;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Dosen(String nama){
        this.nama = nama;
        mhsList = new ArrayList<Mahasiswa>();
    }

}
