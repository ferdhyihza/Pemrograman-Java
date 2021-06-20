package SistemGaji;

public class Manager extends Pegawai{
    double banyakBawahan;
    int kuota;

    Manager(String nama, double lamaKerja, double tmbhnGaji, double banyakBawahan, int kuota) {
        super(nama, lamaKerja, tmbhnGaji);
        pekerjaan = "Manager";
        this.banyakBawahan = banyakBawahan;
        this.kuota = kuota;
        gaji = 200000;
        double lamaKerjaTahun = Math.round(lamaKerja/12 * 100);
        lamaKerjaTahun /= 100;
        if(kuota < banyakBawahan/3) gaji = 100000;
        gaji= lamaKerjaTahun * banyakBawahan * gaji;
        if(kuota > banyakBawahan*2) {
            gaji += tambahanGaji;
        }
    }
}