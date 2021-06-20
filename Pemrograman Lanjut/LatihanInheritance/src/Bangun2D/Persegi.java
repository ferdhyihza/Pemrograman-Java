package Bangun2D;

public class Persegi extends BangunDatar {

    private float panjang,lebar;

    public Persegi(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    @Override
    public float getLuas() {
        setLuas(panjang*lebar);
        return super.getLuas();
    }

    @Override
    public void printLuas() {
        System.out.println("Luas Persegi Adalah : "+getLuas());
    }


}
