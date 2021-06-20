package AplikasiBookingTiketNonton;

public class Bioskop{
    final int hargaTiket = 50_000;
    final int hargaMember = 30_000;
    final double diskon = 5./100;
    final int hargaTiketMember = (int) (hargaTiket - (hargaTiket*diskon));
    Customer customer;
    String namaFilm;
    private String statusPlan = "Bukan Member";
    private int totalTagihan;

    void changeName(String namaBaru){
        customer.setNama(namaBaru);
    }

    // Constructor untuk Reguler Plan
    Bioskop(String nama, String alamat){
        customer = new Customer(nama,alamat);
        
    }

    // Constructor untuk Member Plan
    Bioskop(String nama, String alamat, int noMember){
        customer = new Customer(nama,alamat,noMember);
        this.statusPlan = "Member";
    }

    // Method untuk Reguler Plan
    void pesenTiket(String namaFilm){
        
        this.totalTagihan += hargaTiket;
        this.namaFilm = namaFilm;
        show();
        showTagihan();
        garisDobel();
        this.totalTagihan=0;
    }

    // Method untuk Member Plan
    void pesenTiket(String namaFilm, String makanan, String minuman){
        if (this.statusPlan.equals("Member")){
            this.totalTagihan = hargaTiketMember + hargaMember;
            this.namaFilm = namaFilm;
            show();
            System.out.println("---------- Bonus Member ----------" +
                    "\nSelamat, Anda mendapatkan bonus.");
            System.out.println("Makanan : " + makanan);
            System.out.println("Minuman : " + minuman );
            showTagihan();
            garisDobel();
            this.totalTagihan=0;
        } else {
            System.out.println("Anda bukan member kok pesen tiket Member?");
        }
    }

    // Method untuk menampilkan rincian tiket
    private void show(){
        garisDobel();
        System.out.println("\t\tRINCIAN TIKET ANDA\n");
        System.out.printf("%-15s : %s\n","Status", this.statusPlan);
        if (this.statusPlan.equals("Member")) System.out.printf("%-15s : %s\n","No Member", customer.getNoMember());
        System.out.printf("%-15s : %s\n","Nama", customer.getNama());
        System.out.printf("%-15s : %s\n", "Alamat", customer.getAlamat());
        System.out.printf("%-15s : %s\n", "Nama Film", this.namaFilm);

    }

    // Method untuk menampilkan rincian tagihan
    private void showTagihan(){
        garis();
        if (this.statusPlan.equals("Member")) {
            System.out.printf("%-15s : Rp%7d\n", "Harga Tiket", this.hargaTiketMember);
            System.out.printf("%-15s : Rp%7d\n", "Fee Member", this.hargaMember);
        } else {
            System.out.printf("%-15s : Rp%7d\n", "Harga Tiket", this.hargaTiket);
        }
        System.out.printf("%-15s : Rp%7d\n", "Total", this.totalTagihan);
    }

    private static void garis(){
        System.out.println("----------------------------------");
    }

    private static void garisDobel(){
        System.out.println("==================================");
    }
}
