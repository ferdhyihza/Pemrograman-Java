package IfElse;

public class IfElse {

    public static void main(String[] args) {

        String teks1 = "ABCD";
        String ab = "AB";
        String cd = "CD";
        String teks2 = ab+cd;

        // Untuk membandingkan 'ISI' string gunakanlah .equals
        if (teks1.equals(teks2)) {
            System.out.println("Isi string sama");
        } else {
            System.out.println("Isi string berbeda");
        }
    }
}
