package Pertemuan10;

import java.util.Scanner;

public class CariSubsquareMaksimum2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int maks=0,i,j;

        int[][] matrix = new int[4][4]; // Membuat array data

        // Memasukkan data
        for ( i=0 ; i<4 ; i++) {
            for ( j=0 ; j<4 ; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        // Operasi
        for ( i = 0; i < 3; i++) { // Baris
            for ( j = 0; j < 3; j++) { // Kolom
                int temp = matrix[i][j] + matrix[i][j+1] + matrix[i+1][j] + matrix[i+1][j+1];
                if (temp > maks) maks = temp;
            }
        }
        System.out.println(maks); // Output sum subsquare tertinggi
    }
}
