package InterfaceLAt;

public class Gesit implements SepedaCepat{

    @Override
    public void berjalan() {
        System.out.println("sepeda berjalan kecepatan max : "+ kecepatanMax);
    }

    @Override
    public void mengayuh() {
        System.out.println("sepeda mengayuh lambat");
    }
}
