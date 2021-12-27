package Searching;

import java.util.Scanner;

public class SequentialSearching {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] data = {2,1,6,4,5,3,8,9,7};

        System.out.print("Ingin mencari angka: ");
        int searchData = scan.nextByte();
        boolean found = false;

        System.out.print("Hasil: ");
        for (int i = 0; i < data.length; i++) {
            if (searchData == data[i]) {
                System.out.println("Data ditemukan pada indeks ke-" + i);
                found = true;
            }
        }
        if (!found) System.out.println("Data tidak ditemukan");
    }
}
