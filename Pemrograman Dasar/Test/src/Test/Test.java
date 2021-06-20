package Test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int jarakMeter = in.nextInt();
        int waktuDetik = in.nextInt();

        double jarakKM = jarakMeter/1000.0;
        System.out.println(jarakKM);

        int jam = waktuDetik/3600;
        int menit = waktuDetik % 3600 / 60;
        int detik = waktuDetik % 3600 % 60;

        System.out.print(jam >= 10?jam + ":" : "0" + jam + ":");
        System.out.print(menit >= 10?menit + ":" :"0" + menit + ":");
        System.out.println(detik >= 10?detik:"0" + detik);
        double waktuJam = waktuDetik / 3600.0;

        double kecepatan = jarakKM / waktuJam;
        System.out.printf("%.2f",kecepatan);

    }
}
