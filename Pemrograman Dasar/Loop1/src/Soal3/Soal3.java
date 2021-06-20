package Soal3;

import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        int randomNumber = (int) Math.round(Math.random()*100);

        System.out.print("Guess a number between 1 and 100! ");
        int tebakan = inputUser.nextInt();

        for (int i = 0 ; i < 100 ; i++) {

            if (tebakan > randomNumber) {
                System.out.print("Too high! ");
            } else if (tebakan < randomNumber) {
                System.out.print("Too low! ");
            } else {
                System.out.println("Correct!");
                break;
            }
            tebakan = inputUser.nextInt();
        }

    }
}
