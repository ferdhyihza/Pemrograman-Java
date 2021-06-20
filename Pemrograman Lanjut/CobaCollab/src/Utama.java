import com.folder.my.BangunDatar;
import com.folder.my.Car;
import com.folder.my.Lingkaran;

public class Utama {

    public static void main(String[] args) {

        int angka = 10;

        Car _toyotaAvanza = new Car("hijau",100);
        Car _toyotaAvanza2 = new Car();
        System.out.println("car int : "+ _toyotaAvanza.max(2,3));
        System.out.println("car float : "+ _toyotaAvanza.max(2.0f,3.0f));

        System.out.println("warna mobil avnza1: "+_toyotaAvanza.color);
        System.out.println("warna mobil avanza2: "+_toyotaAvanza2.color);
        System.out.println("kecepatan mobil avnza1: "+_toyotaAvanza.speed);
        System.out.println("Kecepatan mobil avanza2: "+_toyotaAvanza2.speed);


        Lingkaran _l1 = new Lingkaran();
        _l1.set_radius(3);

        //_l1.mobil.color = "with";


        System.out.println("Luas dari L1 adalah : "+ _l1.getLuas() );

        Lingkaran _l2;
        _l2 = new Lingkaran();
        _l2 = new Lingkaran(10,10,new Car());
        _l2.set_radius(10);
        System.out.println("Luas dari L2 adalah : "+ _l2.getLuas() );

        _l2 = _l1;
        System.out.println("Luas dari L2 setelah di ubah = l1 adalah : "+ _l2.getLuas() );



        Lingkaran _l3;
       //_l3.set_radius(20);




        System.out.println("kalau sudh lihat halaman ini berarti sudah connect");
        System.out.println("ganti user name terlebih dahulu di file->setting->codewithme-> ganti jadi namaNim -> lalu connect lgi ->cek");
        System.out.println("masih ada yg namanya user dan HP->mohon diganti");

    }

}
