package PercobaanModul3;

public class BreakContinue {

    public static void main(String[] args) {

        int nilai;
        System.out.println("Pernyataan break batas 10");
        for (nilai = 1 ; nilai <= 10 ; nilai++){
            if (nilai == 5) {
                break; // SELESAI
            } else {
                System.out.println(nilai);
            }
        }
        System.out.println("\nPernyataan continue batas 10");
        for (nilai = 1 ; nilai <= 10 ; nilai ++){
            if (nilai == 5) {
                continue; // SKIP
            } else {
                System.out.println(nilai);
            }
        }
    }
}
