package Pertemuan8;

import java.util.Scanner;

public class PenghitungIMT {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int beratBadan = scan.nextInt();
        double tinggiBadan = scan.nextDouble();

        double IMT = beratBadan / (tinggiBadan*tinggiBadan);

        System.out.println("Berat badan (kg) : " + beratBadan);
        System.out.println("Tinggi badan (m) : " + tinggiBadan);
        System.out.printf("%s : %.2f\n", "IMT",IMT);
        System.out.println(" ");

        if (IMT <= 18.5) {
            System.out.println("Termasuk kurus");
        } else if (IMT <= 25) {
            System.out.println("Termasuk normal");
        } else if (IMT <= 30) {
            System.out.println("Termasuk gemuk");
        } else {
            System.out.println("Termasuk kegemukan");
        }

    }
}
