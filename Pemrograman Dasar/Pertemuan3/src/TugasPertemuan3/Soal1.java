package TugasPertemuan3;

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        //Input
        System.out.printf("%-25s : ", "Masukkan operator pertama");
        int operator1 = inputUser.nextInt();
        System.out.printf("%-25s : ", "Masukkan operator kedua");
        int operator2 = inputUser.nextInt();
        //Penjumlahan
        int hasilPenjumlahan = operator1+operator2;
        System.out.printf("%-25s : %d\n", "Hasil penjumlahan",hasilPenjumlahan);
        //Pengurangan
        int hasilPengurangan = operator1-operator2;
        System.out.printf("%-25s : %d\n", "Hasil pengurangan",hasilPengurangan);
        //Perkalian
        int hasilPerkalian = operator1*operator2;
        System.out.printf("%-25s : %d\n", "Hasil perkalian",hasilPerkalian);
        //Pembagian
        float hasilPembagian = (float) operator1/operator2;
        System.out.printf("%-25s : %.2f\n", "Hasil pembagian",hasilPembagian);
    }
}
