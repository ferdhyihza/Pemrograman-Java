package Toko;

import java.util.Scanner;

class Toko {
    public final int diskon = 5;
    public final String namaToko = "ABC";
    public final int harga = 5000;
    static int jumlahBarang = 5;
    String namaPembeli;
    int count;

    Toko(String nama){
        namaPembeli = nama;
    }

    Toko() {

    }

    void doJual(){
        count++;
        jumlahBarang--;
        int tagihan = (int) (harga - (harga*(diskon/100.)));
        cetakGaris();
        System.out.println(" -\tPembelian ke-" + count);
        System.out.println("\tNama pembeli\t\t\t\t\t: " + this.namaPembeli);
        System.out.println("\tHarga barang setelah diskon\t\t: Rp" + tagihan);
        System.out.println("\tJumlah persediaan barang sisa\t: " + jumlahBarang);
    }

    void doAddBarang(){
        jumlahBarang++;
        cetakGaris();
        System.out.println(" +\tPenambahan barang");
        System.out.println("\tJumlah persediaan barang sisa : " + jumlahBarang);
    }

    void sapa(){
        cetakGaris();
        System.out.println("Hai " + this.namaPembeli + ", selamat datang di toko " + this.namaToko);
        System.out.println("Promo diskon " + this.diskon + "% untuk setiap barang");
        System.out.println("Semua barang serba Rp" + this.harga);
    }

    static void cetakGaris(){
        System.out.println("====================================================");
    }
}

public class Main {

    public static void main(String[] args) {

        /* ------- Ferdhy Ihza Armanda 205150401111011 SI-B ------
        SKENARIO -> ada 2 orang: Budi dan Toni membeli barang, pakai Scanner
        Sequential
        1. Budi beli 2 barang -> tampilkan sisa barang di toko setelah Budi beli
        beserta harga tiap beli 1 barang
        2. Toni beli 2 barang - tampilkan sisa barang di toko setelah Toni beli
        beserta harga tiap beli 1 barang
        3. Tambah barang -> tampilkan jumlah barang di toko*/

        Toko customer1 = new Toko(getNamaPembeli());
        customer1.sapa();
        customer1.doJual();
        customer1.doJual();

        Toko customer2 = new Toko(getNamaPembeli());
        customer2.sapa();
        customer2.doJual();
        customer2.doJual();

        new Toko().doAddBarang();
    }

    public static String getNamaPembeli(){
        Scanner scan = new Scanner(System.in);
        Toko.cetakGaris();
        System.out.print("Masukkan nama Anda : ");
        return scan.nextLine();
    }

}
