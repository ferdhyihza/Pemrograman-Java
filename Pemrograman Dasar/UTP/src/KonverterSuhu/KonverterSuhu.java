package KonverterSuhu;

import java.util.Scanner;

public class KonverterSuhu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int suhuCelcius;
        double suhuR, suhuF, suhuK;

        suhuCelcius = input.nextInt();

        suhuR = 4/5.*suhuCelcius;
        suhuF = 9/5.*suhuCelcius+32;
        suhuK = suhuCelcius + 273.15;

        System.out.printf("%s : %.2f R\n", "Suhu Reamur", suhuR);
        System.out.printf("%s : %.2f F\n", "Suhu Fahrenheit", suhuF);
        System.out.printf("%s : %.2f K\n", "Suhu Kelvin", suhuK);
    }
}
