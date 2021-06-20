package StrukKantin;

import java.util.Scanner;

public class StrukKantin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int qtyAyamGoreng, qtyNasiGoreng, qtyNasiKecap, hargaAyamGoreng, hargaNasiGoreng, hargaNasiKecap, total;

        qtyAyamGoreng = input.nextInt();
        qtyNasiGoreng = input.nextInt();
        qtyNasiKecap = input.nextInt();

        hargaAyamGoreng = qtyAyamGoreng*13000;
        hargaNasiGoreng = qtyNasiGoreng*10000;
        hargaNasiKecap = qtyNasiKecap*5000;
        total = hargaAyamGoreng + hargaNasiGoreng + hargaNasiKecap;

        System.out.println("=================================");
        System.out.println("    KANTIN PUJASERA FILKOM UB    ");
        System.out.println("=================================");
        System.out.printf("%-17s %-5s %s\n","MAKANAN", "QTY", "HARGA");
        System.out.println("");
        System.out.printf("%-17s %-5d %s %d\n","AYAM GORENG", qtyAyamGoreng, "Rp.",hargaAyamGoreng);
        System.out.printf("%-17s %-5d %s %d\n","NASI GORENG", qtyNasiGoreng, "Rp.",hargaNasiGoreng);
        System.out.printf("%-17s %-5d %s %d\n","NASI KECAP", qtyNasiKecap, "Rp.",hargaNasiKecap);
        System.out.println("=================================");
        System.out.printf("%-24s %s %d\n","TOTAL", "Rp.",total);
        System.out.println("TERIMA KASIH TELAH BERBELANJA!!!");
    }
}
