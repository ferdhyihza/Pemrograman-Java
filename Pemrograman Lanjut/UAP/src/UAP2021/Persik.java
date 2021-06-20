package UAP2021;

public class Persik extends Tanaman implements perawatan {

    Persik(){
        super.nama = "Persik";
        super.setMasaHidup(180);
        super.setBerbuah(250);
        super.addPerkembangan(37.5);
    }

    @Override
    public void treatment() {
        addPerkembangan(2.5);
    }

    @Override
    void berkembang() {
        super.setProsesBerbuah(super.getProsesBerbuah()+super.getPerkembangan());
        super.setLamaHidup(super.getLamaHidup()+1);
        if (getProsesBerbuah() > getBerbuah()) {
            setBuah(getBuah() + 1);
            setProsesBerbuah(getProsesBerbuah()-getBerbuah());
        } else if (getProsesBerbuah() == getBerbuah()) {
            setBuah(getBuah() + 1);
            setProsesBerbuah(0);
        }
    }
}
