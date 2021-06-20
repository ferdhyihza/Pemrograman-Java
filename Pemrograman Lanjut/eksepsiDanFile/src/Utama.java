import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utama {

    private static boolean continueInput = true;


    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);


       // if(b!=0) {
           //   try {
           //       System.out.println("masukan angka A");
             //     int a = input.nextInt();
             //     System.out.println("masukan angka B");
             //     int b = input.nextInt();
           // System.out.println("hasil pembagian adalah : " + a / b); // pembagian(a, b));
           //  } catch (InputMismatchException e) {
            //   e.printStackTrace();
            // }
      //  }
       // else{
       //     System.out.println("pembagi tidak boleh 0");
       // }

       // System.out.println("statement akhir ini jalan");

         do {
            try {
                System.out.println("masukan angka A");
                int ax = input.nextInt();
                System.out.println("masukan angka B");
                int bx = input.nextInt();
                System.out.println("hasil pembagian adalah : "+pembagian(ax,bx));
                continueInput = false;
            }

            catch (ArithmeticException ex)
            {
                //ex.printStackTrace();
                System.out.println(ex.getMessage());

                continueInput = false;
            }
        } while (continueInput);

        System.out.println("statement akhir");



    }
    public static float pembagian(int a, int b) throws ArithmeticException
    {

        if(b!=0) {
            return a / b;
        }
        else {

            throw new ArithmeticException("pembagi tidak boleh 0");
        }


    }


}
