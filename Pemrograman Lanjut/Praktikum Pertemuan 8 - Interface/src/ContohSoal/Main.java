package ContohSoal;

/*
Hewan Vertebrata
- interface Mammals: method menyusui()
- interface Aves: method terbang()
- interface Pisces: method berenang()
Cara kembang biak
- interface Vivipar: method beranak()
- interface Ovipar: method bertelur()
- interface Ovovivipar: method bertelur(), beranak()
Hewan
- Sapi
- Salmon
- Burung unta
 */

import ContohSoal.hewan.BurungUnta;
import ContohSoal.hewan.Salmon;
import ContohSoal.hewan.Sapi;
import ContohSoal.hewan.Ular;

public class Main {
    public static void main(String[] args) {
        BurungUnta burungUnta = new BurungUnta();
        burungUnta.terbang();
        burungUnta.bertelur();

        Sapi sapi = new Sapi();
        sapi.beranak();
        sapi.menyusui();

        Salmon salmon = new Salmon();
        salmon.berenang();
        salmon.bertelur();

        Ular ular = new Ular();
        ular.beranak();
        ular.bertelur();
        ular.berenang();
    }
}