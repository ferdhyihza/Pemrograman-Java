package Pertemuan10;

import java.util.*;

public class CariSubsquareMaksimum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int maks=0,i,j,p,q;

        int[][] matrix = new int[4][4]; // Membuat array data

        // Memasukkan data
        for ( i=0 ; i<4 ; i++) {
            for ( j=0 ; j<4 ; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int[][] matrixBuffer = new int[3][3]; // Membuat array untuk menyimpan sum tiap subsquare

        // Operasi
        for ( i = 0; i < 3; i++) { // Baris
            for ( j = 0; j < 3; j++) { // Kolom
                int sum = 0;
                for ( p = i; p < 2 + i; p++) { // Baris Subsquare
                    for ( q = j; q < 2 + j; q++) { // Kolom Subsquare
                        sum += matrix[p][q]; // Hasil penjumlahan subsquare
                    }
                }
                matrixBuffer[i][j] = sum; // Penyimpanan nilai
                if (matrixBuffer[i][j] > maks) maks = matrixBuffer[i][j]; // Mencari nilai max
            }
        }
        System.out.println(maks); // Output sum subsquare tertinggi
    }
}
