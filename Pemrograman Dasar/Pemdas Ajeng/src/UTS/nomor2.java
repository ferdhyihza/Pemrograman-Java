package UTS;

import java.util.Scanner;

public class nomor2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.print("Masukkan persentase bunga: ");
        int persenBunga = 10;
//        System.out.print("Masukkan plafon kredit: ");
        int plafon = 120000000;
//        System.out.print("Masukkan jangka waktu pembayaran (dalam bulan): ");
        long jangkaWaktu = 12;

        // Rumus besasr cicilan pokok
        int cicilanPokok = (int) (plafon / jangkaWaktu);
        // Rumus Bunga
        int bunga = (int) ((persenBunga * plafon) / jangkaWaktu);
        // RUmus Angsuran
        System.out.printf("%40s: %-10d\n", "Besar cicilan pokok setiap bulan",  cicilanPokok);
        System.out.printf("%40s: %-10d\n", "Bunga",  bunga);
        System.out.printf("%40s: %-10d\n", "Angsuran", (cicilanPokok + bunga));

    }
}
