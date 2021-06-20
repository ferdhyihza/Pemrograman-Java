package UAP2019;

import java.util.Arrays;
import java.util.Scanner;

public class KurangiDuaAngkaTerkecil {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int banyakData = in.nextInt();
        int[] array = new int [banyakData];

        for (int i = 0 ; i < banyakData ; i++) {
            array[i] = in.nextInt();
        }
        Arrays.sort(array);

        int hasil = array[1] - array[0];
        System.out.println(hasil);
    }
}
