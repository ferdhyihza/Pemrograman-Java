package Crystal;

import java.util.Scanner;

public class Akbluck {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // INPUT BARIS PERTAMA
        int banyakMahasiswa = in.nextInt();
        int banyakMatkul = in.nextInt();

        String[] dataMahasiswa = new String[banyakMahasiswa];
        double[] dataAvgPerMhs = new double[banyakMahasiswa];
        String maxNama;
        double nilaiMatkul, avgPerMhs, avgKelas=0, max, sumPerMhs=0;

        for (int i=0 ; i<banyakMahasiswa ; i++) {
            dataMahasiswa[i] = in.next();
            for (int j=0 ; j<banyakMatkul ; j++) {
                nilaiMatkul = in.nextDouble();
                sumPerMhs += nilaiMatkul;
            }
            avgPerMhs = sumPerMhs/banyakMatkul;
            dataAvgPerMhs[i] = avgPerMhs;
            avgKelas += dataAvgPerMhs[i];
            System.out.println("Rata-rata nilai mahasiswa " + dataMahasiswa[i] + " adalah " + dataAvgPerMhs[i]);
            sumPerMhs=0;
        }
        max = dataAvgPerMhs[0];
        maxNama = dataMahasiswa[0];
        for (int i=0 ; i<banyakMahasiswa ; i++) {
            if (dataAvgPerMhs[i] > max) {
                max = dataAvgPerMhs[i];
                maxNama = dataMahasiswa[i];
            }
        }
        System.out.println("Rata-rata kelas: "+avgKelas/banyakMahasiswa);
        System.out.println("Mahasiswa yang memiliki nilai tertinggi adalah " + maxNama + " dengan nilai " + max);
    }
}
