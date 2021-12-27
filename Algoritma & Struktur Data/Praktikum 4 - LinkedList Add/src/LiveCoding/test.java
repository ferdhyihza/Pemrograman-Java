package LiveCoding;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char j = sc.next().charAt(0);
        int ascii = j;
        System.out.println(ascii%2);
    }
}
