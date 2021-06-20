package UAP2020;

import java.util.Scanner;

public class BilanganPrimorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int[] dataPrima = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53};

        System.out.println(primorial(dataPrima,N));
    }

    public static long primorial(int[] data, int index) {

        long hasil = 1;
        for (int i=index ; i>=1 ; i--) {
            hasil *= data[index-i];

        }
        return hasil;
    }
}
