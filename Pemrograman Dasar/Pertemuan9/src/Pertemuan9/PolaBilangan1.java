package Pertemuan9;

import java.util.Scanner;

public class PolaBilangan1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        for (int i = 1; i <=n; i++) {
            if (i%k==0){
                System.out.print("* ");
            }
            else {
                System.out.print(i+" ");
            }
        }
    }
}
