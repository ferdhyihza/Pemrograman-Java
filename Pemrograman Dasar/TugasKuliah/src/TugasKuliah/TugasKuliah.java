package TugasKuliah;

import java.util.Arrays;
import java.util.Scanner;

public class TugasKuliah {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int pilihanOperasi,i,panjangArray;

        do {
            System.out.println("========================");
            System.out.println("Pilih Operasi :" +
                    "\n1 -> Mengurutkan data" +
                    "\n2 -> Menghitung rata-rata" +
                    "\n0 -> Berhenti");

            System.out.print("Masukkan pilihan : ");
            pilihanOperasi = in.nextInt();
            System.out.println("========================");

            if (pilihanOperasi == 1 || pilihanOperasi == 2) {
                System.out.print("Masukkan banyak data : ");
                panjangArray = in.nextInt();

                int[] dataArray = new int[panjangArray];
                for (i=0 ; i<panjangArray ; i++) {
                    System.out.print("Masukkan data ke-"+(i+1)+" : ");
                    dataArray[i] = in.nextInt();
                }

                if (pilihanOperasi == 1) {
                    urutkanArray(dataArray);
                    System.out.print("Urutan data : ");
                    System.out.println(Arrays.toString(dataArray));
                    System.out.println("Ingin hitung rata-ratanya juga? (Y/N) ");
                    String jawaban = in.next();
                    if (jawaban.equalsIgnoreCase("Y")) pilihanOperasi++;
                }

                if (pilihanOperasi == 2) {
                    double avg = hitungRataRata(dataArray);
                    System.out.printf("%s = %.2f\n", "Rata-rata",avg);
                }
            }

            if (pilihanOperasi > 2 && pilihanOperasi <10) System.out.println("Masukkan pilihan yang sesuai!");

        } while (pilihanOperasi != 0);

    }

    private static void urutkanArray(int[] dataArray){
        Arrays.sort(dataArray);
    }

    private static double hitungRataRata(int[] dataArray){
        double sum = 0;
        for (int value : dataArray) {
            sum += value;
        }
        return sum / dataArray.length;
    }
}
