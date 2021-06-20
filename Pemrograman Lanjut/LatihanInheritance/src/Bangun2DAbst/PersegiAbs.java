package Bangun2DAbst;

public class PersegiAbs extends BangunDatarAbs {

    private float panjang,lebar;

    public PersegiAbs(float panjang, float lebar) {
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
    public float getKeliling() {
        this.keliling = 2*(panjang+lebar);
        return keliling;
    }

    @Override
    public void printKeliling() {
        System.out.println("Keliling Persegi Adalah : "+getKeliling());
    }


    @Override
    public void printLuas() {
        System.out.println("Luas Persegi Adalah : "+getLuas());
    }




}
