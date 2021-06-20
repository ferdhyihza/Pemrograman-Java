package DistribusiSampling;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Rata-rata populasi : ");
        int avgPop = 500;//scan.nextInt();
        System.out.print("Simp baku populasi : ");
        int stdDevPop = 60;//scan.nextInt();
        System.out.print("Jumlah populasi : ");
        int N = 0;//scan.nextInt();
        System.out.print("Jumlah sample : ");
        int n = 50;//scan.nextInt();
        System.out.println("-------------------------------");
        System.out.print("X : ");
        String x = "510 520";//scan.nextLine();
        System.out.println("-------------------------------");

        String[] arrX = x.split(" ");

        System.out.println("Simp baku sampel : sigmaP   " + stdDevPop);
        System.out.println("                   ------" + " = " + "----" + " = " + (stdDevPop/Math.sqrt(n)));
        System.out.printf("                   akar n   %.2f", Math.sqrt(n));


    }


}
