package KelasB.Reviewku.Parkiran;

public class Tiket {

    int noParkir;
    Mobil mobil;

    Tiket(String noPlat, String merk, String warna){
        mobil = new Mobil(noPlat, merk, warna);
    }

    public void setNoParkir(int noParkir) {
        this.noParkir = noParkir;
    }

    // rincian mobil

    void show(){
        System.out.println("Merk: " + mobil.getMerk());
        System.out.println("Color: " + mobil.getWarna());
        System.out.println("Plat: " + mobil.getNoPlat());
        System.out.println("Parking Code: " + noParkir);
    }
}
