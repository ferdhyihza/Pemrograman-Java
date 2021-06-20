package SistemGaji;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlahBulan = in.nextInt();
        Pegawai[][] pegawaiArray = new Pegawai[jumlahBulan][100];
        for(int i=0; i < jumlahBulan; i++) {
            Pegawai.bulan[i] = in.next();
            int jumlahPegawai = in.nextInt();
            double tambahanGaji = in.nextDouble();
            for(int j=0; j<jumlahPegawai;j++) {
                String nama = in.next();
                String pekerjaan = in.next().toLowerCase();
                double lamaKerja;
                switch(pekerjaan) {
                    case "programmer":
                        lamaKerja = in.nextDouble();
                        int projek = in.nextInt();
                        pegawaiArray[i][j] = new Programmer(nama, lamaKerja, tambahanGaji, projek);
                        break;
                    case "akuntan":
                        lamaKerja = in.nextDouble();
                        int banyakBuku = in.nextInt();
                        int banyakPresentasi = in.nextInt();
                        pegawaiArray[i][j] = new Akuntan(nama, lamaKerja, tambahanGaji, banyakBuku, banyakPresentasi);
                        break;
                    case "customer":
                        in.next();
                        lamaKerja = in.nextDouble();
                        double banyakOrang = in.nextDouble();
                        int rating = in.nextInt();
                        pegawaiArray[i][j] = new CustomerService(nama, lamaKerja, tambahanGaji, banyakOrang, rating);
                        break;
                    case "manager":
                        lamaKerja = in.nextDouble();
                        double banyakBawahan = in.nextDouble();
                        int kuota = in.nextInt();
                        pegawaiArray[i][j] = new Manager(nama, lamaKerja, tambahanGaji, banyakBawahan, kuota);
                }
            }
        }
        for(int i=0;i<jumlahBulan;i++) {
            System.out.println("Bulan : " + Pegawai.bulan[i]);
            System.out.println("==============================");
            Pegawai.informasiTiapBulan(pegawaiArray[i]);
            System.out.println();
        }
    }
}
