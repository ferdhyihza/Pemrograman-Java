package Medium;

import java.util.Scanner;

public class CariMinMax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int nilaiMin=0, nilaiMax=0;
        for ( int i=1 ; i<=n ; i++) {
            int angka = scan.nextInt();
            if (i == 1){
                nilaiMin = angka;
                nilaiMax = angka;
            }
            if (angka > nilaiMax) nilaiMax = angka;
            if (angka < nilaiMin) nilaiMin = angka;
        }
        System.out.println(nilaiMax + " " + nilaiMin);

    }
}
