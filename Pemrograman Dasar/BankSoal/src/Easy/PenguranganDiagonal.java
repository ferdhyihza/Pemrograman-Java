package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class PenguranganDiagonal {

    public static void main(String[] args) {

        // INPUT BERUPA MATRIKS 3X3
        // OUTPUT = NILAI MUTLAK DIAGONAL 1 - DIAGONAL 2

        Scanner scan = new Scanner(System.in);

        int[][] matriks = new int[3][3];

        for (int i=0 ; i<3 ; i++){
            for (int j=0 ; j<3 ; j++){
                matriks[i][j] = scan.nextInt();
            }
        }

        int diagonal1 = matriks[0][0] + matriks[1][1] + matriks[2][2];
        int diagonal2 = matriks[0][2] + matriks[1][1] + matriks[2][0];


        int hasil = diagonal1 - diagonal2;
        if (hasil<0) hasil *= -1;
        System.out.println(hasil);

//        for (int i=0 ; i<3 ; i++){
//            System.out.print("[\t");
//            for (int j=0 ; j<3 ; j++){
//                System.out.print(matriks[i][j]);
//                if (j<2) {
//                    System.out.print("\t");
//                } else {
//                    System.out.print("\t]");
//                }
//            }
//            System.out.println();
//        }

    }
}
