package Pemdas;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class KasirAppsNew {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat UANGINDO = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        UANGINDO.setDecimalFormatSymbols(formatRp);

        String roti = "Roti";
        int stokRoti = 10;
        int hargaRoti = 5000;

        String sampo = "Sampo";
        int stokSampo = 8;
        int hargaSampo = 4000;

        String pasta = "Pasta";
        int stokPasta = 9;
        int hargaPasta = 15000;

        String molto = "Molto";
        int stokMolto = 15;
        int hargaMolto = 3000;

        String rinso = "Rinso";
        int stokRinso = 7;
        int hargaRinso = 40000;

        System.out.println("Nama: Nur Aida Alfiyanti");
        System.out.println("NIM : 215150600111022");
        System.out.println("\nSELAMAT DATANG DI KASIR APPS");

        boolean statusProgram = true;
        while (statusProgram) {
            int totalHarga=0;
            int diskon=0;
            System.out.print("Apakah ingin menggunakan KASIR APPS? (Y/T) ");
            String lagi = scan.next();
            if (lagi.equalsIgnoreCase("y")) {
                System.out.println("------------------------------------------");
                System.out.printf("%-4s| %-15s| %-5s| %-7s|\n", "No.", "Nama Barang", "Stok", "Harga");
                System.out.println("==========================================");
                System.out.printf("%-4s| %-15s| %-5s| %-7s|\n", 1, roti, stokRoti, hargaRoti);
                System.out.printf("%-4s| %-15s| %-5s| %-7s|\n", 2, sampo, stokSampo, hargaSampo);
                System.out.printf("%-4s| %-15s| %-5s| %-7s|\n", 3, pasta, stokPasta, hargaPasta);
                System.out.printf("%-4s| %-15s| %-5s| %-7s|\n", 4, molto, stokMolto, hargaMolto);
                System.out.printf("%-4s| %-15s| %-5s| %-7s|\n", 5, rinso, stokRinso, hargaRinso);
                System.out.println("------------------------------------------");
                System.out.println("\nTekan 0 jika PROSES PEMASUKAN BARANG SELESAI!");
                boolean statusLagi = true;
                int inputNoItem;
                while (statusLagi) {
                    System.out.print("Pilih barang yang dibeli: ");
                    inputNoItem = scan.nextByte();
                    if (inputNoItem == 0) {
                        statusLagi = false;
                    } else if (inputNoItem > 0 && inputNoItem <= 5) {
                        System.out.print("Jumlah barang yang dibeli: ");
                        int inputQty = scan.nextInt();
                        switch (inputNoItem) {
                            case 1 -> {
                                if (inputQty <= stokRoti) {
                                    totalHarga += inputQty * hargaRoti;
                                    stokRoti -= inputQty;
                                } else {
                                    System.out.println("Maaf, stok tidak mencukupi. Sisa stok: " + stokRoti);
                                }
                            }
                            case 2 -> {
                                if (inputQty <= stokSampo) {
                                    totalHarga += inputQty * hargaSampo;
                                    stokSampo -= inputQty;
                                } else {
                                    System.out.println("Maaf, stok tidak mencukupi. Sisa stok: " + stokSampo);
                                }
                            }
                            case 3 -> {
                                if (inputQty <= stokPasta) {
                                    totalHarga += inputQty * hargaPasta;
                                    stokPasta -= inputQty;
                                } else {
                                    System.out.println("Maaf, stok tidak mencukupi. Sisa stok: " + stokPasta);
                                }
                            }
                            case 4 -> {
                                if (inputQty <= stokMolto) {
                                    totalHarga += inputQty * hargaMolto;
                                    stokMolto -= inputQty;
                                } else {
                                    System.out.println("Maaf, stok tidak mencukupi. Sisa stok: " + stokMolto);
                                }
                            }
                            case 5 -> {
                                if (inputQty <= stokRinso) {
                                    totalHarga += inputQty * hargaRinso;
                                    stokRinso -= inputQty;
                                } else {
                                    System.out.println("Maaf, stok tidak mencukupi. Sisa stok: " + stokRinso);
                                }
                            }
                        }
                    } else {
                        System.out.println("Maaf, nomor barang tidak ada!");
                    }
                }
                System.out.printf("\n%-15s : %15s\n","Harga Jual",UANGINDO.format(totalHarga));
                if (totalHarga > 100000) {
                    diskon = (int) (0.05 * totalHarga);
                } else if (totalHarga > 50000) {
                    diskon = (int) (0.01 * totalHarga);
                }
                totalHarga = totalHarga - diskon;
                System.out.printf("%-15s : %15s\n","Diskon",UANGINDO.format(diskon));
                System.out.printf("%-15s : %15s\n\n","Total",UANGINDO.format(totalHarga));
            } else if (lagi.equalsIgnoreCase("t")) {
                statusProgram = false;
            } else {
                System.out.println("Masukkan input yang sesuai!");
            }
        }
    }
}
