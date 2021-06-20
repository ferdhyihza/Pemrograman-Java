import Bangun2DAbst.BangunDatarAbs;
import Bangun2DAbst.LingkaranAbs;
import Bangun2DAbst.PersegiAbs;

public class TesAbstrak {

      public static void main(String[] args) {
        PersegiAbs P1= new PersegiAbs(5,5);
        HitungKeliling(P1); //passing sekaligus upcasting dari Persegi ke Bangun datar , sekaligus polimorfis
        BangunDatarAbs BD1 = new LingkaranAbs(5) {
            @Override
            public void printLuas() {
                System.out.println("Luas Lingkaran Adalah : "+getLuas());
            }
            //anonimous class
            @Override
            public void printKeliling() {
                System.out.println("Keliling Lingkaran Adalah : "+getKeliling());
            }
        };
        LingkaranAbs L2 = (LingkaranAbs) BD1; //downcasting
        System.out.println("Downcasting Bangun Datar Ke Lingkaran : ");
        System.out.println("Radius lingkaran : " +L2.getRadius());
          HitungKeliling(L2);
    }
    public static void HitungKeliling(BangunDatarAbs A)
    {
        A.printKeliling();
        A.printLuas();
        if(A instanceof PersegiAbs)
        {
            PersegiAbs ps1 = (PersegiAbs) A;
            System.out.println("Downcasting Bangun Datar Ke persegi : ");
            System.out.println("Panjang Persegi : " +ps1.getPanjang());
        }
    }

}

