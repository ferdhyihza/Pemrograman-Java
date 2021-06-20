package KlinikKoding1;

import java.util.ArrayList;

public class Pengunjung {

    String nama;
    String tglDatang;
    ArrayList<Buku> listBukuPinjaman = new ArrayList<>();

    public Pengunjung(String nama, String tglDatang) {
        this.nama = nama;
        this.tglDatang = tglDatang;
    }

    public Pengunjung(String nama, String tglDatang, Buku bukuPinjaman) {
        this.nama = nama;
        this.tglDatang = tglDatang;
        listBukuPinjaman.add(bukuPinjaman);
        bukuPinjaman.reduceStok(1);
    }

    // Read stok buku
    void cekStok(Buku buku){
        System.out.println("Buku " + buku.getJudul() + " memiliki stok sebanyak: " + buku.getStok());
    }

    // Pinjam lebih dari 1 buku
    void tambahPinjam(Buku bukuPinjaman){
        listBukuPinjaman.add(bukuPinjaman);
        bukuPinjaman.reduceStok(1);
    }

}
