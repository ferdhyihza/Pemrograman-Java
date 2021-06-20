package Easy;

import java.util.Scanner;

public class KasirFILKOM {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hargaBuku=30000, hargaNotebook=25000, hargaStickerSet=15000;
        int kembalian;
        int money = scan.nextInt(), x = scan.nextInt();
        int hargaBarang=0;

        if (x>=1 && x<=3) {
            switch (x) {
                case 1 -> hargaBarang = hargaStickerSet;
                case 2 -> hargaBarang = hargaNotebook;
                case 3 -> hargaBarang = hargaBuku;
            }
            kembalian = money - hargaBarang;
            if (money == hargaBarang) {
                System.out.println("Tidak mendapatkan kembalian");
            } else if ( money < hargaBarang) {
                System.out.println("Uang anda belum cukup");
            } else {
                int jmlSepuluhRibu = kembalian / 10000;
                int jmlSeribu = (kembalian - (jmlSepuluhRibu*10000)) / 1000;
                int jmlLimaRatus = (kembalian - (jmlSepuluhRibu*10000) - (jmlSeribu*1000)) / 500;
                int jmlSeratus = ((kembalian - (jmlSepuluhRibu*10000) - (jmlSeribu*1000)) % 500) / 100;

                System.out.println("Anda mendapatkan kembalian sebesar");
                System.out.println(jmlSepuluhRibu + " uang 10.000");
                System.out.println(jmlSeribu + " uang 1.000");
                System.out.println(jmlLimaRatus + " uang 500");
                System.out.println(jmlSeratus + " uang 100");

            }
        }
    }
}
