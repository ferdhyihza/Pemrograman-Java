package Bangun2D;

public class Lingkaran extends BangunDatar {


    private int radius;

    public Lingkaran(int radius) {
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

    @Override
    public void printLuas() {
        System.out.println("Luas Lingkaran Adalah : "+getLuas());
    }
}
