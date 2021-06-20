package Tugas;

public class MahasiswaFILKOM extends Manusia {

    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jK, boolean menikah) {
        super(nama, nik, jK, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    @Override
    double getPendapatan(){
        return super.getPendapatan() + getBeasiswa();
    }

    String getStatus(){
        String angkatan = "20" + this.nim.substring(0,2);
        char prodi = getNim().charAt(6);
        String namaProdi="";
        switch (prodi) {
            case '2' -> namaProdi = "Teknik Informatika";
            case '3' -> namaProdi = "Teknik Komputer";
            case '4' -> namaProdi = "Sistem Informasi";
            case '6' -> namaProdi = "Pendidikan Teknologi Informasi";
            case '7' -> namaProdi = "Teknologi Informasi";
        }
        return namaProdi + ", " + angkatan;
    }

    double getBeasiswa(){
        if (getIpk() > 3.5 ) return 75;
        if (getIpk() >= 3.0) return 50;
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() +
                "NIM : " + this.nim + "\n" +
                "IPK : " + this.ipk + "\n" +
                "Status : " + this.getStatus() + "\n";
    }
}
