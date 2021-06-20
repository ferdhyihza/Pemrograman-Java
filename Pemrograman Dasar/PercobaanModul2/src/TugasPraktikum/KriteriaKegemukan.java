package TugasPraktikum;

import java.util.Scanner;

public class KriteriaKegemukan {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("%-10s: ","Berat badan (kg)");
        int beratBadan = scan.nextInt();
        System.out.printf("%-10s: ","Tinggi badan (m)");
        double tinggiBadan = scan.nextDouble();

        double IMT = beratBadan / (tinggiBadan*tinggiBadan);
        System.out.printf("%-5s = %-10.2f", "IMT", IMT);

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
