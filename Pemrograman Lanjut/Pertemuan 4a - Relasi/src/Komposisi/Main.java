package Komposisi;

public class Main {

    public static void main(String[] args) {

        Komputer pcBudi = new Komputer(2021);
        System.out.println(pcBudi.getCPU().getNama());

        pcBudi = null;
        System.out.println(pcBudi.getCPU().getNama()); // Output = NullPointerException
    }
}
