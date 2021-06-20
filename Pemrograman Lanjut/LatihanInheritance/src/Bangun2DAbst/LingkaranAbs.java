package Bangun2DAbst;

public abstract class LingkaranAbs extends BangunDatarAbs {


    private int radius;

    public LingkaranAbs(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getLuas() {
        setLuas(3.14f*radius*radius);
        return super.getLuas();
    }

    public float getKeliling() {
        this.keliling = 3.14f*radius*2;
        return keliling;
    }

    @Override
    public abstract void printLuas() ;


}
