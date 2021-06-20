package UAP2021;

import java.util.ArrayList;
import java.util.Scanner;

public class Data {

    static ArrayList<Tanaman> tanamans = new ArrayList<>();
    static ArrayList<Integer> lokasi = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    static void mulai(){
        System.out.print("Masa tanam (bulan): ");
        int masaTanamBln = in.nextByte();
        menanam();
        menanam();
        menanam();
        System.out.println("--------------" +
                "\nPROSES MENANAM" +
                "\n--------------");
        System.out.println("---HASIL MENANAM---");
        for (int hari=1 ; hari <= masaTanamBln*30 ; hari++) {
            for(int i = 0; i < tanamans.size(); i++){
                if (lokasi.contains(i)) {
                    continue;
                }
                String statuse = tanamans.get(i).status();
                switch (statuse) {
                    case "Hidup" : {
                        if (hari % 90 == 0) tanamans.get(i).treatment();
                        tanamans.get(i).berkembang();
                    } break;
                    case "Mati" : {
                        lokasi.add(i);
                        menanam();
                    } break;
                }
            }
        }

    }

    static void menanam(){
        System.out.println("Mau menanam apa?" +
                "\n1. Tomat" +
                "\n2. Stroberi" +
                "\n3. Persik");
        int pilihan = in.nextByte();
        switch (pilihan) {
            case 1 : {
                tanamans.add(new Tomat());
                System.out.println("Tomat berhasil ditanam.");
            } break;
            case 2 : {
                tanamans.add(new Stroberi());
                System.out.println("Stroberi berhasil ditanam.");
            } break;
            case 3 : {
                tanamans.add(new Persik());
                System.out.println("Persik berhasil ditanam.");
            } break;
        }

    }

    static void info(){
        for (int i=0 ; i < tanamans.size() ; i++) {
            System.out.println("Tanaman buah ke-" + (i+1));
            System.out.println(tanamans.get(i).toString());
            System.out.println();
        }
    }
}
