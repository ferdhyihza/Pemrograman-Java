package UAP2020;

import java.util.Scanner;

public class PenentuNasibAkhirNilaiMahasiswa {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        // deklarasi variabel
        // deklarasi variabel namaMahasiswa, nilaiQuiz, nilaiUTS, dan nilaiUAS dengan tipe data array
        String[] namaMahasiswa = new String[N];
        int[] nilaiQuiz = new int[N];
        int[] nilaiUTS = new int[N];
        int[] nilaiUAS = new int[N];
        // deklarasi sampai disini
        double rataRataQuiz = 0.00;
        double rataRataUTS = 0.00;
        double rataRataUAS = 0.00;

        // input ke array
        for (int i = 0;i< N;i++){
            //lengkapi dari sini
            namaMahasiswa[i] = scan.next();
            nilaiQuiz[i] = scan.nextInt();
            nilaiUTS[i] = scan.nextInt();
            nilaiUAS[i] = scan.nextInt();
            //sampai disini
        }

        // output rataRata nilai
        // lengkapi dari sini untuk output ratarata nilai
        System.out.printf("Rata Rata Nilai Quiz : %.2f\n", rataRata(nilaiQuiz));
        System.out.printf("Rata Rata Nilai UTS  : %.2f\n", rataRata(nilaiUTS));
        System.out.printf("Rata Rata Nilai UAS  : %.2f\n", rataRata(nilaiUAS));
        // sampai disini



        // output masing masing mahasiswa
        System.out.printf("------------Nilai Mahasiswa------------%n");
        for (int i = 0;i< N;i++){
            //lengkapi disini
            double nilaiEnd = nilaiAkhir(nilaiQuiz[i], nilaiUTS[i], nilaiUAS[i]);
            System.out.printf("%-10s %.2f (%s)\n",namaMahasiswa[i],nilaiEnd,labelNilaiAkhir(nilaiEnd));

            //sampai disini
        }
    }

    //method mencari rata-rata array
    public static double rataRata(int[] nilai){
        double rerata = 0.00;
        //lengkapi dari sini
        double sum=0;
        for (int value : nilai) {
            sum += value;
        }
        rerata = sum/nilai.length;
        //sampai disini
        return rerata;
    }

    //method mencari nilai akhir
    public static double nilaiAkhir(int quiz, int uts, int uas){
        double nilaiAkhir;
        //lengkapi dari sini
        nilaiAkhir = quiz*0.25 + uts*0.35 + uas*0.4;

        //sampai disini
        return nilaiAkhir;
    }


    //method label nilai akhir
    public static char labelNilaiAkhir(double nilai){
        char labelNilaiAkhir;
        //lengkapi dari sini
        if (nilai > 79.0)
            labelNilaiAkhir = 'A';
        else if (nilai > 69.0)
            labelNilaiAkhir = 'B';
        else if (nilai > 59.0)
            labelNilaiAkhir = 'C';
        else if (nilai > 49.0)
            labelNilaiAkhir = 'D';
        else
            labelNilaiAkhir = 'E';

        //sampai disini
        return labelNilaiAkhir;
    }
}
