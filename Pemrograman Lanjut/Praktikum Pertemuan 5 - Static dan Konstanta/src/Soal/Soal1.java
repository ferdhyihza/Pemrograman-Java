package Soal;

class Kucing{
    private static int AWAL_ID = 1000;
    final private String ras;
    final private int noKalung;

    public Kucing(String ras) {
        this.ras = ras;
        this.noKalung = AWAL_ID;
        AWAL_ID += 5;
    }

    public String getRas() {
        return ras;
    }

    public int getId() {
        return noKalung;
    }

    static void getKucing(Kucing kucing){
        System.out.printf("Ras: %s\nID: %d", kucing.getRas(), kucing.getId());
    }
}

public class Soal1 {

    public static void main(String[] args) {

        Kucing kucing1 = new Kucing("Persia");
        Kucing kucing2 = new Kucing("Angggora");
        Kucing kucing3 = new Kucing("Mesir");






    }
}
