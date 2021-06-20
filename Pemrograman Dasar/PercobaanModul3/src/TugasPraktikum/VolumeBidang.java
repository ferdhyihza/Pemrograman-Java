package TugasPraktikum;

import java.util.Scanner;

public class VolumeBidang {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int inputUser;

        do{
            System.out.println("MENU");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.print("   MASUKKAN PILIHAN ANDA : ");
            inputUser = scan.nextInt();

            switch (inputUser){
                case 1 :
                    System.out.println("Menghitung volume balok\n");
                    break;
                case 2 :
                    System.out.println("Menghitung volume bola\n");
                    break;
                case 3 :
                    System.out.println("Menghitung volume kerucut\n");
                    break;
                case 4 :
                    System.out.println("Menghitung volume silinder\n");
                    break;
                case 5 :
                    System.out.println("Menghitung volume limas segitiga\n");
                    break;
            }
        } while (inputUser != 0 );

    }
}
