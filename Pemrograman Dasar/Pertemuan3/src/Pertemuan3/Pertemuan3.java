package Pertemuan3;

import java.util.Scanner;

public class Pertemuan3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nama = scan.nextLine();
        String nim = scan.nextLine();
        String jurusan = scan.nextLine();
        int angkatan = scan.nextInt();     // Setelah int karena kursor masih belum turun
        String fakultas = scan.nextLine(); // <- ditambahin agar bisa ngeread nama
        fakultas = scan.nextLine();

        System.out.printf("Halo! Nama saya %s dengan nim %s dari %s %d %s.",nama,nim,jurusan,angkatan,fakultas);

    }
}
