package LK11;

import java.util.Random;
import java.util.Scanner;

public class NewMain {

    static Random random = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] data = new int[5][10]; // Dimensi 1 : Soal | Dimensi 2 : Peserta

        for (int i=0 ; i<data.length ; i++) { // SOAL
            int bil1 = random.nextInt(10);
            int bil2 = random.nextInt(10);
            char oper = operator();
            double cek = hasil(bil1,oper,bil2);
            System.out.println("===================================");
            System.out.println("Soal : " + (i+1));
            System.out.println("Berapakah hasil " + bil1 + " " + oper + " " + bil2 + "?");
            for (int j=0 ; j<data[0].length ; j++) { // PESERTA
                System.out.print("Peserta : " + (j+1) + " | Jawab : ");
                double jawabPeserta = scan.nextDouble();
                if (jawabPeserta == cek) {
                    data[i][j] = 100;
                    benar();
                } else {
                    data[i][j] = 0;
                    salah();
                }
            }
        }

        System.out.println("=============== HASIL ===============");

        for (int i=0 ; i<data[0].length ; i++) { // PESERTA
            System.out.print("Peserta : " + (i+1) + " | Riwayat Nilai :");
            int sum=0;
            for (int j=0 ; j<data.length ; j++) { // SOAL
                System.out.print(" " + data[j][i]);
                sum += data[j][i];
            }
            System.out.println("\n- Jumlah jawaban benar : " + sum/100 + " dari " + data.length);
            System.out.println("- Rata-rata : " + sum/data.length + "/100");
        }

        System.out.println("========== % BENAR TIAP SOAL ==========");

        for (int i=0 ; i<data.length ; i++) { // SOAL
            int sum = 0;
            for (int j=0 ; j<data[0].length ; j++) { // PESERTA
                sum += data[i][j];
            }
            System.out.println("Persentase jawaban benar soal " + (i+1) + ": " + sum/data[i].length + "%");
        }


    }

    public static void benar(){
        System.out.println("Jawaban Anda benar, dapat nilai 100!!");
    }

    public static void salah(){
        System.out.println("Jawaban Anda Salah, yah nilainya 0!!");
    }

    public static char operator(){
        char[] op = {
                '+', '-', '*', '/'
        };
        return op[random.nextInt(4)];
    }

    public static double hasil(int bil1, char op, int bil2) {
        double hasil = 0;
        switch (op) {
            case '+' -> hasil = bil1+bil2;
            case '-' -> hasil = bil1-bil2;
            case '*' -> hasil = bil1*bil2;
            case '/' -> hasil = (double) bil1/bil2;
        }
        return hasil;
    }
}
