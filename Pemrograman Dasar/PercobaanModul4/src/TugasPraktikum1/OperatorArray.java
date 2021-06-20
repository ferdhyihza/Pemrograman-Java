package TugasPraktikum1;

import java.util.Arrays;
import java.util.Scanner;

public class OperatorArray {

    private static int[] dataArray = new int[0];

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int pilihanUser;

        do {
            System.out.print("Program Sederhana" +
                    "\n1. Input Data" +
                    "\n2. Lihat Data" +
                    "\n3. Average" +
                    "\n4. Sum" +
                    "\n5. Max" +
                    "\n6. Min" +
                    "\n7. Keluar" +
                    "\nMasukkan nilai : ");
            pilihanUser = scan.nextInt();

            switch (pilihanUser) {
                case 1 -> inputData();
                case 2 -> lihatData();
                case 3 -> lihatAverage();
                case 4 -> lihatSum();
                case 5 -> lihatMax();
                case 6 -> lihatMin();
                case 7 -> System.exit(0);
                default -> System.out.println("Masukkan opsi yang sesuai!\n");
            }



        } while (true);
    }

    private static void inputData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("Anda memilih program Input Data");
        System.out.print("Mau berapa banyak data? ");
        int banyakData = scan.nextInt();
        System.out.println("Oke, "+banyakData+" data yaa~");
        dataArray = new int[banyakData];
        System.out.print("Sekarang, ");
        for (int i=0 ; i<banyakData ; i++){
            System.out.print("Input data ke-" + (i+1) +": ");
            dataArray[i] = scan.nextInt();
        }
        System.out.println("====================\n");
    }

    private static void lihatData() {
        System.out.println("====================");
        System.out.println("Anda memilih program Lihat Data");
        System.out.print("Ini dia datanya : ");
        System.out.println(Arrays.toString(dataArray));
        System.out.println("====================\n");
    }

    private static void lihatAverage() {
        System.out.println("====================");
        System.out.println("Anda memilih program Average");
        System.out.printf("Ini dia rata-ratanya : %.2f\n", average(dataArray));
        System.out.println("====================\n");
    }

    private static void lihatSum() {
        System.out.println("====================");
        System.out.println("Anda memilih program Average");
        System.out.print("Ini dia jumlah keseluruhan data : ");
        System.out.println(sum(dataArray));
        System.out.println("====================\n");
    }

    private static void lihatMax() {
        System.out.println("====================");
        System.out.println("Anda memilih program Max");
        System.out.print("Ini dia nilai terbesarnya : ");
        System.out.println(max(dataArray));
        System.out.println("====================\n");
    }

    private static void lihatMin() {
        System.out.println("====================");
        System.out.println("Anda memilih program Min");
        System.out.print("Ini dia nilai terkecilnya : ");
        System.out.println(min(dataArray));
        System.out.println("====================\n");
    }

    private static int max(int[] dataArray) {
        int max= Integer.MIN_VALUE;
        for (int value : dataArray) {
            if (value>max) max = value;
        }
        return max;
    }

    private static int min(int[] dataArray) {
        int min= Integer.MAX_VALUE;
        for (int value : dataArray) {
            if (value<min) min = value;
        }
        return min;
    }

    private static int sum(int[] dataArray) {
        int sum=0;
        for (int value : dataArray) {
            sum += value;
        }
        return sum;
    }

    private static double average(int[] dataArray) {

        return (double) sum(dataArray)/dataArray.length;
    }
}
