package UAP2021;

public class Stroberi extends Tanaman implements perawatan {

    Stroberi(){
        super.nama = "Stroberi";
        super.setMasaHidup(60);
        super.setBerbuah(150);
        super.addPerkembangan(52.5);
    }

    @Override
    public void treatment() {
        this.addPerkembangan(5);
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
