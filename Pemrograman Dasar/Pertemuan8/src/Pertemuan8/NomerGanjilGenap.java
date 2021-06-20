package Pertemuan8;

import java.util.Scanner;

public class NomerGanjilGenap {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        String output = (input % 2 == 0) ? "iki nomer Genap" : "iki nomer Ganjil";
        System.out.println(output);
    }
}
