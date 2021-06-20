package LatihanUAP;

import java.util.Scanner;

public class AduUNO {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int jmlKartu = scan.nextInt();
        int jmlPemain = scan.nextInt();

        String[] kartu = new String[jmlKartu];
        for(int i = 0; i < jmlKartu; i++){
            kartu[i] = scan.next();
        }

        int pemainTerakhir = 0;
        int reverse = 0;

        for(int i = 0; i < jmlKartu; i++){
            if(reverse % 2 == 0){
                pemainTerakhir++;
                if(pemainTerakhir > jmlPemain){
                    pemainTerakhir = 1;
                }
            } else {
                pemainTerakhir--;
                if(pemainTerakhir == 0){
                    pemainTerakhir = jmlPemain;
                }
            }

            if(kartu[i].equals("reverse")){
                reverse = reverse + 1;
            }
        }

        System.out.println(pemainTerakhir);
    }
}
