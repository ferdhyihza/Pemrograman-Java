package AplikasiBookingTiketNonton;

public class Main {

    public static void main(String[] args) {

        // Regular Plan
        Bioskop customerRegular = new Bioskop("Nama Reguler","Alamat Reguler");
        customerRegular.pesenTiket("Hantu");
        customerRegular.changeName("Nama barunya");

        // Member Plan
        Bioskop customerMember = new Bioskop("Nama Member","Alamat Member",12345);
        customerMember.pesenTiket("Lucu","Roti","Susu");

    }
}
