package Tugas;

public class Manusia {

    private String nama;
    private boolean jK; // true : laki-laki
    private String nik;
    private boolean menikah;

    public Manusia(String nama, String nik, boolean jK, boolean menikah) {
        this.nama = nama;
        this.jK = jK;
        this.nik = nik;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getjK() {
        return jK ? "Laki-laki" : "Perempuan";
    }

    public void setjK(boolean jK) {
        this.jK = jK;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    double getTunjangan(){
        return menikah ? (jK ? 25 : 20) : 15;
    }

    double getPendapatan(){
        return getTunjangan();
    }

    @Override
    public String toString() {
        return "Nama : " + getNama() + "\n" +
                "NIK : " + getNik() + "\n" +
                "Jenis Kelamin : " + getjK() + "\n" +
                "Jumlah Pendapatan : " + getPendapatan() + "\n";
    }
}
