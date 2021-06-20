package Pertemuan8;

import java.util.Scanner;

public class IpinBelajarBerhitung {

    static String[] bilangan={"","satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh","sebelas"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new IpinBelajarBerhitung().bacaBilangan(sc.nextInt()));
    }
    public static String bacaBilangan(Integer angka){
        if(angka < 12)
            return bilangan[angka.intValue()];
        if(angka >=12 && angka <= 19)
            return bilangan[angka.intValue() % 10] + " belas";
        if(angka >= 20 && angka <= 99)
            return bacaBilangan(angka / 10) + " puluh " + bilangan[angka.intValue() % 10];
        if(angka >= 100 && angka <= 199)
            return "seratus " + bacaBilangan(angka % 100);
        if(angka >= 200 && angka <= 999)
            return bacaBilangan(angka / 100) + " ratus " + bacaBilangan(angka % 100);
        return "";
    }
}
