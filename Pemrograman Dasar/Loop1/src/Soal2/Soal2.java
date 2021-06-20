package Soal2;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int masukan;
        int total = 0;

        do {
            System.out.print("Enter a number: ");
            masukan = in.nextInt();
            total = total + masukan;
        } while (masukan != 0);
        System.out.println("Sum = " + total);

    }
}
