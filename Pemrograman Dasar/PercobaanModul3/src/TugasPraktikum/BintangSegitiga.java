package TugasPraktikum;

import java.util.Scanner;

public class BintangSegitiga {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = scan.nextInt();

        for (int i=0 ; i<n ; i++){
            for (int j=n ; j>0 ; j--){
                if (j-i > 1){
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
