package KlinikKoding1;

public class Buku {

    private String judul;
    private int stok;
    private String penulis;
    private String genre;

    public Buku(String judul, int stok, String penulis, String genre) {
        this.judul = judul;
        this.stok = stok;
        this.penulis = penulis;
        this.genre = genre;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getStok() {
        return stok;
    }

    public void addStok(int stok) {
        this.stok += stok;
    }

    public void reduceStok(int stok) {
        this.stok -= stok;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
