package Array;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        // ARRAY

        String [] nilaiKosong = new String[3];
        String [] nilaiIsi = {"88","93","98","100","94"};

        System.out.println("Print nilaiIsi");
        for (int i=0 ; i<nilaiIsi.length ; i++){
            System.out.print(nilaiIsi[i]+", ");
        }

        // COPY ISI ARRAY
        // System.arraycopy(nilaiIsi,0,nilaiKosong,0,3);

        nilaiKosong = nilaiIsi;

        System.out.println("\nPrint nilaiKosong");
        for (int i=0 ; i<nilaiKosong.length ; i++){
            System.out.print(nilaiKosong[i]+", ");
        }

        // ARRAY 2 DIMENSI

        int[][] nilaiku = new int[2][3];
        int[][] nilaikuIsi = {
                {1,2,3},
                {4,5,6}
        };

        System.out.println("\n\nPrint ARRAY 2D");
        System.out.println(Arrays.toString(nilaikuIsi));
        for (int i=0 ; i<nilaikuIsi.length ; i++){
            for (int j=0 ; j<nilaikuIsi[0].length ; j++){
                System.out.print(nilaikuIsi[i][j]+", ");
            }
        }


    }
}
