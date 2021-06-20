package TugasPertemuan3;

import java.util.*;

public class Soal2 {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        //Input
        System.out.println("Program penghitung pemakaian listrik sederhana");
        System.out.printf("%-33s: ", "Masukkan Nama");
        String nama = inputUser.nextLine();
        System.out.printf("%-33s: ", "Kelurahan");
        String kelurahan = inputUser.nextLine();
        System.out.printf("%-33s: ", "Masukkan posisi awal Kwh Meter");
        int awalKwh = inputUser.nextInt();
        System.out.printf("%-33s: ", "Masukkan posisi akhir Kwh Meter");
        int akhirKwh = inputUser.nextInt();
        System.out.printf("%-33s: ", "Masukkan biaya beban saat ini");
        int biayaBeban = inputUser.nextInt();
        System.out.printf("%-33s: ", "Masukkan PPJ (dalam persen)");
        float persenPPJ = inputUser.nextFloat();
//        //Operasi
        int pemakaianBulanIni = akhirKwh-awalKwh;
        int tarifListrik = pemakaianBulanIni*biayaBeban;
        int biayaPPJ = (int) ((persenPPJ/100.0f)*tarifListrik);
        int totalBayar = tarifListrik+biayaPPJ;
        //Output
        System.out.println("===================PLN Java===================");
        System.out.printf("%-33s: %s\n", "Nama", nama);
        System.out.printf("%-33s: %s\n", "Kelurahan", kelurahan);
        System.out.printf("%-33s: %d Kwh Meter\n", "Pemakaian bulan ini", pemakaianBulanIni);
        System.out.printf("%-33s: Rp %d,-\n", "Tarif Listrik", tarifListrik);
        System.out.printf("%-33s: Rp % 6d,-\n", "PPJ 10%", biayaPPJ);
        System.out.printf("%-33s: Rp %d,-\n", "Total Bayar", totalBayar);
        System.out.println("==============================================");
    }
}
