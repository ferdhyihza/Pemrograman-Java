package KlinikKoding1;

public class Main {

    public static void main(String[] args) {

        Pekerja perpus = new Pekerja("Sri", "Kepala Perpus");

        Buku buku1 = new Buku("Belajar Python",5, "Rossum", "Pemrograman");
        Buku buku2 = new Buku("Tips & Trick UTBK", 3, "Zenius", "Pendidikan");

        Pengunjung visitor1 = new Pengunjung("Shinta","16 April 2021",buku1);
        visitor1.tambahPinjam(buku2);
        Pengunjung visitor2 = new Pengunjung("Budi","17 April 2021");

        perpus.addPengunjung(visitor1);
        perpus.addPengunjung(visitor2);

        perpus.show();

    }

}
