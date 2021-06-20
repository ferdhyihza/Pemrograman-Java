package LatihanEncapsulasiRelasi;

import java.util.ArrayList;

public class Samsat {

    private ArrayList<STNK> STNKList = new ArrayList<STNK>();

    Samsat(){}

    void createSTNK(Person owner, Car car, String nopol){
        STNK stnk = new STNK(owner,car,nopol);
        STNKList.add(stnk);
    }

    void printAllInfoSTNK(){
        System.out.println("MENAMPILKAN INFO SEMUA STNK");
        for (int i=0 ; i<STNKList.size() ; i++ ){
            System.out.println("===========================");
            System.out.println("Nomor: " + (i+1) + " |");
            System.out.println("----------");
            STNKList.get(i).getInfo();
            System.out.println("===========================");
        }
    }

    int getJumlahSTNK(){
        return STNKList.size();
    }
}
