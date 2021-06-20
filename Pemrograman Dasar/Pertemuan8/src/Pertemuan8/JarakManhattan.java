package Pertemuan8;

import java.util.Scanner;

public class JarakManhattan {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x1, x2, y1, y2, jarak;
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        x2 = scan.nextInt();
        y2 = scan.nextInt();

        if (x1 > x2 && y1 > y2) {
            jarak = (x1 - x2) + (y1 - y2);
            System.out.println(jarak);
        } else if (x1 > x2 && y1 < y2) {
            jarak = (x1 - x2) + (y1 - y2)*-1;
            System.out.println(jarak);
        } else if (x1 < x2 && y1 > y2) {
            jarak = (x1 - x2)*-1 + (y1 - y2);
            System.out.println(jarak);
        } else {
            jarak = (x1 - x2)*-1 + (y1 - y2)*-1;
            System.out.println(jarak);
        }

    }
}
