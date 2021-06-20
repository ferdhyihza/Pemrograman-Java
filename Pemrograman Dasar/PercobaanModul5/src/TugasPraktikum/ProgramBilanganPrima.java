package TugasPraktikum;

import java.util.Scanner;

public class ProgramBilanganPrima {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan bilangan prima: ");
        int bil = scan.nextInt();

        cekPrimaDanPrint(bil);

        System.out.println("Program menentukan bilangan prima 1-100");
        for (int i=2 ; i<=100 ; i++){
            int c=0;
            for (int j=1 ; j <= i ; j++){
                if (i % j == 0) c++;
            }
            if (c == 2 ) System.out.print(i + " ");
        }
    }

    private static void cekPrimaDanPrint(int bil) {
        if ( bil > 1) {
            if ((bil==2) || (bil==3) || (bil==5)) {
                System.out.printf("Bilangan %d termasuk bilangan prima\n", bil);
            } else {
                if ((bil%2==0) || (bil%3==0) || (bil%5==0)) {
                    System.out.printf("Bilangan %d termasuk bukan bilangan prima\n", bil);
                } else {
                    System.out.printf("Bilangan %d termasuk bilangan prima\n", bil);
                }
            }
        } else {
            System.out.println("Bilangan harus lebih dari 1!");
        }
    }
}
