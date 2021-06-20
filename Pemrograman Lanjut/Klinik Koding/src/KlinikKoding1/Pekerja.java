package KlinikKoding1;

import java.util.ArrayList;

public class Pekerja {

    String nama;
    String jabatan;

    public Pekerja(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
    }

    static int totalPengunjung;
    ArrayList<Pengunjung> listPengunjung = new ArrayList<>();

    void show(){
        System.out.println("Total pengunjung: " + totalPengunjung);
        System.out.println("Yang meminjam buku");
        for (int i=0 ; i< listPengunjung.size() ; i++){
            System.out.println("Pengunjung " + (i+1) + ":");
            System.out.printf("- %-10s : %s\n", "Nama", listPengunjung.get(i).nama );
            System.out.printf("- %-10s : %s\n", "Tanggal", listPengunjung.get(i).tglDatang );
            if (listPengunjung.get(i).listBukuPinjaman.size() > 0)
                System.out.println("- Buku yang dipinjam:");
            for ( int a=0 ; a < listPengunjung.get(i).listBukuPinjaman.size() ; a++) {
                System.out.println("  --Buku " + (a+1));
                System.out.printf("    ---%-10s : %s\n", "Judul", listPengunjung.get(i).listBukuPinjaman.get(a).getJudul());
                System.out.printf("    ---%-10s : %s\n", "Penulis", listPengunjung.get(i).listBukuPinjaman.get(a).getPenulis());
                System.out.printf("    ---%-10s : %s\n", "Genre", listPengunjung.get(i).listBukuPinjaman.get(a).getGenre());
            }
        }
    }

    void addPengunjung(Pengunjung visitor){
        listPengunjung.add(visitor);
        totalPengunjung++;
    }

    // Read & Write stok buku
    void lihatStokBuku(Buku buku) {
        System.out.println("Stok buku: " + buku.getStok());
    }

    void aturStokBuku(Buku buku, int jumlah) {
        buku.addStok(jumlah);
    }

    // Jumlah pengunjung (termasuk yang tidak pinjam)


}
