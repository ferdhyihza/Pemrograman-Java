package ContohSoal.hewan;

import ContohSoal.kembangbiak.Vivipar;
import ContohSoal.vertebrata.Mammals;

public class Sapi implements Mammals, Vivipar {

    int jumlah = 15;

    @Override
    public void beranak() {
        System.out.println("Sapi beranak " + jumlah);
    }

    @Override
    public void menyusui() {
        System.out.println(jumlah + " anak sapi disusui");
    }
}
