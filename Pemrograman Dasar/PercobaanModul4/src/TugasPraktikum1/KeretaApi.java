package TugasPraktikum1;

import java.util.ArrayList;

public class KeretaApi {

    public static void main(String[] args) {

        String[][] dataKereta = {
                {"Ekonomi", "50000", "2%", "Tidak Ada", "Tidak Ada"},
                {"Bisnis", "100000", "5%", "Ada", "Tidak Ada"},
                {"Eksekutif", "200000", "7%", "Ada", "Tidak Ada"},
                {"Pariwisata", "300000", "10%", "Ada", "Ada"}
        };

        lihatKA(dataKereta);
        System.out.println();
        lihatKA_AC(dataKereta);
        System.out.println();
        lihatKA_Colokan(dataKereta);

        ArrayList pesanan = new ArrayList();
        
        pesanan.add("d");
        System.out.println(pesanan);






    }

    private static void lihatKA (String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Jenis", "Harga", "Diskon", "AC", "Colokan");
        for (String[] kereta : data) {
            for (String spek : kereta) {
                System.out.printf("%-10s ", spek);
            }
            System.out.println();
        }
    }

    private static void lihatKA_AC (String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Jenis", "Harga", "Diskon", "AC", "Colokan");
        for (String[] spek : data) {
            for (int j = 0; j < data[0].length; j++) {
                if (spek[3].equalsIgnoreCase("Ada")) {
                    System.out.printf("%-10s ", spek[j]);
                }
            }
            if (spek[3].equalsIgnoreCase("Ada")) {
                System.out.println();
            }
        }
    }

    private static void lihatKA_Colokan (String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Jenis", "Harga", "Diskon", "AC", "Colokan");
        for (String[] spek : data) {
            for (int j = 0; j < data[0].length; j++) {
                if (spek[4].equalsIgnoreCase("Ada")) {
                    System.out.printf("%-10s ", spek[j]);
                }
            }
            if (spek[4].equalsIgnoreCase("Ada")) {
                System.out.println();
            }
        }
    }
}
