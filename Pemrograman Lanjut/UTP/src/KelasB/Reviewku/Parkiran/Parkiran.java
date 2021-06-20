package KelasB.Reviewku.Parkiran;

import KelasB.Reviewku.Perpustakaan.Book;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Parkiran {

    final int kapasitas = 50;
    ArrayList<Tiket> listTiket = new ArrayList<>();
    int availableSlot;
    int parkingSlot;




    static int generatorNoParkir=0;

    void generateTiket(String noPlat, String merk, String warna){
        Tiket tiket = new Tiket(noPlat, merk, warna);
        tiket.setNoParkir(generatorNoParkir);
        generatorNoParkir++;
        listTiket.add(tiket);
    }

    Tiket[] getListTiket(){
        Tiket[] tikets = new Tiket[listTiket.size()];
        for (int i=0 ; i < tikets.length ; i++) {
            tikets[i] = listTiket.get(i);
        }
        return tikets;
    }

    int getSize(ArrayList<Tiket> list){
        return list.size();
    }

    void totalCarParking(){
        System.out.println("Total car parking = " + getSize(listTiket));
    }

    void availablePlace(){
        availableSlot = kapasitas - getSize(listTiket);
        System.out.println("Available place = " + availableSlot);
    }

    void mobilOut(int parkingCode){
        listTiket.remove(parkingCode);
        System.out.println("Mobil out " + parkingCode);
    }
}
