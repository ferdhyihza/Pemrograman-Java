package Soal;

class Ponsel{

    static final String MERK_NAKIO = "Nakio";
    static final String MERK_SUMSANG = "Sumsang";
    static final String MERK_XAIOMI = "Xaiomi";
    static final String MERK_SYNO = "Syno";

    public static String getMerk(String merk) {
        return switch (merk) {
            case "Nakio" -> MERK_NAKIO;
            case "Sumsang" -> MERK_SUMSANG;
            case "Xaiomi" -> MERK_XAIOMI;
            case "Syno" -> MERK_SYNO;
            default -> throw new IllegalStateException("Unexpected value: " + merk);
        };

    }

    private static int nomorSeriGenerator = 1;

    private final String merk;
    private String nomorSeri;
    private static final char[] nomorSeriHuruf = {'A','B','C','D','E'};
    static int nomorSeriAgen = 100;

    Ponsel(String merk){
        this.merk = merk;
        this.nomorSeri = String.valueOf(nomorSeriGenerator) + nomorSeriHuruf[(nomorSeriGenerator/2)%5];
        nomorSeriGenerator+=2;
    }

    public static Ponsel[] buatBanyakPonsel(String merk, int jumlahPonsel){
        Ponsel[] ponsels = new Ponsel[jumlahPonsel];
        for (int i=0 ; i<ponsels.length ; i++){
            ponsels[i] = new Ponsel(merk);

        }
        return ponsels;

    }

    public String getMerk() {
        return merk;
    }

    public String getNomorSeri() {
        return nomorSeri;
    }

    public static void tambahNomorSeriAgen(Ponsel[] ponsels){
        for (Ponsel ponsel : ponsels) {
            ponsel.nomorSeri = ponsel.getNomorSeri() + nomorSeriAgen;
            nomorSeriAgen += 3;
        }
    }

}

public class Soal4 {

    public static void main(String[] args) {

        // Ponsel merk Nakio
        Ponsel[] ponsel1 = Ponsel.buatBanyakPonsel(Ponsel.getMerk("Nakio"),2);
        Ponsel.tambahNomorSeriAgen(ponsel1);
        show(ponsel1);

        // Ponsel merk Sumsang
        Ponsel[] ponsel2 = Ponsel.buatBanyakPonsel(Ponsel.getMerk("Sumsang"),2);
        Ponsel.tambahNomorSeriAgen(ponsel2);
        show(ponsel2);

        // Ponsel merk Xaiomi
        Ponsel[] ponsel3 = Ponsel.buatBanyakPonsel(Ponsel.getMerk("Xaiomi"),2);
        Ponsel.tambahNomorSeriAgen(ponsel3);
        show(ponsel3);

        // Ponsel merk Syno
        Ponsel[] ponsel4 = Ponsel.buatBanyakPonsel(Ponsel.getMerk("Syno"),2);
        Ponsel.tambahNomorSeriAgen(ponsel4);
        show(ponsel4);

    }

    public static void show(Ponsel[] ponsels){
        for(Ponsel ponsel : ponsels){
            System.out.printf("%-11s: %-7s | ", "Nama Merek", ponsel.getMerk());
            System.out.printf("%-11s: %-7s\n", "Nomor Seri", ponsel.getNomorSeri());
        }
        gares();
    }

    public static void gares(){
        System.out.println("------------------------------------------");
    }

}