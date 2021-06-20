package KelasB;

import java.util.ArrayList;

class Mobil {
    String nomorPlat;
    String merk;
    String warna;

    public Mobil(String nomorPlat, String merk, String warna) {
        this.nomorPlat = nomorPlat;
        this.merk = merk;
        this.warna = warna;
    }


}

class TempatParkir{

    final private int kapasitas = 50;
    private int nomorTiket;
    int totalCar;
    int availableCar;
    int parkingCode;
    ArrayList<Mobil> mobil = new ArrayList<>();

    int generateNomorTiket = 0;

    TempatParkir(String merk, String color, String plat){

    }
}

public class Parkir {

    public static void main(String[] args) {


    }
}
