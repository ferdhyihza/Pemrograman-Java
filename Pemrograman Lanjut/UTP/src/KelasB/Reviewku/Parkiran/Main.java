package KelasB.Reviewku.Parkiran;

public class Main {

    public static void main(String[] args) {

        Parkiran parkiran = new Parkiran();
        parkiran.generateTiket("N 1234 BV", "Honda Jazz", "Black");
        parkiran.generateTiket("B 1232 LK", "Honda Civic", "Silver");
        parkiran.generateTiket("AG 6666 LC", "Mitsubishi Pajero", "Black");
        parkiran.generateTiket("AG 999 LC", "Mitsubishi Lancer", "Dark Blue");

        System.out.println("========List Tiket========");
        Tiket[] tikets = parkiran.getListTiket();
        for (Tiket s : tikets
        ) {
            System.out.println();
            s.show();
        }
        System.out.println("==========================");
        parkiran.totalCarParking();
        parkiran.availablePlace();
        System.out.println("--------------------------");
        parkiran.mobilOut(1);
        System.out.println("==========================");
        parkiran.totalCarParking();
        parkiran.availablePlace();
        System.out.println("--------------------------");
        parkiran.generateTiket("Z 0909 SS", "Suzuki Swift", "Light Pink");
        parkiran.generateTiket("L 4631 TS", "Toyota Supra", "White");
        tikets = parkiran.getListTiket();
        for (Tiket s : tikets
        ) {
            System.out.println();
            s.show();
        }
        System.out.println("==========================");
        parkiran.totalCarParking();
        parkiran.availablePlace();
    }
}
