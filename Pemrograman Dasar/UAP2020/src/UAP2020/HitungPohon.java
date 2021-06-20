package UAP2020;

import java.util.Scanner;

public class HitungPohon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int r = in.nextInt();
        int b = in.nextInt();

        // Kode penyelesaian masalah

        int jmlPohon = 0;
        char[][] peta = new char[m][n];
        int posisiX = 0;
        int posisiY = 0;

        for (int x = 0; x < m; x++) {
            String inputPeta = in.next();
            for (int y = 0; y < n; y++) {
                peta[x][y] = inputPeta.charAt(y);
            }
        }

        do {
            if (peta[posisiX][posisiY % n] == '#') {
                jmlPohon++;
            }
            posisiX += b;
            posisiY += r;
        } while (posisiX < m);

        System.out.println(jmlPohon);
    }
}
