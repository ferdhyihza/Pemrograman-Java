package AplikasiBookingTiketNonton;

class Customer{
    protected String statusPlan = "Bukan Member";
    private final String nama;
    private final String alamat;
    private int noMember;
    protected int totalTagihan;

    protected Customer(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }

    protected Customer(String nama, String alamat, int noMember){
        this.nama = nama;
        this.alamat = alamat;
        this.noMember = noMember;
        this.statusPlan = "Member";
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getNoMember() {
        return noMember;
    }

}

class Bioskop{
    final int hargaTiket = 50_000;
    final int hargaMember = 30_000;
    final double diskon = 5./100;
    final int hargaTiketMember = (int) (hargaTiket - (hargaTiket*diskon));
    Customer customer;
    private String namaFilm;
    int counter;

    // Constructor untuk Reguler Plan
    Bioskop(String nama, String alamat){
        customer = new Customer(nama,alamat);
    }

    // Constructor untuk Member Plan
    Bioskop(String nama, String alamat, int noMember){
        customer = new Customer(nama, alamat,noMember);
    }

    // Method untuk Reguler Plan
    void pesenTiket(String namaFilm){
        customer.totalTagihan += hargaTiket;
        this.namaFilm = namaFilm;
        show();
        showTagihan();
        garisDobel();
        customer.totalTagihan=0;
    }

    // Method untuk Member Plan
    void pesenTiket(String namaFilm, String makanan, String minuman){
        if (customer.statusPlan.equals("Member")){
            counter++;
            if (counter == 1) {
                customer.totalTagihan = hargaTiketMember + hargaMember;
            } else {
                customer.totalTagihan = hargaTiketMember;
            }
            this.namaFilm = namaFilm;
            show();
            System.out.println("---------- Bonus Member ----------" +
                    "\nSelamat, Anda mendapatkan bonus.");
            System.out.println("Makanan : " + makanan);
            System.out.println("Minuman : " + minuman );
            showTagihan();
            garisDobel();
            customer.totalTagihan=0;
        } else {
            System.out.println("Anda bukan member kok pesen tiket Member?");
        }
    }

    // Method untuk menampilkan rincian tiket
    void show(){
        garisDobel();
        System.out.println("\t\tRINCIAN TIKET ANDA\n");
        System.out.printf("%-15s : %s\n","Status", customer.statusPlan);
        if (customer.statusPlan.equals("Member")) System.out.printf("%-15s : %d\n","No Member", customer.getNoMember());
        System.out.printf("%-15s : %s\n","Nama", customer.getNama());
        System.out.printf("%-15s : %s\n", "Alamat", customer.getAlamat());
        System.out.printf("%-15s : %s\n", "Nama Film", this.namaFilm);

    }

    // Method untuk menampilkan rincian tagihan
    void showTagihan(){
        garis();
        if (customer.statusPlan.equals("Member")) {
            System.out.printf("%-15s : Rp%6d\n", "Harga Tiket", this.hargaTiketMember);
            if(counter == 1) System.out.printf("%-15s : Rp%6d\n", "Fee Member", this.hargaMember);
        } else {
            System.out.printf("%-15s : Rp%6d\n", "Harga Tiket", this.hargaTiket);
        }
        System.out.printf("%-15s : Rp%6d\n", "Total", customer.totalTagihan);
    }

    static void garis(){
        System.out.println("----------------------------------");
    }

    static void garisDobel(){
        System.out.println("==================================");
    }
}

public class Main {

    public static void main(String[] args) {

        // Regular Plan
        Bioskop customerRegular = new Bioskop("Nama Reguler","Alamat Reguler");
        customerRegular.pesenTiket("Hantu");

        // Member Plan
        Bioskop customerMember = new Bioskop("Nama Member","Alamat Member",12345);
        customerMember.pesenTiket("Lucu","Roti","Susu");

        customerMember.pesenTiket("Byasalah", "Jeruk", "Kopi");
    }
}
