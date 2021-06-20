package TugasPraktikum;

import java.util.Scanner;

public class ProgramPermutasiKombinasi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int pilihan, n, r;

        do {
            System.out.println("Program Penghitung Kombinasi dan Permutasi" +
                    "\n1. Menghitung Permutasi" +
                    "\n2. Menghitung Kombinasi" +
                    "\n3. Keluar");
            System.out.print("Masukkan pilihan anda : ");
            pilihan = scan.nextInt();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan nilai n : ");
                    n = scan.nextInt();
                    System.out.print("Masukkan nilai r : ");
                    r = scan.nextInt();
                    System.out.printf("%11s\nnPr = -------- = %d\n%13s\n", "n!", hitungPermutasi(n,r), "(n-r)!" );
                    System.out.println("Maka Hasil Permutasinya adalah : " + hitungPermutasi(n,r) + "\n");
                }
                case 2 -> {
                    System.out.print("Masukkan nilai n : ");
                    n = scan.nextInt();
                    System.out.print("Masukkan nilai r : ");
                    r = scan.nextInt();
                    System.out.printf("%13s\nnCr = ----------- = %d\n%17s\n", "n!", hitungKombinasi(n,r), "(n-r)! x r!" );
                    System.out.println("Maka Hasil Kombinasinya adalah : " + hitungKombinasi(n,r) + "\n");
                }
                case 3 -> {
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    System.exit(0);
                }
                default -> System.out.println("Masukkan pilihan yang sesuai!\n");
            }
        } while (true);
    }

    private static int hitungPermutasi(int n, int r) {
        return faktorial(n) / faktorial(n-r);
    }

    private static int hitungKombinasi(int n, int r) {
        return faktorial(n) / (faktorial(n-r)*faktorial(r));
    }

    private static int faktorial (int x) {
        for (int i=x-1 ; i>=1 ; i--) x*=i;
        return x;
    }
}
