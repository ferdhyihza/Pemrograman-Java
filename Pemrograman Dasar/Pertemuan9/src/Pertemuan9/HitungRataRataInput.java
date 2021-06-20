package Pertemuan9;

import java.util.Scanner;

public class HitungRataRataInput {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int angka = 1, banyakData = 0;
        double rataRata,jumlahData = 0.0;

        for (int i = 1; angka!=0; i++) {
            angka=scan.nextInt();
            jumlahData+=angka;
            banyakData=i;
        }
        rataRata = jumlahData / (banyakData-1);

        System.out.printf("%.2f",rataRata);
    }
}
