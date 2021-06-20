package LatihanPemlan;

public class Utama {

    public static void main(String[] args) {

        Person person1 = new Person("Adlant", "Banjarmasin");
        Person person2 = new Person("Ali", "Sumedang");
        Person person3 = new Person("Vania", "Bogor");
        Person person4 = new Person("Ferdi", "Blitar");

        Car car1 = new Car("Bus",3000, "Black");
        Car car2 = new Car("Mobil",1000, "Red");
        Car car3 = new Car("Truck",5000, "Yellow");
        Car car4 = new Car("Mobil",1500, "Blue");

        Samsat samsat = Samsat.getInstance();

        assert samsat != null;
        samsat.createSTNK(person1,car1,"N 1234 AA");
        samsat.createSTNK(person2,car2,"N 3476 DB");
        samsat.createSTNK(person3,car3,"DA 1132 AG");
        samsat.createSTNK(person4,car4,"B 1543 DE");
        //System.out.println("Count: " + Samsat.count);
        samsat.printAllInfoSTNK();

        //Percobaan objek kelas samsat lebih dari 1
         Samsat samsat2 = Samsat.getInstance();
         samsat2.createSTNK(person1,car1,"AG 123 ST");
         samsat2.printAllInfoSTNK();

        System.out.println("JUMLAH SEMUA STNK: " + samsat.getJumlahStnk());
    }
}
