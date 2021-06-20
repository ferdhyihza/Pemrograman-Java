package Materi;

//Class Cow extends Pet
//        Constructor
//        Attributes:
//        - horn: boolean
//        Methods:
//        + getter
//        + setter
//        + getPrice
//        + toString
//        Notes:
//        ~ getHorn if horn return "Bertanduk" else "Belum bertanduk"
//        ~ toString return parent attributes and horn
//        ~ getPrice if horn super + 10 else + 0

public class Cow extends Pet{

    private boolean horn;

    public Cow(boolean horn, double price, int age, String species, boolean gender) {
        super(price, age, species, gender);
        this.horn = horn;
    }

    public String getHorn() {
        return horn ? "Bertanduk" : "Belum bertanduk";
    }

    public void setHorn(boolean horn) {
        this.horn = horn;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + (horn ? 10 : 0);
    }

    @Override
    public String toString() {
        return super.toString() +
                "horn : " + getHorn() + "\n";
    }
}
