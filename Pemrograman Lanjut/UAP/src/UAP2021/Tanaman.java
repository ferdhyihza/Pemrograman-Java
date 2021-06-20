package UAP2021;

public abstract class Tanaman implements perawatan{

    String nama;

    private int masaHidup;
    private int lamaHidup;
    private int berbuah;
    private int buah;
    private double perkembangan;
    private double prosesBerbuah;

    public int getMasaHidup() {
        return masaHidup;
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public int getBerbuah() {
        return berbuah;
    }

    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }

    public int getBuah() {
        return buah;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void addPerkembangan(double perkembangan) {
        this.perkembangan += perkembangan;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }

    abstract void berkembang();

    String status(){
        return lamaHidup >= masaHidup ? "Mati" : "Hidup";
    }

    @Override
    public String toString() {
        return  "Masa Hidup = " + masaHidup + " hari \n" +
                "Umur tanaman = " + lamaHidup + " hari \n" +
                "Menghasilkan = " + buah + " buah " + nama.toLowerCase() + "\n" +
                "Status = " + status();
    }
}

interface perawatan {
    void treatment();
}
