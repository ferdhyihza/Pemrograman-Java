package Soal1;

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        int randomNumber = (int) (Math.random()*100);

        System.out.print("Guess a number between 1 and 100! ");
        int tebakan = inputUser.nextInt();

        while (tebakan != randomNumber) {
            if (tebakan > randomNumber) {
                System.out.print("Too high! ");
            } else {
                System.out.print("Too low! ");
            }
            tebakan = inputUser.nextInt();
        }

        System.out.println("Correct!");
    }
}
