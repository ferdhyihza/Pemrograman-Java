package AplikasiBookingTiketNonton;

public class Customer {

    private String nama;
    private String alamat;
    private int noMember;
    
    Customer(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    
    Customer(String nama, String alamat, int noMember){
        this.nama = nama;
        this.alamat = alamat;
        this.noMember = noMember;
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
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
}
