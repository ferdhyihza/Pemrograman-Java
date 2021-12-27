package OOP;

import java.util.Scanner;

interface BangunDatar {
    double getLuas();
    double getKeliling();
    void print();

}

class Persegi implements BangunDatar {

    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getLuas() {
        return sisi*sisi;
    }

    @Override
    public double getKeliling() {
        return sisi*4;
    }

    @Override
    public void print() {
        System.out.println("Bangun persegi");
        System.out.println("sisi     : "+this.sisi);
        System.out.println("Luas     : "+getLuas());
        System.out.println("Keliling : "+getKeliling());
    }
}

class PersegiPanjang implements BangunDatar {

    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double getLuas() {
        return panjang*lebar;
    }

    @Override
    public double getKeliling() {
        return 2*(panjang+lebar);
    }

    @Override
    public void print() {
        System.out.println("Bangun persegi panjang");
        System.out.println("Panjang  : "+this.panjang+"\nLebar    : "+this.lebar);
        System.out.println("Luas     : "+getLuas());
        System.out.println("Keliling : "+getKeliling());
    }
}

public class HitungLuasKeliling {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int panjang = scan.nextInt();
        scan.nextLine();
        for(int i=0 ; i<panjang; i++) {
            String input = scan.nextLine();
            String[] inputSplit = input.split(" ");

            switch (inputSplit[0]) {
                case "pp" -> {
                    PersegiPanjang pp = new PersegiPanjang(Double.parseDouble(inputSplit[1]),Double.parseDouble(inputSplit[2]));
                    pp.print();
                }
                case "p" -> {
                    Persegi p = new Persegi(Double.parseDouble(inputSplit[1]));
                    p.print();
                }
                default -> throw new IllegalStateException("Unexpected value: " + inputSplit[0]);
            }
        }
    }
}
