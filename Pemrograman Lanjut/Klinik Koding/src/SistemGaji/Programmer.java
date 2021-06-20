package SistemGaji;

public class Programmer extends Pegawai{
    int banyakProjek;

    Programmer(String nama, double lamaKerja,double tmbhnGaji, int projek) {
        super(nama, lamaKerja, tmbhnGaji);
        pekerjaan = "Programmer";
        this.banyakProjek = projek;
        gaji = 100000;
        double lamaKerjaTahun = Math.round(lamaKerja/12 * 100);
        lamaKerjaTahun /= 100;
        gaji = lamaKerjaTahun * banyakProjek * gaji;
        if((lamaKerjaTahun > 1) && banyakProjek > 5) {
            gaji += tambahanGaji;
        }
    }

    int getBanyakProjek() {
        return banyakProjek;
    }

}
