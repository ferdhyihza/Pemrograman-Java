package HadiahLebaran;

/*
Pabrik mobil memproduksi mobil dengan opsi 3 macam mesin, yaitu electric, diesel, dan gasoline(terapkan interface).
Masing-masing meiliki method mengisi daya. Kemudian tiap mobil memiliki atribut warna(Hitam dan Putih), manufaktur,
engine type, fuel status, dan price. Engine type menyesuaikan dengan tipe engine yang di implement ke mobil.
Fuel status mengembalikan string menyesuaikan dari mengisi daya, jika mengisi maka kembalikan Full jika tidak kembalikan Empty.
Terakhir untuk price, jika:
Engine = electric = +50.000.000
Engine = diesel = +30.000.000
Engine = gasoline = +40.000.000
Color = black = +2.000.000
Color = white = +1.000.000

Implementasikan minimal 1 mobil dengan extends kelas mobil dan implement interface salah satu engine.
 */

import java.text.NumberFormat;
import java.util.Locale;

interface Electric {

    void mengisiDaya();
}

interface Diesel {

    void mengisiDaya();
}

interface Gasoline {

    void mengisiDaya();
}

abstract class Mobil {

    String color;
    String manufaktur;
    String engineType;
    String fuelStatus = "Empty";
    int price;

    public Mobil(String color, String manufaktur, String engineType) {
        setColor(color);
        setManufaktur(manufaktur);
        setEngineType(engineType);

    }

    void setColor(String color){
        this.color = color;
        switch (color.toLowerCase()) {
            case "black" -> price += 2_000_000;
            case "white" -> price += 1_000_000;
        }
    }

    public void setManufaktur(String manufaktur) {
        this.manufaktur = manufaktur;
    }

    void setEngineType(String engineType) {
        this.engineType = engineType;
        switch (engineType.toLowerCase()) {
            case "electric" -> price += 50_000_000;
            case "gasoline" -> price += 40_000_000;
            case "diesel" -> price += 30_000_000;
        }
    }

    void showInfo(){
        NumberFormat nf;
        nf = NumberFormat.getNumberInstance(Locale.GERMAN);
        System.out.printf("%-10s\t: %s\n", "Color", this.color);
        System.out.printf("%-10s\t: %s\n", "Manufaktur", this.manufaktur);
        System.out.printf("%-10s\t: %s\n", "Engine Type", this.engineType);
        System.out.printf("%-10s\t: %s\n", "Fuel Status", this.fuelStatus);
        System.out.printf("%-10s\t: %s\n", "Price", nf.format(this.price));

    }
}

class Tesla extends Mobil implements Electric {


    public Tesla(String color, String manufaktur, String engineType) {
        super(color, manufaktur, engineType);
    }

    @Override
    void setColor(String color) {
        super.setColor(color);
    }

    @Override
    void setEngineType(String engineType) {
        super.setEngineType(engineType);
    }

    @Override
    public void mengisiDaya() {
        super.fuelStatus = "Full";
    }
}

public class Main {

    public static void main(String[] args) {

        Tesla tesla = new Tesla("Black", "Tesla","Electric");
        tesla.showInfo();



    }
}
