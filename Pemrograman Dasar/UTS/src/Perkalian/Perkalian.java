package Perkalian;

import java.util.Scanner;

public class Perkalian {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Input
        System.out.println("Masukkan matriks A (2x2) =");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println("Masukkan matriks B (2x2) =");
        int p = in.nextInt();
        int q = in.nextInt();
        int r = in.nextInt();
        int s = in.nextInt();

        /* Bentuk matriks
        A = a b     B = p q     AB = w x
            c d         r s          y z
        */

        // Operasi
        double w = a*p + b*r;
        double x = a*q + b*s;
        double y = c*p + d*r;
        double z = c*q + d*s;

        // Output
        System.out.println("Hasil perkalian matriks A dan B =");
        System.out.printf("| %.1f  %.1f |\n",w,x);
        System.out.printf("| %.1f  %.1f |",y,z);


    }
}
