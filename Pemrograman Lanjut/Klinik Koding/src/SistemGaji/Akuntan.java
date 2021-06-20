package SistemGaji;

public class Akuntan extends Pegawai{
    int banyakBuku;
    int banyakPresentasi;

    Akuntan(String nama, double lamaKerja,double tmbhnGaji, int banyakBuku, int banyakPresentasi) {
        super(nama, lamaKerja, tmbhnGaji);
        pekerjaan = "Akuntan";
        this.banyakBuku = banyakBuku;
        this.banyakPresentasi = banyakPresentasi;
        gaji = 120000;
        double lamaKerjaTahun = Math.round(lamaKerja/12 * 100);
        lamaKerjaTahun /= 100;
        gaji= lamaKerjaTahun * banyakBuku * gaji;
        if((lamaKerjaTahun > 1.2) && banyakPresentasi > 5) {
            gaji += tambahanGaji;
        }
    }
}
