package SistemGaji;

public class CustomerService extends Pegawai{
    double banyakOrang;
    int rating;

    CustomerService(String nama, double lamaKerja,double tmbhnGaji,double banyakOrang, int rating) {
        super(nama, lamaKerja, tmbhnGaji);
        pekerjaan = "Customer Service";
        this.banyakOrang = banyakOrang;
        this.rating = rating;
        gaji = 80000;
        double lamaKerjaTahun = Math.round(lamaKerja/12 * 100);
        lamaKerjaTahun /= 100;
        gaji= (lamaKerjaTahun * rating + banyakOrang/10) * gaji;
        if(rating == 5 && banyakOrang > 100) {
            gaji += tambahanGaji;
        }
    }
}

