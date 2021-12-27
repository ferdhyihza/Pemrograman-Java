package LK11;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Scanner;

public class Kasir {

    static String [] barang = {"Roti", "Sampo","Pasta", "Molto", "Rinso"};
    static int [] stok = {18, 28, 39, 45, 30};
    static int [] harga = {5000, 4000, 15000, 3000, 40000};
    static int[][] dataPenjualan = new int[20][2];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat UANGINDO = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        UANGINDO.setDecimalFormatSymbols(formatRp);

        System.out.println("Nama: Nur Aida Alfiyanti");
        System.out.println("NIM : 215150600111022");
        System.out.println("\nSELAMAT DATANG DI KASIR APPS");

        boolean statusProgram = true;
        int counter = 0;
        while (statusProgram) {
            int totalHarga = 0;
            int diskon = 0;
            System.out.print("Apakah ingin menggunakan KASIR APPS? (Y/T) ");
            String lagi = scan.next();
            if (lagi.equalsIgnoreCase("y")) {
                printMenu();
                System.out.println("\nTekan 0 jika PROSES PEMASUKAN BARANG SELESAI!");
                boolean statusLagi = true;
                int inputNoItem;
                do {
                    System.out.print("Pilih barang yang dibeli: ");
                    inputNoItem = scan.nextByte();
                    if (inputNoItem == 0) {
                        statusLagi = false;
                    } else if (inputNoItem > 0 && inputNoItem <= 5) {
                        System.out.print("Jumlah barang yang dibeli: ");
                        int inputQty = scan.nextInt();
                        if (inputQty <= stok[inputNoItem-1]) {
                            totalHarga += inputQty * harga[inputNoItem-1];
                            stok[inputNoItem-1] -= inputQty;
                        } else {
                            System.out.println("Maaf, stok tidak mencukupi. Sisa stok: " + stok[inputNoItem-1]);
                        }
                    } else {
                        System.out.println("Maaf, nomor barang tidak ada!");
                    }
                } while (statusLagi);
                System.out.println("============== Transaksi ke " + (counter+1) + " ==============");

                System.out.printf("\n%-15s : %15s\n", "Harga Jual", UANGINDO.format(totalHarga));
                if (totalHarga > 100000) {
                    diskon = (int) (0.05 * totalHarga);
                } else if (totalHarga > 50000) {
                    diskon = (int) (0.01 * totalHarga);
                }
                totalHarga = totalHarga - diskon;
                dataPenjualan[counter][0] = totalHarga;
                dataPenjualan[counter][1] = diskon;
                System.out.printf("%-15s : %15s\n", "Diskon", UANGINDO.format(diskon));
                System.out.printf("%-15s : %15s\n\n", "Total", UANGINDO.format(totalHarga));
                System.out.println("==========================================");
                counter++;
            } else if (lagi.equalsIgnoreCase("t")) {
                statusProgram = false;
            } else {
                System.out.println("Masukkan input yang sesuai!");
            }
        }
        printMenu();
        int sumPendapatanBersih = 0;
        int sumDiskon = 0;
        for (int i=0 ; i<dataPenjualan.length ; i++) { // TRANSAKSI
            sumPendapatanBersih += dataPenjualan[i][0]; // Pendapatan bersih
            sumDiskon += dataPenjualan[i][1]; // Diskon
        }
        System.out.println("Total Pendapatan Bersih " + UANGINDO.format(sumPendapatanBersih));
        System.out.println("Total Diskon " + UANGINDO.format(sumDiskon));
    }

    public static void printMenu(){
        System.out.println("------------------------------------------");
        System.out.printf("%-4s| %-15s| %-5s| %-7s|\n", "No.", "Nama Barang", "Stok", "Harga");
        System.out.println("==========================================");
        for(int j=0; j<barang.length; j++ ){
            System.out.printf("%-4s| %-15s| %-5s| %-7s|\n", j+1, barang[j], stok[j], harga[j]);
        }
        System.out.println("------------------------------------------");
    }

}

