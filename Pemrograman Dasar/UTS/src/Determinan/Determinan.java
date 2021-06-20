package Determinan;

import java.util.Scanner;

public class Determinan {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Input
        System.out.println("Masukkan matriks 3x3 = ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();
        int g = in.nextInt();
        int h = in.nextInt();
        int i = in.nextInt();

        /* Bentuk matriks = a b c
                            d e f
                            g h i
        */

        // Operasi
        int det = a*e*i + b*f*g + c*d*h - b*d*i - a*f*h - c*e*g;

        // Output
        System.out.printf("%s = %d", "Determinan", det);
    }
}
