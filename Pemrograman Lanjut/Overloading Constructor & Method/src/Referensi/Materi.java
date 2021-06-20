package Referensi;

/*
Ceritanya ini aplikasi jual mobil,
Kami PT. Mobil Sukun menyediakan mobil:
    1. Baru
    2. Bekas
Spesifikasi Mobil Baru:
    1. Belum punya owner
    2. Belum punya plat
    3. Punya manufaktur
    4. Punya maxSpeed
Spesifikasi Mobil Bekas:
    1. Punya owner
    2. Punya plat
    3. Punya manufaktur
    4. Punya maxSpeed
Anda bisa beli bekas atau baru, BEBAS LOS
Beli Baru: Maka anda perlu masukkan nama anda dan nomer plat
Beli Bekas: Tidak perlu masukkan apa-apa langsung beli gas pol, tapi anda juga bisa ganti nama
Kami melayani ganti nama untuk pembelian mobil bekas.
 */
class CarDealer {
    // Atribut dari mobil
    String plat;
    String owner;
    String manufacture;
    int maxSpeed;

    // Constructor untuk mobil bekas (mobil bekas sudah punya owner dan plat)
    public CarDealer(String plat, String owner, String manufacture, int maxSpeed) {
        this.plat = plat;
        this.owner = owner;
        this.manufacture = manufacture;
        this.maxSpeed = maxSpeed;
    }

    // Constructor untuk mobil baru (mobil baru belum punya owner dan plat)
    public CarDealer(String manufacture, int maxSpeed) {
        this.manufacture = manufacture;
        this.maxSpeed = maxSpeed;
    }

    // buyCar untuk mobil bekas
    public void buyCar() {
        System.out.println("Kamu telah membeli mobil bekas:\n" +
                "Owner sebelumnya: " + owner + "\n" +
                "Plat sebelumnya: " + plat + "\n" +
                "Manufaktur: " + manufacture + "\n" +
                "Max Speed: " + maxSpeed);
    }

    // buyCar untuk mobil baru
    public void buyCar(String owner, String plat) {
        this.owner = owner;
        this.plat = plat;
        System.out.println("Kamu telah membeli mobil baru:\n" +
                "Owner: " + this.owner + "\n" +
                "Plat: " + this.plat + "\n" +
                "Manufaktur: " + manufacture + "\n" +
                "Max Speed: " + maxSpeed);
    }

    // changeOwner untuk mobil bekas
    public String changeOwner(String newOwner) {
        this.owner = newOwner;
        return "Berhasil ganti owner, owner sekarang adalah " + this.owner;
    }

    // mobil baru tidak perlu changeOwner
}


public class Materi {
    public static void main(String[] args) {
        // Beli bekas
        CarDealer mobilBekas = new CarDealer("N 1234 CK", "Budimen", "Mini Cooper", 1000);
        mobilBekas.buyCar();
        System.out.println(mobilBekas.changeOwner("Kevin Ketimun Laut"));

        System.out.println("========================================");

        // Beli baru
        CarDealer mobilBaru = new CarDealer("Honda Brio", 2000);
        mobilBaru.buyCar("Whatshit Tuya", "N 8970 AS");
    }
}
