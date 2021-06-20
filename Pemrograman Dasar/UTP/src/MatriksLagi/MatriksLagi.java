package MatriksLagi;

import java.util.Scanner;

public class MatriksLagi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c, d, p, q, r, s;

        // a b      p q
        // c d      r s

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        p = input.nextInt();
        q = input.nextInt();
        r = input.nextInt();
        s = input.nextInt();

        System.out.println("HASIL PERTAMBAHAN");
        System.out.printf("%d %d\n%d %d\n", a+p, b+q, c+r, d+s);

        System.out.println("HASIL PENGURANGAN");
        System.out.printf("%d %d\n%d %d\n", a-p, b-q, c-r, d-s);

        System.out.println("HASIL PERKALIAN");
        System.out.printf("%d %d\n%d %d\n", a*p+b*r, a*q+b*s, c*p+d*r, c*q+d*s);

    }
}
