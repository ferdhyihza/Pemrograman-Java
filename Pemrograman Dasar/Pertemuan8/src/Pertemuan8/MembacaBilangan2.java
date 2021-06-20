package Pertemuan8;

import java.util.Scanner;

public class MembacaBilangan2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int angka, ratusan, puluhan, satuan;

        do {
            System.out.print("\nMasukan angka : ");
            angka = scan.nextInt();

            ratusan = angka / 100;
            puluhan = (angka / 10) % 10;
            satuan = angka % 10;

//        System.out.println("Ratusan = " + ratusan);
//        System.out.println("Puluhan = " + puluhan);
//        System.out.println("Satuan = " + satuan);

            switch (ratusan){
                case 1 -> System.out.print("seratus ");
                case 2 -> System.out.print("dua ratus ");
                case 3 -> System.out.print("tiga ratus ");
                case 4 -> System.out.print("empat ratus ");
                case 5 -> System.out.print("lima ratus ");
                case 6 -> System.out.print("enam ratus ");
                case 7 -> System.out.print("tujuh ratus ");
                case 8 -> System.out.print("delapan ratus ");
                case 9 -> System.out.print("sembilan ratus ");
            }

            switch (puluhan){
                case 2 -> System.out.print("dua puluh ");
                case 3 -> System.out.print("tiga puluh ");
                case 4 -> System.out.print("empat puluh ");
                case 5 -> System.out.print("lima puluh ");
                case 6 -> System.out.print("enam puluh ");
                case 7 -> System.out.print("tujuh puluh ");
                case 8 -> System.out.print("delapan puluh ");
                case 9 -> System.out.print("sembilan puluh ");
            }

            if (puluhan == 1){
                switch (satuan){
                    case 0 -> System.out.print("sepuluh ");
                    case 1 -> System.out.print("sebelas ");
                    case 2 -> System.out.print("dua belas ");
                    case 3 -> System.out.print("tiga belas ");
                    case 4 -> System.out.print("empat belas ");
                    case 5 -> System.out.print("lima belas ");
                    case 6 -> System.out.print("enam belas ");
                    case 7 -> System.out.print("tujuh belas ");
                    case 8 -> System.out.print("delapan belas ");
                    case 9 -> System.out.print("sembilan belas ");
                }
            } else {
                switch (satuan){
                    case 1 -> System.out.print("satu ");
                    case 2 -> System.out.print("dua ");
                    case 3 -> System.out.print("tiga ");
                    case 4 -> System.out.print("empat ");
                    case 5 -> System.out.print("lima ");
                    case 6 -> System.out.print("enam ");
                    case 7 -> System.out.print("tujuh ");
                    case 8 -> System.out.print("delapan ");
                    case 9 -> System.out.print("sembilan ");
                }
            }
        } while (angka != 0);
    }
}
