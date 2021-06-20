package KelasC;

import java.util.Scanner;

class Kalkulator {

    static int jumlahPakai=0;

    int hitung(int angka) {
        jumlahPakai++;
        return angka*angka*angka;
    }

    double hitung(double angka) {
        jumlahPakai++;
        return angka*8.4;
    }

    double hitung (double angka1, double angka2, char operator) {
        jumlahPakai++;
        double hasil = 0;
        switch (operator){
            case '+' : {
                hasil = angka1 + angka2;
                break;
            }
            case '-' : {
                hasil = angka1 - angka2;
                break;
            }
            case '*' : {
                hasil = angka1 * angka2;
                break;
            }
            case '/' : {
                hasil = angka1 / angka2;
                break;
            }
            default:
        }
        return hasil;
    }

    public int getJumlahPakai() {
        return jumlahPakai;
    }
}

public class Kalqulator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        String selectedMenu = "";
        while (!selectedMenu.equals("SELESAI")) {
            selectedMenu = in.next();
            switch (selectedMenu) {
                case "CARA_1" -> {
                    int input = in.nextInt();
                    int hasil = kalkulator.hitung(input);
                    System.out.printf("Cara 1: %d\n", hasil);
                }
                case "CARA_2" -> {
                    double input = in.nextDouble();
                    double hasil = kalkulator.hitung(input);
                    System.out.printf("Cara 2: %f\n", hasil);
                }
                case "CARA_3" -> {
                    double input1 = in.nextDouble();
                    double input2 = in.nextDouble();
                    char operator = in.next().charAt(0);
                    double hasil = kalkulator.hitung(input1, input2, operator);
                    System.out.printf("Cara 3: %f\n", hasil);
                }
            }
        }
        System.out.printf("Kalkulator telah melakukan komputasi" +
                " sebanyak %d kali\n", kalkulator.getJumlahPakai());
    }
}
