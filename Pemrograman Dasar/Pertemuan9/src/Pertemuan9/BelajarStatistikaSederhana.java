package Pertemuan9;

import java.util.Scanner;

public class BelajarStatistikaSederhana {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nilaiMin = 0, nilaiMax = 0;
        int range, angka;

        range = scan.nextInt();

        for (int i = 1 ; i <= range ; i++){
            angka = scan.nextInt();
            if (i == 1){
                nilaiMin = angka;
                nilaiMax = angka;
            }
            if (angka > nilaiMax) nilaiMax = angka;
            if (angka < nilaiMin) nilaiMin = angka;
        }
        System.out.println("Min : " + nilaiMin);
        System.out.println("Max : " + nilaiMax);
    }
}
