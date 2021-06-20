package InterfaceLAt;

public class MobiKopter implements Helikopter,Mobil {

    @Override
    public void Terbang() {
        System.out.println("MobiKopter Terbang dengan ketinggian : " + ketinggianMax);
    }

    @Override
    public void berjalan() {
        System.out.println("MobiKopter Berjalan dengan kecepatan : " + kecepatanMax);
    }


}
