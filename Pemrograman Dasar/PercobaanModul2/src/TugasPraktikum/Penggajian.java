package TugasPraktikum;

import java.util.Scanner;

public class Penggajian {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Jam kerja\t: ");
        int jamKerja = scan.nextInt();
        int upah = 5000, lembur = 6000, denda = 1000;
        int jamLembur = 0, jamDenda = 0, jamKerjaMin = 50, jamKerjaMaks = 60;

        if (jamKerja < jamKerjaMin){
            jamDenda = jamKerjaMin-jamKerja;
            jamKerja = jamKerjaMin-jamDenda;
        } else if (jamKerja > jamKerjaMaks){
            jamLembur = jamKerja-jamKerjaMaks;
            jamKerja -= jamLembur;
        }

        int totalUpah = jamKerja*upah;
        int totalLembur = jamLembur*lembur;
        int totalDenda = jamDenda*denda;
        int totalSemua = totalUpah + totalLembur - totalDenda;

        System.out.printf("%-10s= Rp. %6d\n","Upah",totalUpah);
        System.out.printf("%-10s= Rp. %6d\n","Lembur",totalLembur);
        System.out.printf("%-10s= Rp. %6d\n","Upah",totalDenda);
        System.out.println("----------------------");
        System.out.printf("%-10s= Rp. %6d\n","Total",totalSemua);

    }
}
