package TugasLoopArray;

import java.util.Scanner;

public class ArrayPerkalianMatriks3x3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] Hasil = new int [3][3];

        // INPUT MATRIKS A
        System.out.println("Masukkan Matriks A :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                A[i][j] = scan.nextInt();
            }
        }
        // INPUT MATRIKS B
        System.out.println("\nMasukkan Matriks B :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                B[i][j] = scan.nextInt();
            }
        }
        // OPERASI PERKALIAN
        int buffer;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buffer = 0;
                for (int k = 0; k < 3; k++) {
                    buffer += A[i][k] * B[k][j];
                }
                Hasil[i][j] = buffer;
            }
        }
        // OUTPUT HASIL
        System.out.println("\nHasil Perkalian :");
        for(int i=0;i<3;i++){
            System.out.print("[\t");
            for(int j=0;j<3;j++){
                System.out.print(Hasil[i][j]);
                if (j<2){
                    System.out.print("\t");
                } else {
                    System.out.print("\t]");
                }
            }
            System.out.print("\n");
        }
    }
}
