package Bangun2DAbst;

public abstract class BangunDatarAbs {

    private float luas;
    protected float keliling;

  //Abstrack method
    public abstract float getKeliling();
    public abstract void printKeliling();
 //
    protected void setLuas(float luas) {
        this.luas = luas;
    }
    public float getLuas() {
        return luas;
    }
    public void printLuas() {
        System.out.println("Luas Bangun Datar Adalah : "+getLuas());
    }
}
