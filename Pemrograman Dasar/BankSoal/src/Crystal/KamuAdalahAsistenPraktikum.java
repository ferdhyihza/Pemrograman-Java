package Crystal;

import java.util.Scanner;

public class KamuAdalahAsistenPraktikum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double sumKelas=0;

        int banyakMahasiswa = in.nextInt();
        int banyakNilai = in.nextInt();

        String[] dataMahasiswa = new String[banyakMahasiswa];
        double[] dataNilaiRataMahasiswa = new double[banyakMahasiswa];

        for (int i=0 ; i < banyakMahasiswa ; i++) {
            dataMahasiswa[i] = in.next();
            double sum=0;
            double avg=0;
            for (int j=0 ; j<banyakNilai ; j++) {
                double dataNilai = in.nextDouble();
                sum += dataNilai;
                avg = sum / banyakNilai;
            }
            dataNilaiRataMahasiswa[i] = avg;
        }

        for (int i=0 ; i < banyakMahasiswa ; i++) {
            System.out.println("Rata-rata nilai mahasiswa " + dataMahasiswa[i] + " adalah " + dataNilaiRataMahasiswa[i]);
            sumKelas += dataNilaiRataMahasiswa[i];
        }

        System.out.println("Rata-rata kelas: " + sumKelas / banyakMahasiswa);

        double tertinggi = dataNilaiRataMahasiswa[0];
        String tertinggiNama = dataMahasiswa[0];

        for (int i=0 ; i<banyakMahasiswa ; i++) {
            if (dataNilaiRataMahasiswa[i] > tertinggi) {
                tertinggi = dataNilaiRataMahasiswa[i];
                tertinggiNama = dataMahasiswa[i];
            }
        }

        System.out.println("Mahasiswa yang memiliki nilai tertinggi adalah "+ tertinggiNama+" dengan nilai " + tertinggi);

    }
}
