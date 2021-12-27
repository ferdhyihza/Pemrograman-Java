package Lc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();

        int jmlOrg = scan.nextInt();
        String inpBrg = scan.next();
        int brgIra = scan.nextInt();

        String[] arrInpBrg = inpBrg.split(",");

        for (int i = 0; i < jmlOrg; i++) {
            q.add(Integer.valueOf(arrInpBrg[i]));
        }

        int jmlAntri=0;

        while(brgIra>0) {
            int length = q.size();
            for (int i = 0; i < length; i++) {
                if (q.element() > 2) q.add(q.element() - 2);
                q.remove();
                jmlAntri++;
            }
            brgIra -=2;
        }
        System.out.println(jmlAntri);
    }
}
