package Bangun2D;

public class BangunDatar {

    private float luas;
    private float keliling;

    protected void setLuas(float luas) {
        this.luas = luas;
    }

    protected void setKeliling(float keliling) {
        this.keliling = keliling;
    }

    public float getLuas() {
        return luas;
    }

    public float getKeliling() {
        return keliling;
    }

    public void printLuas() {
        System.out.println("Luas Bangun Datar Adalah : "+getLuas());
    }

    public static void printKeliling() {
        System.out.println("keliling bangun datar");
    }

}
