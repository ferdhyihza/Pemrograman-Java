package Pertemuan10;

import java.util.*;

public class CariModus1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int panjangData = in.nextInt(); // Input banyak data

        int[]dataArray = new int [panjangData]; // Membuat penyimpanan data

        int i, j, modusTerbesar = 0, poinA, poinB=0;

        for( i =0; i<panjangData ;i++){ // Input data
            dataArray[i] = in.nextInt();
        }

        Arrays.sort(dataArray); // Mengurutkan data mulai terkeci

        // Operasi
        for ( i=0 ; i<panjangData ; i++) {
            poinA = 0;
            for ( j=0 ; j<panjangData ; j++) {
                if (dataArray[i]==dataArray[j]){
                    poinA++;
                    if(i==0){
                        poinB=poinA;
                    }
                }
            }
            if(poinB<=poinA){
                poinB=poinA;
                modusTerbesar=dataArray[i];
                //System.out.print(poin1);
            }
        }
        System.out.println(modusTerbesar);
    }
}
