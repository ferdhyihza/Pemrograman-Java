package TugasPraktikum;

import java.util.Scanner;

public class ProgramBilanganPrima2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan bilangan prima: ");
        int bilangan = scan.nextInt();

        if (cekPrima(bilangan)) {
            System.out.printf("Bilangan %d termasuk bilangan prima\n", bilangan);
        } else {
            System.out.printf("Bilangan %d bukan termasuk bilangan prima\n", bilangan);
        }

        System.out.println("Program menentukan bilangan prima 1-100");
        for (int i=2 ; i<=100 ; i++){
            if (cekPrima(i)) System.out.print(i + " ");
        }
    }

    private static boolean cekPrima (int bilangan) {
        int faktor = 0;
        for (int pembagi = 1 ; pembagi<=bilangan ; pembagi++) {
            if (bilangan % pembagi == 0) faktor++;
        }
        return (faktor == 2);
    }
}
