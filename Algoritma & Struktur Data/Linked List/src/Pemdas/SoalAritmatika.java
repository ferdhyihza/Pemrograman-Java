package Pemdas;

import java.util.Random;
import java.util.Scanner;

public class SoalAritmatika {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Nama    : ");
        System.out.println("NIK     : ");
        System.out.println("\nSELAMAT DATANG DI SOAL ARITMATIKA");

        boolean statusProgram = true; // Biar program balik lagi ke menu ketika setelah pilih ingin belajar lagi = Y
        while (statusProgram) {
            Random random = new Random();
            int bil1 = random.nextInt(10);
            int bil2 = random.nextInt(10);
            System.out.println("\nSilakan pilih jenis aritmatika di bawah ini:" +
                    "\n1. Penjumlahan" +
                    "\n2. Pengurangan" +
                    "\n3. Perkalian\n");
            byte pil;
            // Biar inputan hanya bisa 1 sampai 3 saja, inputan selain itu akan terus dilooping sampai input pilihan benar (rentang 1-3)
            do {
                System.out.print("Pilih: ");
                pil = scan.nextByte();
                if (pil <1 || pil >3) System.out.println("Input salah, masukkan input yang benar!\n");
            } while (pil <1 || pil >3);
            boolean statusSoal = true; // Biar nanti bisa looping ketika jawaban salah
            while (statusSoal) {
                int jwbUser = 0, jwbBenar = 0;
                switch (pil) {
                    case 1 -> {
                        System.out.print("\nBerapakah " + bil1 + " + " + bil2 + "? ");
                        jwbUser = scan.nextInt();
                        jwbBenar = bil1 + bil2;
                    }
                    case 2 -> {
                        System.out.print("\nBerapakah " + bil1 + " - " + bil2 + "? ");
                        jwbUser = scan.nextInt();
                        jwbBenar = bil1 - bil2;
                    }
                    case 3 -> {
                        System.out.print("\nBerapakah " + bil1 + " x " + bil2 + "? ");
                        jwbUser = scan.nextInt();
                        jwbBenar = bil1 * bil2;
                    }
                }
                if (jwbUser == jwbBenar) {
                    System.out.println("Selamat Anda Benar!!!");
                    statusSoal = false; // Nah ini, kalo input jawaban benar, status soal jadi false, jadi dah keluar dari looping
                } else {
                    System.out.println("Maaf, coba lagi!"); // Kalo salah ya brarti kembali ke atas lagi (switch case)
                }
            }
            // Biar nanti looping ketika setelah ditanya ingin belajar lagi tapi inputannya selain y/t (huruf besar kecil diabaikan)
            boolean statusLagi = true;
            while (statusLagi) {
                System.out.print("Apakah ingin belajar lagi? (Y/T) ");
                String lagi = scan.next();
                if (lagi.equalsIgnoreCase("Y")) {
                    statusLagi = false; // inputan benar (y) maka status lagi jadi false / keluar dari looping pengecekan input ingin belajar lagi? (Y/T)
                    statusProgram = true; // tetep true biar balik lagi ke awal (menu)
                } else if (lagi.equalsIgnoreCase("T")) {
                    statusLagi = false; // keluar dari looping pengecekan input y/t
                    statusProgram = false; // keluar dari program
                    System.out.println("\nTERIMA KASIH");
                } else {
                    System.out.println("Input salah, masukkan input yang benar!");
                }
            }

        }
    }
}
