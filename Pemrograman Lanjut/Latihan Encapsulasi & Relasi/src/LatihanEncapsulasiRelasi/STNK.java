package LatihanEncapsulasiRelasi;

public class STNK {

    private String nopol;
    Car car;
    Person owner;

    STNK(Person owner, Car car, String nopol){
        this.owner = owner;
        this.car = car;
        this.nopol = nopol;
    }

    void setOwner(Person owner){
        this.owner = owner;
    }

    void setCar(Car car){
        this.car = car;
    }

    void setNopol(String nopol){
        this.nopol = nopol;
    }

    String getNopol(){
        return this.nopol;
    }

    void getInfo(){
        System.out.printf("%-16s: %s\n", "Nomor Kendaraan", getNopol());
        System.out.printf("%-16s: %s\n", "Pemilik", owner.getName());
        System.out.printf("%-16s: %s\n", "Alamat", owner.getAddress());
        System.out.printf("%-16s: %s\n", "Kendaraan", car.getTypeName());
        System.out.printf("%-16s: %s\n", "CC", car.getCC());
        System.out.printf("%-16s: %s\n", "Warna", car.getColour());
    }

}
