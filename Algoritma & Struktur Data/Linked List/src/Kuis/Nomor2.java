package Kuis;

import java.util.LinkedList;
import java.util.Scanner;

public class Nomor2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();

        System.out.println("DOUBLE LINKED LIST");

        boolean statusProgram = true;
        do {
            boolean statusMenu = true;
            System.out.println("---------------------------------------");
            System.out.println("Menu:" +
                    "\n1. Entry Data" +
                    "\n2. Hapus Data" +
                    "\n3. Cetak Data" +
                    "\n4. Keluar");
            int pil;
            boolean statusInput=true;
            do {
            System.out.print("Masukkan pilihan Anda : ");
            pil = scan.nextInt();
            if (pil >= 1 && pil <= 4) {
                statusInput = false;
            } else {
                System.out.println("Masukkan input yang sesuai!");
            }
            } while (statusInput);
            switch (pil) {
                case 1 -> {
                    System.out.print("Masukkan Data : ");
                    int data = scan.nextInt();
                    ll.add(data);
                    System.out.println(data + " telah ditambahkan");
                }
                case 2 -> {
                    if (ll.isEmpty()) {
                        System.out.println("Tidak ada data");
                    } else {
                        System.out.print("Hapus Data : ");
                        int data = scan.nextInt();
                        if (ll.contains(data)) {
                            ll.remove(Integer.valueOf(data));
                            System.out.println(data + " telah dihapus");
                        } else {
                            System.out.println(data + " tidak ditemukan");
                        }
                    }
                }
                case 3 -> {
                    if (ll.isEmpty()) {
                        System.out.println("Tidak ada data");
                    } else {
                        System.out.print("Data : ");
                        System.out.println(ll);
                    }
                }
                case 4 -> {
                    System.out.println("Terima kasih telah menggunakan program.");
                    System.exit(1);
                }
            }
            do {
                System.out.print("Kembali ke menu? (y/n)");
                String cek = scan.next();
                if (cek.equalsIgnoreCase("n")) {
                    System.out.println("Terima kasih telah menggunakan program.");
                    statusMenu=false;
                    statusProgram=false;
                } else if (cek.equalsIgnoreCase("y")) {
                    statusMenu=false;
                } else {
                    System.out.println("Masukkan input yang benar");
                }
            } while (statusMenu);
        } while (statusProgram);
    }
}
