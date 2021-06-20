package Tugas;

import java.time.LocalDate;

public class Pekerja extends Manusia {

    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;


    public Pekerja(double gaji, int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahAnak,  String nama, String nik, boolean jK, boolean menikah) {
        super(nama, nik, jK, menikah);
        this.gaji = gaji;
        this.jumlahAnak = jumlahAnak;
        this.tahunMasuk = LocalDate.of(tahunMasuk,bulanMasuk,tanggalMasuk);
    }

    double getGaji(){
        return this.gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    double getBonus(){
        double bonus;
        int lamaKerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (lamaKerja >=0 && lamaKerja <= 5) {
            bonus = 0.05 * getGaji();
        } else if (lamaKerja >5 && lamaKerja <= 10) {
            bonus = 0.1 * getGaji();
        } else if (lamaKerja > 10 ) {
            bonus = 0.15 * getGaji();
        } else {
            bonus = 0;
        }
        return bonus;
    }

    @Override
    public double getTunjangan(){
        return super.getTunjangan() + 20*getJumlahAnak();
    }

    @Override
    public double getPendapatan(){
        return getTunjangan() + getBonus() + getGaji();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tahun Masuk : " + getTahunMasuk().getDayOfMonth() + " " + getTahunMasuk().getMonthValue() + " " + getTahunMasuk().getYear() + "\n" +
                "Jumlah Anak : " + getJumlahAnak() + "\n" +
                "Gaji : " + getGaji() + "\n";
    }
}
