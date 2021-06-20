package Komposisi;

public class Processor {

    private String nama;
    private int kecepatan;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public Processor(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }
}
