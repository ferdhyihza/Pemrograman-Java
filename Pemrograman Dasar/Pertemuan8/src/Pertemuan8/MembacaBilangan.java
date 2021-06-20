package Pertemuan8;

import java.util.Scanner;

public class MembacaBilangan {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int angka, ratusan, puluhan, belasan, satuan;

        System.out.print("Masukan angka : ");
        angka = scan.nextInt();

        ratusan = angka / 100;
        puluhan = (angka / 10) % 10;
        belasan = angka % 100;
        satuan = angka % 10;

        System.out.println("Ratusan = " + ratusan);
        System.out.println("Puluhan = " + puluhan);
        System.out.println("Belasan = " + belasan);
        System.out.println("Satuan = " + satuan);

        if (angka>=0 && angka<=999) {
            if (angka==0) {
                System.out.print("nol");
            } switch (ratusan){
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
            if (puluhan==1 && belasan%10==0) {
                System.out.print("sepuluh ");
            } switch (puluhan) {
                case 2 -> System.out.print("dua puluh ");
                case 3 -> System.out.print("tiga puluh ");
                case 4 -> System.out.print("empat puluh ");
                case 5 -> System.out.print("lima puluh ");
                case 6 -> System.out.print("enam puluh ");
                case 7 -> System.out.print("tujuh puluh ");
                case 8 -> System.out.print("delapan puluh ");
                case 9 -> System.out.print("sembilan puluh ");
            }if (belasan==11) {
                System.out.print("sebelas");
            }if (satuan==1 && belasan!=11) {
                System.out.print("satu ");
            }
            switch (satuan) {
                case 2 -> System.out.print("dua ");
                case 3 -> System.out.print("tiga ");
                case 4 -> System.out.print("empat ");
                case 5 -> System.out.print("lima ");
                case 6 -> System.out.print("enam ");
                case 7 -> System.out.print("tujuh ");
                case 8 -> System.out.print("delapan ");
                case 9 -> System.out.print("sembilan ");
            }
            if (puluhan==1 && belasan!=10 && belasan!=11) {
                System.out.print("belas");
            }
        }
    }
}
