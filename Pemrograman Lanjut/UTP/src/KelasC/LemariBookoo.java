package KelasC;

import java.util.Scanner;

class Book {

    String judul;
    String kategori;
    String ISBN = "ISBN-2020-04-08-";

    public Book(String judul, String kategori) {
        this.judul = judul;
        this.kategori = kategori;
        this.ISBN +=1;
    }

    public Book(String judul, String kategori, String ISBN) {
        this.judul = judul;
        this.kategori = kategori;
        this.ISBN = ISBN;
    }

    static int hitungBukuPerKategori(Book[] shelf, String kategori){
        int jumlah=0;
        for (Book book : shelf) {
            if (book.kategori.equalsIgnoreCase(kategori)) jumlah++;
        }
        return jumlah;
    }

    static void cetakBukuTerakhir(Book[] shelf){
        System.out.println("Judul buku: " + shelf[shelf.length-1].judul);
        System.out.println("Kategori buku: " + shelf[shelf.length-1].kategori);
        System.out.println("ISBN buku: " + shelf[shelf.length-1].ISBN);
    }
}

public class LemariBookoo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlahBuku = in.nextInt();
        in.nextLine();
        Book[] shelf = new Book[jumlahBuku];
        int bookCounter = 0;
        String selectedMenu = "";
        while (!selectedMenu.equals("SELESAI")) {
            selectedMenu = in.next();
            switch (selectedMenu) {
                case "TAMBAH_WITH_ISBN" -> {
                    String judul = in.next();
                    String kategori = in.next();
                    String ISBN = in.next();
                    shelf[bookCounter++] = new Book(judul, kategori, ISBN);
                }
                case "TAMBAH_WITHOUT_ISBN" -> {
                    String judul = in.next();
                    String kategori = in.next();
                    shelf[bookCounter++] = new Book(judul, kategori);
                }
                case "HITUNG_PER_KATEGORI" -> {
                    String kategori = in.next();
                    int result = Book.hitungBukuPerKategori(shelf, kategori);
                    System.out.printf("Kategori %s ada sebanyak %d buku\n", kategori, result);
                }
                case "CETAK_TERAKHIR" -> Book.cetakBukuTerakhir(shelf);
            }
        }
    }
}
