package Easy;

import java.util.Scanner;

public class DendaPerpustakaan {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int d1,d2,m1,m2,y1,y2;

        // INPUT 1 = Tanggal Pengembalian
        d1 = in.nextInt();
        m1 = in.nextInt();
        y1 = in.nextInt();

        // INPUT 2 = Tanggal Batas Pengembalian
        d2 = in.nextInt();
        m2 = in.nextInt();
        y2 = in.nextInt();

        // OPERASI
        if (d1 >=1 && d1 <= 31 && d2 >=1 && d2 <= 31
        &&  m1 >=1 && m1 <= 12 && m2 >=1 && m2 <= 12
        &&  y1 >=1920 && y1 <= 3000 && y2 >=1920 && y2 <= 3000) {
            int fine =0;
            if ( d1 > d2 && m1 == m2) {
                fine = (d1 - d2) * 15;
            } else if ( m1 > m2 && y1 == y2 ) {
                fine = (m1 - m2) * 500;
            } else if ( y1 > y2 ) {
                fine = (y1 - y2) * 10000;
            } else if ( (d1 > d2 || d1 < d2) && m1 > m2 && y1 < y2) {
                fine = (y2 - y1) * 10000;
            }
            System.out.printf("%s: %d","Fine",fine);
        }
    }
}
