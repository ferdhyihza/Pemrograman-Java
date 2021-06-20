package ContohSoal.hewan;

import ContohSoal.kembangbiak.Ovipar;
import ContohSoal.vertebrata.Pisces;

public class Salmon implements Pisces, Ovipar {

    @Override
    public void bertelur() {
        System.out.println("Ikan bertelur ayam");
    }

    @Override
    public void berenang() {
        System.out.println("Ikan berenang di laut");
    }
}
