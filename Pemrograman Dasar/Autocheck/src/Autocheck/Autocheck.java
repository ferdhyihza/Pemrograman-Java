package Autocheck;

import java.util.Scanner;

public class Autocheck {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int pilihanUser;

        System.out.println("=========================\n" +
                "Program Pemeriksaan:" +
                "\n  1. Gula Darah" +
                "\n  2. Kolesterol" +
                "\n  3. Asam Urat" +
                "\n=========================");
        System.out.print("Masukkan pilihan anda: ");
        pilihanUser = in.nextInt();
        System.out.println("=========================");

        String status = null;
        switch (pilihanUser) {
            case 1 -> {
                int pilihanUserGulaDarah, kadarGulaDarah;
                System.out.println("PROGRAM PEMERIKSAAN GULA DARAH" +
                        "\n  1. Puasa 8 Jam" +
                        "\n  2. Puasa 2 Jam" +
                        "\n  3. Biasa" +
                        "\n-------------------------");
                System.out.print("Masukkan pilihan anda: ");
                pilihanUserGulaDarah = in.nextInt();
                System.out.println("-------------------------");
                switch (pilihanUserGulaDarah) {
                    case 1 -> System.out.println("Menjalankan Mode Puasa 8 Jam");
                    case 2 -> System.out.println("Menjalankan Mode Puasa 2 Jam");
                    case 3 -> System.out.println("Menjalankan Mode Biasa");
                }
                if (pilihanUserGulaDarah == 1 || pilihanUserGulaDarah == 2) {
                    System.out.print("Masukkan Kadar Gula Darah: ");
                    kadarGulaDarah = in.nextInt();
                    if (kadarGulaDarah < 100) {
                        status = "Normal";
                    } else if (kadarGulaDarah <= 125) {
                        status = "Pre-Diabet";
                    } else {
                        status = "Diabetes";
                    }
                }
                if (pilihanUserGulaDarah == 3) {
                    System.out.print("Masukkan Kadar Gula Darah: ");
                    kadarGulaDarah = in.nextInt();
                    if (kadarGulaDarah <= 200) {
                        status = "Normal";
                    } else {
                        status = "Diabetes";
                    }
                }
            }
            case 2 -> {
                int kadarKolesterol;
                System.out.println("PROGRAM PEMERIKSAAN KOLESTEROL");
                System.out.println("Wajib Puasa 9 - 12 Jam");
                System.out.print("Masukkan Kadar Kolesterol: ");
                kadarKolesterol = in.nextInt();
                if (kadarKolesterol <= 200) {
                    status = "Normal";
                } else {
                    status = "Tinggi";
                }
            }
            case 3 -> {
                System.out.println("PROGRAM PEMERIKSAAN ASAM URAT");
                System.out.println("Wajib Puasa 10 - 12 Jam");
            }
            default -> System.out.println("Pilihan anda tidak sesuai");
        }

        if (pilihanUser >=1 && pilihanUser <=3) System.out.println("Hasilnya: "+status);
    }
}
