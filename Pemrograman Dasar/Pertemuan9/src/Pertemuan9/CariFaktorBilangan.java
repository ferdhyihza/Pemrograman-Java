package Pertemuan9;

import java.util.Scanner;

public class CariFaktorBilangan {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = n ; i > 0 ; i--){
            if (n % i == 0){
                System.out.println(i);
            }
        }
    }
}
