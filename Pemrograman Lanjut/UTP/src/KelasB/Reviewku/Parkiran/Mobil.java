package KelasB.Reviewku.Parkiran;

public class Mobil {

    private String noPlat;
    private String merk;
    private String warna;

    public Mobil(String noPlat, String merk, String warna) {
        this.noPlat = noPlat;
        this.merk = merk;
        this.warna = warna;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}
