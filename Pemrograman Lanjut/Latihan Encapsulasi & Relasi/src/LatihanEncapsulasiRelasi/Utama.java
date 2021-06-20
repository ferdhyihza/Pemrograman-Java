package LatihanEncapsulasiRelasi;

public class Utama {

    public static void main(String[] args) {
        Car car1 = new Car("Avanza", 1500, "Silver");
        Car car2 = new Car("Xenia", 1500, "Black");
        Car car3 = new Car("Xpander", 1500, "White");
        Car car4 = new Car("Jazz", 1500, "Red");

        Person person1 = new Person("Andi", "Malang");
        Person person2 = new Person("Budi", "Blitar");
        Person person3 = new Person("Cindi", "Surabaya");
        Person person4 = new Person("Didi", "Kediri");

        Samsat samsat = new Samsat();
        samsat.createSTNK(person1,car1,"N 1234 YZ");
        samsat.createSTNK(person2,car2,"N 1234 YZ");
        samsat.createSTNK(person3,car3,"N 1234 YZ");
        samsat.createSTNK(person4,car4,"N 1234 YZ");

        samsat.printAllInfoSTNK();
        System.out.println("MENAMPILKAN JUMLAH STNK\n" +
                "Jumlah STNK: " + samsat.getJumlahSTNK());

    }

}
