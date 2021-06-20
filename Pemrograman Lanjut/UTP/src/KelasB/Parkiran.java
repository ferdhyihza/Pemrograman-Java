package KelasB;

import java.util.ArrayList;

class carPark{
    private String noPlat;
    String Merk;
    String Warna;
    int genPark = 0;
    carPark(){}
    carPark(String merk, String warna, String noPlat){
        setNoPlat(noPlat);
        this.Merk=merk;
        this.Warna=warna;
        this.genPark++;
    }
    public String getNoPlat() {
        return noPlat;
    }
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void display(){
        System.out.println("Merk : "+this.Merk);
        System.out.println("Color : "+this.Warna);
        System.out.println("Plat : "+getNoPlat());
        System.out.println("Parking Code "+this.genPark);
    }
}
class Arrays{
    public static ArrayList<carPark> listParkiran = new ArrayList<carPark>();
    public carPark _CarPark;
    final static int place1 = 50;

    static void createPark(String merk, String warna, String plat) {
        carPark car = new carPark(merk, warna, plat);
        listParkiran.add(car);
    }

    public static void listTiket(){

        carPark mobil = new carPark();
        System.out.println("=======List Tiket======");
        for (KelasB.carPark carPark : listParkiran) {
            System.out.println();
            mobil = carPark;
            mobil.display();

        }
        System.out.println("==============");
        System.out.println("Total car parking = "+listParkiran.size());
        System.out.println("Available place = "+(place1-listParkiran.size()));
    }
    public static void keluar(){
        listParkiran.remove(1);
        System.out.println();
        System.out.println("============");
        System.out.println("Mobil out 1");
        System.out.println("Total car parking = " + listParkiran.size());
        System.out.println("Available place = " + (place1 - listParkiran.size()));
    }
}

public class Parkiran {

    public static void main(String[] args) {

        Arrays.createPark("Avanza","Hitam","AG 3749 CK");
        Arrays.createPark("Xenia","Hijau","B 3259 AS");
        Arrays.createPark("Livina","Oranye","AD 1346 HH");
        Arrays.createPark("Kijang","Putih","N 1345 OK");
        Arrays.listTiket();
        Arrays.keluar();
        Arrays.createPark("Pajero", "Ungu", "A 9863 JN");
        Arrays.createPark("Ayla", "Merah", "A 1349 JM");
        Arrays.listTiket();
    }
}
