package DiwalekPlusOs;

import java.util.Scanner;

public class DiwalekPlusOs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String inputKalimat = scan.nextLine();
        String[] arrInputKalimat = inputKalimat.split(" ");

        for (String s : arrInputKalimat) {
            reverseAndPrint(s);
        }

    }

    public static void reverseAndPrint(String text) {
        byte[] strAsByteArray = text.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - 1 - i];

        System.out.print(new String(result) + "os" + " ");
    }
}
