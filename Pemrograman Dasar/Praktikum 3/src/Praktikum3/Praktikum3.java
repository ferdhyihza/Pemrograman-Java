package Praktikum3;

import java.util.Scanner;

public class Praktikum3 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int var1, var2, var3, varTemp;

        System.out.println("=== Program Mengurutkan 3 Bilangan===\n");
        System.out.print("Masukkan angka pertama = ");
        var1 = userInput.nextInt();
        System.out.print("Masukkan angka kedua   = ");
        var2 = userInput.nextInt();
        System.out.print("Masukkan angka ketiga  = ");
        var3 = userInput.nextInt();

        if(var1 <=v ar2){
        } else {
            varTemp = var1;
            var1 = var2;
            var2 = varTemp;
        }

    }
}
