package PemusatanDataKelompok;

import java.util.Arrays;
import java.util.Scanner;

public class DistribusiFrekuensi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Banyak data : ");
        int banyakData = scan.nextInt();
        System.out.println("Input data");
        int[] arr = new int[banyakData];
        for (int i=0 ; i<banyakData ; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("=================");
        int Xmax = getMax(arr);
        int Xmin = getMin(arr);
        int jangkauan = Xmax-Xmin;
        System.out.println("Jangkauan = " + jangkauan);
        int banyakKelas = (int) (1+3.3*Math.log10(banyakData));
        System.out.println("Banyak kelas = " + banyakKelas);
        double panjangKelas = (double) jangkauan/banyakKelas;
        System.out.println("Panjang kelas = " + panjangKelas);
        printKolomTabulasi(arr);

    }

    public static int getMax(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int getMin(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static void printKolomTabulasi(int[] arr){
        Arrays.sort(arr);
        for (int s: arr
             ) {
            System.out.println(s);
        }
    }
}
