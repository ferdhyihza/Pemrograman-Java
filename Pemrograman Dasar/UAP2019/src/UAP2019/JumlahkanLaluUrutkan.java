package UAP2019;

import java.util.Arrays;
import java.util.Scanner;

public class JumlahkanLaluUrutkan {

    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);

        String bilangan = "100 35 23 41 500";

        String[] arrBilStr = bilangan.split(" ");
        int panjangArrBilStr = arrBilStr.length;

        System.out.println(Arrays.toString(arrBilStr));

        int[] arrBilInt = new int[panjangArrBilStr];

        for (int i=0 ; i<panjangArrBilStr ; i++) {
            arrBilInt[i] = getSum(arrBilStr,i);
        }

        System.out.println(Arrays.toString(arrBilInt));

        int temp;
        for(int n=0;n<arrBilInt.length;n++){
            for(int m=n+1;m<arrBilInt.length;m++){
                if(arrBilInt[n] > arrBilInt[m]){   // use < for Descending order
                    temp = arrBilInt[n];
                    arrBilInt[n] = arrBilInt[m];
                    arrBilInt[m]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrBilInt));


    }

    public static int getSum (String[] arrBilStr, int index) {
        String isi = arrBilStr[index];
        //System.out.println(isi);
        String[] arrBilStrSplit = isi.split("");
        //System.out.println(Arrays.toString(arrBilStrSplit));

        int sum=0;
        for (String s : arrBilStrSplit) {
            int j = Integer.parseInt(s);
            sum += j;
        }
        //System.out.println(sum);
        return sum;
    }
}
