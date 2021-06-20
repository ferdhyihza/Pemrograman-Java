package TugasPraktikum;

import java.util.Scanner;

public class HitungLuasDanKeliling {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Menu :");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        int pilihanUser;
        do {
            System.out.print("Pilihan anda : ");

            pilihanUser = scan.nextInt();

            switch (pilihanUser) {
                case 1 -> {
                    int p, l;
                    System.out.print("Masukkan p : ");
                    p = scan.nextInt();
                    System.out.print("Masukkan l : ");
                    l = scan.nextInt();
                    int kelilingPersegiPanjang = 2 * (p + l);
                    int luasPersegiPanjang = p * l;
                    System.out.printf("\n%-25s: %d cm", "Keliling persegi panjang", kelilingPersegiPanjang);
                    System.out.printf("\n%-25s: %d cm2\n\n", "Luas persegi panjang", luasPersegiPanjang);
                }
                case 2 -> {
                    int r;
                    System.out.print("Masukkan r : ");
                    r = scan.nextInt();
                    double kelilingLingkaran = 2 * 22. / 7 * r;
                    double luasLingkaran = 22. / 7 * r * r;
                    System.out.printf("\n%-20s: %.0f cm", "Keliling Lingkaran", kelilingLingkaran);
                    System.out.printf("\n%-20s: %.0f cm2\n\n", "Luas Lingkaran", luasLingkaran);
                }
                case 3 -> {
                    int a, b, r;
                    System.out.print("Masukkan a : ");
                    a = scan.nextInt();
                    System.out.print("Masukkan b : ");
                    b = scan.nextInt();
                    System.out.print("Masukkan r : ");
                    r = scan.nextInt();
                    int kelilingSegitiga = a + b + r;
                    double luasSegitiga = 0.5 * a * b;
                    System.out.printf("\n%-20s: %d cm", "Keliling segitiga", kelilingSegitiga);
                    System.out.printf("\n%-20s: %.0f cm2\n\n", "Luas segitiga", luasSegitiga);
                }
                default -> System.out.println("Data tak ditemukan, program dihentikan ...");
            }
        } while (pilihanUser >= 1 && pilihanUser <=3);
    }
}
