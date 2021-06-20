package ContohSoal.hewan;

import ContohSoal.kembangbiak.Ovipar;
import ContohSoal.vertebrata.Aves;

public class BurungUnta implements Aves, Ovipar {

    @Override
    public void bertelur() {
        System.out.println("Burung unta bertelur");
    }

    @Override
    public void terbang() {
        System.out.println("Ternyata burung unta tidak terbang");
    }
}
