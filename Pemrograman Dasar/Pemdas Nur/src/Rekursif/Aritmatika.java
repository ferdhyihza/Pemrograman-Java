package Rekursif;

public class Aritmatika {

    public static void main(String[] args) {
        System.out.println(hitungAritmetika(2,2,5));
    }

    public static int hitungAritmetika(int a, int b, int n) {
        System.out.print(a + ", ");
        a+=b;
        n--;
        if (n == 1) return a;
        else return hitungAritmetika(a,b,n);
    }
}
