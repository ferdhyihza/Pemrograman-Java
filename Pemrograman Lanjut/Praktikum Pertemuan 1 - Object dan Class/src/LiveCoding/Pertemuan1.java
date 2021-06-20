package LiveCoding;

import java.util.Scanner;

class Person{
    String nama;
    char jenisKelamin;
    int beratBadan;
    String warnaRambut;

    public Person(String nama, char jenisKelamin, int beratBadan, String warnaRambut){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.beratBadan = beratBadan;
        this.warnaRambut = warnaRambut;

    }

    void editWarnaRambut(String warnaBaru) {
        this.warnaRambut = warnaBaru;
    }

    void diet() {
        beratBadan--;
    }

    void print() {
        System.out.println("Nama = " + this.nama);
        System.out.println("Jenis Kelamin = " + this.jenisKelamin);
        System.out.println("Berat Badan = " + this.beratBadan);
        System.out.println("Warna Rambut = " + this.warnaRambut);

    }

}

public class Pertemuan1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nama = scan.nextLine();
        char jenisKelamin = scan.next().charAt(0);
        int beratBadan = scan.nextInt();
        String warnaRambut = scan.next();


        Person orang1 = new Person(nama,jenisKelamin,beratBadan,warnaRambut);
        orang1.print();
        System.out.println();
        orang1.diet();
        orang1.editWarnaRambut("Hijau");
        orang1.print();
    }
}
