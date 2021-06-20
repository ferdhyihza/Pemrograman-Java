package LatihanPemlan;

public class STNK {

    private String nopol;
    Car car;
    Person owner;

    STNK(Person owner, Car car, String nopol){
        this.owner = owner;
        this.car = car;
        this.nopol = nopol;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    public String getNopol() {
        return nopol;
    }

    void getInfo(){
        System.out.printf("| %-16s: %-11s |\n", "Nomor Kendaraan", getNopol());
        System.out.printf("| %-16s: %-11s |\n", "Pemilik", owner.getName());
        System.out.printf("| %-16s: %-11s |\n", "Alamat", owner.getAddress());
        System.out.printf("| %-16s: %-11s |\n", "Kendaraan", car.getTypeName());
        System.out.printf("| %-16s: %-11s |\n", "CC", car.getCC());
        System.out.printf("| %-16s: %-11s |\n", "Warna", car.getColour());
    }
}
