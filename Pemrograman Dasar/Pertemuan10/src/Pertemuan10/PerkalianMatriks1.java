package Pertemuan10;

import java.util.Scanner;

public class PerkalianMatriks1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int P = in.nextInt();

        int[][] matriksA = new int[N][M];
        for ( int i=0 ; i < N ; i++) {
            for ( int j=0 ; j < M ; j++) {
                matriksA[i][j] = in.nextInt();
            }
        }

        int[][] matriksB = new int[M][P];
        for ( int i=0 ; i < M ; i++) {
            for ( int j=0 ; j < P ; j++) {
                matriksB[i][j] = in.nextInt();
            }
        }

        int[][] hasilPerkalian = new int[N][P];

        int buffer;
        for (int i=0 ; i<N ; i++) {
            for (int j=0 ; j<P ; j++) {
                buffer=0;
                for (int k=0 ; k<M ; k++) {
                    buffer += matriksA[i][k] * matriksB[k][j];
                }
                hasilPerkalian[i][j] = buffer;
            }
        }

        for ( int i=0 ; i < N ; i++) {
            for ( int j=0 ; j < P ; j++) {
                System.out.print(hasilPerkalian[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
