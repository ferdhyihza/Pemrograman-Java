package UAP2021;

public class Tomat extends Tanaman implements perawatan {

    Tomat(){
        super.nama = "Tomat";
        super.setMasaHidup(100);
        super.setBerbuah(100);
        super.addPerkembangan(0.25);
    }

    @Override
    public void treatment() {
        this.addPerkembangan(0.05);
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
