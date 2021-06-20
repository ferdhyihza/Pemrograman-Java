import Bangun2D.BangunDatar;
import Bangun2D.Lingkaran;
import Bangun2D.Persegi;

public class TesPolimorf {

      public static void main(String[] args) {
        Persegi P1= new Persegi(5,5);
        HitungLuas(P1); //passing sekaligus upcasting dari Persegi ke Bangun datar , sekaligus polimorfis
        BangunDatar BD1 = new Lingkaran(5);
        Lingkaran L2 = (Lingkaran) BD1; //downcasting
        System.out.println("Downcasting Bangun Datar Ke Lingkaran : ");
        System.out.println("Radius lingkaran : " +L2.getRadius());
    }
    public static void HitungLuas(BangunDatar A)
    {
        A.printLuas();
        if(A instanceof Persegi)
        {
            Persegi ps1 = (Persegi) A;
            System.out.println("Downcasting Bangun Datar Ke persegi : ");
            System.out.println("Panjang Persegi : " +ps1.getPanjang());
        }
    }

}

