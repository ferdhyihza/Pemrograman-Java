package SistemGaji;

import java.text.NumberFormat;
import java.util.Locale;

public class Pegawai {
    String nama;
    String NIP;
    double lamaKerja;
    double gaji;
    double tambahanGaji;
    String pekerjaan;
    static String bulan[] = new String[100];

    Pegawai() {
        super();
    }

    Pegawai(String nama, double lamaKerja, double tmbhnGaji) {
        this.nama = nama;
        this.lamaKerja = lamaKerja;
        this.tambahanGaji = tmbhnGaji;
    }

    static void informasiTiapBulan(Pegawai[] pAr) {
        double totalGaji = 0;
        for(Pegawai p:pAr) {
            if(p != null) {
                p.informasi();
                totalGaji += p.gaji;
            }
        }
        NumberFormat nf;
        nf = NumberFormat.getNumberInstance(Locale.GERMAN);
        System.out.println("==============================");
        System.out.println("Total Gaji: Rp." + nf.format(totalGaji));
    }

    void informasi() {
        System.out.println("------------------------------");
        System.out.println("Nama: " + nama);
        System.out.println("Pekerjaan: " + pekerjaan);
        NumberFormat nf;
        nf = NumberFormat.getNumberInstance(Locale.GERMAN);
        System.out.println("Gaji: Rp." + nf.format(gaji));
    }
}
