import Bangun2D.Persegi;
import Bangun2DAbst.BangunDatarAbs;
import Bangun2DAbst.LingkaranAbs;
import Bangun2DAbst.PersegiAbs;
import InterfaceLAt.*;

public class TesInterface {

      public static void main(String[] args) {

          Ferrari F1 = new Ferrari();
          Mobil F2 = new Ferrari();
          MobiKopter M1= new MobiKopter();
          SepedaCepat S1 = new Gesit();

          Berjalan(F1);
          Berjalan(F2);
          Berjalan(M1);
          Terbang(M1);
          Berjalan(S1);


    }
    public static void Berjalan(Mobil A)
    {
    A.berjalan();
        if(A instanceof Gesit)
        {
            ((Gesit) A).mengayuh();
        }


    }

    public static void Terbang(Helikopter A)
    {
        A.Terbang();

    }

}

