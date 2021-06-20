package Pertemuan10;

import java.util.Arrays;
import java.util.Scanner;

public class MencariTop3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int panjangData = in.nextInt();

        int[] arrayData = new int[panjangData];

        inputArray(arrayData,panjangData);
        reverseArray(arrayData);

        System.out.println(arrayData[0]+" "+arrayData[1]+" "+arrayData[2]);

    }

    private static void inputArray(int[] arrayData, int panjangData){
        Scanner in = new Scanner(System.in);
        for (int i=0 ; i<panjangData ; i++) {
            arrayData[i] = in.nextInt();
        }
    }

    private static void reverseArray(int[] dataArray){
        Arrays.sort(dataArray);
        int[] arrayBuffer = Arrays.copyOf(dataArray,dataArray.length);

        for (int i=0 ; i<arrayBuffer.length ; i++) {
            dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }

    }
}
