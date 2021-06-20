package UAP2019;

import java.util.Scanner;

public class JumlahSampaiDapatSatuAngka {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long num = scan.nextLong();
        long sum = 0, sum2 = 0;
        String number = String.valueOf(num);
        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            sum += j;
        }

        if (sum > 9) {
            number = String.valueOf(sum);
            for(int i = 0; i < number.length(); i++) {
                int j = Character.digit(number.charAt(i), 10);
                sum2 += j;
            }
            System.out.println(sum2);
        } else {
            System.out.println(sum);
        }
    }
}
