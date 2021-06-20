package TebakAngka;

import java.util.Arrays;
import java.util.Scanner;

public class TebakAngka {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int almost=0;
        int benar=0;
        int salah;

        String strTebakan = "513";
        String[] arrTebakan = strTebakan.split("");

        String strAngka = scan.next();
        String[] arrAngka = strAngka.split("");

        if (Arrays.equals(arrTebakan,arrAngka)) {
            System.out.println("Tebakan anda sempurna!");
        } else {
//
            for (int i=0 ; i<3 ; i++) {
                for (int j=0 ; j<3 ; j++) {
                    if (i == j) {
                        if (arrAngka[i].equals(arrTebakan[j])) ++benar;
                    }
                    else {
                        if (arrAngka[i].equals(arrTebakan[j])) ++almost;
                    }
                }
            }

            salah = 3 - benar - almost;
            if (benar != 0 ) System.out.println(benar  + " angka benar di posisi benar");
            if (almost !=0 ) System.out.println(almost + " angka benar di posisi salah");
            if (salah !=0  ) System.out.println(salah  + " angka salah");
        }
    }
}
