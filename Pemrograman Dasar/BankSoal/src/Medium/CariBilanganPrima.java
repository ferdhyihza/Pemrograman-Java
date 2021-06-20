package Medium;

import java.util.Scanner;

public class CariBilanganPrima {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int awal = scan.nextInt();
        int akhir = scan.nextInt();

        for ( int i = awal ; i<akhir ; i++) {
            int c = 0;
            for (int j=1 ; j<=i ; j++) {
                if (i % j == 0) c++;
            }
            if (c == 2) System.out.print(i + " ");
        }
    }
}
