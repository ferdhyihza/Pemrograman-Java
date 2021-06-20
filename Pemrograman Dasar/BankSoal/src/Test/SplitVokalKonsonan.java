package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SplitVokalKonsonan {

    public static void main(String[] args) {

        ArrayList arrVokal = new ArrayList();
        ArrayList arrKonsonan = new ArrayList();
        String kata = "bang jago";

        String[] arrKata = kata.split("");
        System.out.println(Arrays.toString(arrKata));

        for (String s : arrKata) {
            if (s.equalsIgnoreCase("a") ||
                    s.equalsIgnoreCase("i") ||
                    s.equalsIgnoreCase("u") ||
                    s.equalsIgnoreCase("e") ||
                    s.equalsIgnoreCase("o")) {
                arrVokal.add(s);
            } else if (s.equalsIgnoreCase(" ")) {
            } else {
                arrKonsonan.add(s);
            }
        }

        System.out.println("Huruf vokal = " + arrVokal);
        System.out.println("Huruf konsonan = " + arrKonsonan);
    }
}
