package Pertemuan10;

import java.util.Scanner;

public class RotasiMatriks1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[][] matriks = new int[N][M];

        for (int i=0 ; i<N ; i++) {
            for (int j=0 ; j<M ; j++) {
                matriks[i][j] = in.nextInt();
            }
        }

        for (int i=0 ; i<M ; i++) {
            for (int j=(N-1) ; j>=0 ; j--) {
                System.out.print(matriks[j][i]+" ");
            }
            System.out.println();
        }
    }
}
