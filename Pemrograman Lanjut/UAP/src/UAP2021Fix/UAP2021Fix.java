package UAP2021Fix;

import java.util.ArrayList;
import java.util.Scanner;

interface Perawatan {
    void treatment();
}

abstract class Tanaman implements Perawatan {

    String nama;
    private int masaHidup;
    private int lamaHidup;
    private int berbuah;
    private int buah;
    private double perkembangan;
    private double prosesBerbuah;

    public int getMassaHidup() {
        return masaHidup;
    }

    public void setMassaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public int getBerbuah() {
        return berbuah;
    }

    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }

    public int getBuah() {
        return buah;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }

    public abstract void berkembang();

    String status(){
        return lamaHidup >= masaHidup ? "Mati" : "Hidup";
    }


    public String toString() {
        return  "Masa Hidup = " + masaHidup + " hari \n" +
                "Umur tanaman = " + lamaHidup + " hari \n" +
                "Menghasilkan = " + buah + " buah " + nama.toLowerCase() + "\n" +
                "Status = " + status();
    }
}

class Tomat extends Tanaman implements Perawatan{

    public Tomat() {
        super.nama = "Tomat";
        super.setMassaHidup(100);
        super.setBerbuah(100);
        super.setPerkembangan(0.25);
    }

    @Override
    public void treatment(){
        setPerkembangan(getPerkembangan() + 0.05);
    }

    @Override
    public void berkembang() {
        setLamaHidup(getLamaHidup() + 1);
        setProsesBerbuah(getProsesBerbuah() + (getBerbuah()*getPerkembangan()));
        if (getProsesBerbuah() >= getBerbuah()) {
            if (getProsesBerbuah() == getBerbuah()) {
                setProsesBerbuah(0);
            } else {
                setProsesBerbuah(getProsesBerbuah() - getBerbuah());
            }
            setBuah(getBuah() + 1);
        }
    }

}

class Stroberi extends Tanaman implements Perawatan {

    public Stroberi() {
        super.nama = "Stroberi";
        super.setMassaHidup(60);
        super.setBerbuah(150);
        super.setPerkembangan(0.35);
    }

    @Override
    public void treatment(){
        setPerkembangan(getPerkembangan() + 0.05);
    }

    @Override
    public void berkembang() {
        setLamaHidup(getLamaHidup() + 1);
        setProsesBerbuah(getProsesBerbuah() + (getBerbuah()*getPerkembangan()));
        if (getProsesBerbuah() >= getBerbuah()) {
            if (getProsesBerbuah() == getBerbuah()) {
                setProsesBerbuah(0);
            } else {
                setProsesBerbuah(getProsesBerbuah() - getBerbuah());
            }
            setBuah(getBuah() + 1);
        }
    }

}

class Persik extends Tanaman implements Perawatan {

    public Persik(){
        super.nama = "Persik";
        super.setMassaHidup(180);
        super.setBerbuah(250);
        super.setPerkembangan(0.15);
    }

    @Override
    public void treatment(){
        setPerkembangan(getPerkembangan() + 0.025);
    }

    @Override
    public void berkembang() {
        setLamaHidup(getLamaHidup() + 1);
        setProsesBerbuah(getProsesBerbuah() + (getBerbuah()*getPerkembangan()));
        if (getProsesBerbuah() >= getBerbuah()) {
            if (getProsesBerbuah() == getBerbuah()) {
                setProsesBerbuah(0);
            } else {
                setProsesBerbuah(getProsesBerbuah() - getBerbuah());
            }
            setBuah(getBuah() + 1);
        }
    }

}

class Data {
    static public Scanner input = new Scanner(System.in);
    static public ArrayList<Tanaman> tanamans = new ArrayList<>();
    static public ArrayList<Integer> lokasi = new ArrayList<>();

    static public void mulai(){
        System.out.print("Masa tanam (bulan): ");
        int masaTanamBln = input.nextInt();
        menanam();
        menanam();
        menanam();
        System.out.print("--------------\n"
                + "PROSES MENANAM\n"
                + "--------------\n");
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
    static public void menanam(){
        System.out.println("Mau menanam apa?"
                + "\n1. Tomat"
                + "\n2. Stroberi"
                + "\n3. Persik");
        int pilihan = input.nextInt();
        switch(pilihan){
            case 1 : tanamans.add(new Tomat());
                System.out.println("Tomat berhasil ditanam.");
                break;
            case 2 : tanamans.add(new Stroberi());
                System.out.println("Stroberi berhasil ditanam.");
                break;
            case 3 : tanamans.add(new Persik());
                System.out.println("Persik berhasil ditanam.");
                break;
        }
    }
    static public void info(){
        for(int i = 0; i < tanamans.size(); i++){
            System.out.println("Tanaman buah ke-" + (i+1));
            System.out.println(Data.tanamans.get(i).toString());
        }
    }
}

public class UAP2021Fix {
    public static void main(String[] args){
        Data.mulai();
        Data.info();
    }
}
