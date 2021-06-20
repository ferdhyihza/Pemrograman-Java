package Pertemuan9;

import java.util.Scanner;

public class PolaBintang1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int jmlBarisBintang;

        jmlBarisBintang = scan.nextInt();

        for (int i = 1 ; i <= jmlBarisBintang ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
