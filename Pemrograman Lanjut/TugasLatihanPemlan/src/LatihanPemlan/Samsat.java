package LatihanPemlan;

import java.util.ArrayList;

public class Samsat {
    ArrayList<STNK> _listSTNK = new ArrayList<>();
    static int count;

    private Samsat() {
        Samsat.count++;
    }

    static Samsat getInstance(){
        if (Samsat.count == 0) {
            return new Samsat();
        } else {
            return null;
        }
    }

    void createSTNK(Person owner, Car car, String nopol){
        STNK stnk = new STNK(owner,car,nopol);
        _listSTNK.add(stnk);
    }

    void printAllInfoSTNK() {
        System.out.println("   MENAMPILKAN INFO SEMUA STNK");
        for (STNK stnk : _listSTNK) {
            System.out.println("---------------------------------");
            stnk.getInfo();
            System.out.println("---------------------------------");
        }
    }

    public int getJumlahStnk() {
        return  _listSTNK.size();
    }
}
