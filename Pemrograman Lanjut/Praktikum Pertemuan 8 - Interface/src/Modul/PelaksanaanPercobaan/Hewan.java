package Modul.PelaksanaanPercobaan;

public class Hewan implements MakhlukHidup, Identitas {

    public void tampilkanNama() {

    }

    public void tampilkanUmur() {

    }

    @Override
    public void makan() {
        System.out.println("Makan pakai tangan dan mulut");
    }

    @Override
    public void berjalan() {
        System.out.println("Jalan pakai 4 kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Suaranya nggak jelas");
    }
}
