package KelasC;

import java.util.ArrayList;
import java.util.Scanner;

class Pesawat {

    String nama;
    int kapasitasMaksimalPenumpang;
    int jumlahPenumpang;
    long hargaTiket;
    ArrayList<Manusia> penumpang = new ArrayList<>();

    public Pesawat(String nama, int kapasitasMaksimalPenumpang, long hargaTiket) {
        this.nama = nama;
        this.kapasitasMaksimalPenumpang = kapasitasMaksimalPenumpang;
        this.hargaTiket = hargaTiket;
    }

    void tambahPenumpang(Manusia[] penumpang){
        for (Manusia manusia : penumpang) {
            if (jumlahPenumpang < kapasitasMaksimalPenumpang) {
                this.penumpang.add(manusia);
                jumlahPenumpang++;
            }
        }
    }

    void cetakStatus(){
        System.out.println("Nama pesawat: " + this.nama);
        System.out.println("Jumlah Penumpang: " + this.jumlahPenumpang);
        System.out.println("Penumpang pertama: " + penumpang.get(0).getNama());
        System.out.println("Penumpang terakhir: " + penumpang.get(penumpang.size()-1).getNama());
        System.out.println("Total Omzet: " + jumlahPenumpang*hargaTiket);
    }

}

class Manusia {

    String nama;

    public Manusia(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

public class PesawatTerbang {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String namaPesawat = in.next();
        int penumpangMax = in.nextInt();
        long hargaTiket = in.nextLong();
        Pesawat p1 = new Pesawat(namaPesawat, penumpangMax, hargaTiket);
        int jumlahPenumpang1 = in.nextInt();
        Manusia[] penumpang1 = new Manusia[jumlahPenumpang1];
        for (int i = 0; i < jumlahPenumpang1; i++) {
            String nama = in.next();
            penumpang1[i] = new Manusia(nama);
        }
        p1.tambahPenumpang(penumpang1);
        int jumlahPenumpang2 = in.nextInt();
        Manusia[] penumpang2 = new Manusia[jumlahPenumpang2];
        for (int i = 0; i < jumlahPenumpang2; i++) {
            String nama = in.next();
            penumpang2[i] = new Manusia(nama);
        }
        p1.tambahPenumpang(penumpang2);
        p1.cetakStatus();
    }
}
