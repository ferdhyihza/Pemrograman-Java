import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utama {

    private static boolean continueInput = true;


    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan angka A");
        int a = input.nextInt();
        System.out.println("masukan angka B");
        int b = input.nextInt();

     //   try {
            System.out.println("hasil pembagian adalah : " +  pembagian(a, b));
      //  } catch (ArithmeticException e) {
       //     System.out.println(e.getMessage());;
       // }

        System.out.println("ini jalan");

        /** do {
            try {
                System.out.println("masukan angka A");
                int ax = input.nextInt();
                System.out.println("masukan angka B");
                int bx = input.nextInt();
                System.out.println("hasil pembagian adalah : "+pembagian(ax,bx));
                continueInput = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                        "Incorrect input: an integer is required)");
                input.nextLine(); // discard input
            }
        } while (continueInput); **/



    }
    public static float pembagian(int a, int b) throws ArithmeticException
    {

        return a/b;

    }


}
