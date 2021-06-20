package PemusatanDataKelompok;

import java.util.Arrays;
import java.util.Scanner;

class DataTunggal{

    private final int banyakData;
    private final int[] arrData;

    DataTunggal(int[] arrData){
        this.banyakData = arrData.length;
        this.arrData = arrData;
    }

    public void hitungMean(){
        System.out.println("Menghitung mean");
        System.out.println(getMean());
    }

    public void hitungMedian(){
        System.out.println("Menghitung median");
        System.out.println(getMedian());
    }

    public void hitungModus(){
        System.out.println("Menghitung modus");
        System.out.println(getModus());
    }

    public void hitungKuartil(int kuartil) {
        System.out.println("Menghitung kuartil ke-" +kuartil);
        System.out.println("Letak Q" +kuartil);
        System.out.println("Q"+kuartil+" = "+kuartil+"("+banyakData+" + 1)" +
                "\n\t ---------" +
                "\n\t\t 4");
        System.out.println("Q"+kuartil+" = "+getLetakKuartil(kuartil));
        showDataUrut();
        Arrays.sort(arrData);
        double letak = getLetakKuartil(kuartil);
        double nilai = (arrData[(int)letak-1] + (letak-(int)letak)*(arrData[(int)letak]-arrData[(int)letak-1]));
        System.out.println("Nilai Q"+kuartil+" = "+ (arrData[(int)letak-1] +" + "+ (letak-(int)letak)+" * ("+(arrData[(int)letak]+" - "+arrData[(int)letak-1]))+") = " + nilai);
    }

    public void hitungDesil(int desil) {
        System.out.println("Menghitung desil ke-" +desil);
        System.out.println("Letak D" +desil);
        System.out.println("D"+desil+" = "+desil+"("+banyakData+" + 1)" +
                "\n\t ---------" +
                "\n\t\t 10");
        System.out.println("D"+desil+" = "+getLetakDesil(desil));
        showDataUrut();
        Arrays.sort(arrData);
        double letak = getLetakDesil(desil);
        double nilai = (arrData[(int)letak-1] + (letak-(int)letak)*(arrData[(int)letak]-arrData[(int)letak-1]));
        System.out.printf("%s%d = %d + %.2f * (%d - %d) = %.2f\n","Nilai D",desil,(arrData[(int)letak-1]), (letak-(int)letak), (arrData[(int)letak]),(arrData[(int)letak-1]),nilai);
    }

    public void hitungPersentil(int persentil) {
        System.out.println("Menghitung persentil ke-" +persentil);
        System.out.println("Letak D" +persentil);
        System.out.println("D"+persentil+" = "+persentil+"("+banyakData+" + 1)" +
                "\n\t  ----------" +
                "\n\t\t 100");
        System.out.println("D"+persentil+" = "+getLetakPersentil(persentil));
        showDataUrut();
        Arrays.sort(arrData);
        double letak = getLetakPersentil(persentil);
        double nilai = (arrData[(int)letak-1] + (letak-(int)letak)*(arrData[(int)letak]-arrData[(int)letak-1]));
        System.out.printf("%s%d = %d + %.2f * (%d - %d) = %.2f\n","Nilai P",persentil,(arrData[(int)letak-1]), (letak-(int)letak), (arrData[(int)letak]),(arrData[(int)letak-1]),nilai);
    }


    private double getMean(){
        int sum=0;
        for (int s:arrData
        ) {
            sum+=s;
        }
        return (double) sum/banyakData;
    }

    private double getMedian(){
        Arrays.sort(arrData);
        if (banyakData%2==0) return (arrData[banyakData/2-1] + arrData[(banyakData/2)])/2.;
        return arrData[banyakData/2];
    }

    private int getModus(){
        int maxValue = 0, maxCount = 0, i, j;

        for (i = 0; i < banyakData; ++i) {
            int count = 0;
            for (j = 0; j < banyakData; ++j) {
                if (arrData[j] == arrData[i])
                    ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = arrData[i];
            }
        }
        return maxValue;
    }

    private double getLetakKuartil(int kuartil){
        Arrays.sort(arrData);
        return (kuartil*(banyakData+1)/4.);
    }

    private double getLetakDesil(int desil){
        Arrays.sort(arrData);
        return (desil*(banyakData+1)/10.);
    }

    private double getLetakPersentil(int persentil){
        Arrays.sort(arrData);
        return (persentil*(banyakData+1)/100.);
    }


    private void showDataUrut(){
        Arrays.sort(arrData);
        System.out.println(Arrays.toString(arrData));
    }

}

public class UkuranPemusatanData {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Program Sederhana Menghitung" +
                "\n1. Mean" +
                "\n2. Median" +
                "\n3. Modus" +
                "\n4. Kuartil" +
                "\n5. Desil" +
                "\n6. Persentil");
        System.out.println("Choose your data type: " +
                "\nA. Data Tunggal" +
                "\nB. Data Kelompok");
        System.out.print("Your answer here: ");
        String mode = scan.next();

        switch (mode) {
            case "A","a" -> summonDataTunggal();
            case "B","b" -> summonDataKelompok();
            case "Exit","exit" -> System.exit(1);
            default -> System.out.println("Masukkan pilihan yang benar!");
        }


    }

    private static void summonDataTunggal(){
        Scanner scan = new Scanner(System.in);

        garisDobel();
        System.out.print("Banyak data: ");
        int banyakData = scan.nextInt();
        System.out.println("Silakan input data: ");
        int[] arrData = new int[banyakData];
        for (int i=0 ; i<banyakData ; i++){
            arrData[i] = scan.nextInt();
        }
        DataTunggal dataTunggal = new DataTunggal(arrData);
        garis();
        dataTunggal.hitungMean();
        garis();
        dataTunggal.hitungMedian();
        garis();
        dataTunggal.hitungModus();
        garis();
        System.out.print("Kuartil ke: ");
        int kuartil = scan.nextInt();
        dataTunggal.hitungKuartil(kuartil);
        garis();
        System.out.print("Desil ke: ");
        int desil = scan.nextInt();
        dataTunggal.hitungDesil(desil);
        garis();
        System.out.print("Persentil ke: ");
        int persentil = scan.nextInt();
        dataTunggal.hitungPersentil(persentil);
        garisDobel();
    }

    private static void summonDataKelompok(){

    }

    private static void garisDobel(){
        System.out.println("==============================================");
    }

    private static void garis(){
        System.out.println("----------------------------------------------");
    }
}
