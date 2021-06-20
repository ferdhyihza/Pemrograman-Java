package Array;

import java.util.Scanner;

public class BilanganPrima {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nilaiAwal, nilaiAkhir;
        nilaiAwal = scan.nextInt();
        nilaiAkhir = scan.nextInt();

        for (int i=nilaiAwal ; i<=nilaiAkhir ; i++){
            int temp = 0;
            for (int j=1 ; j <= i ; j++){
                if (i % j == 0) temp++;
            }
            if (temp == 2 ) System.out.print(i + " ");
        }
    }
}
