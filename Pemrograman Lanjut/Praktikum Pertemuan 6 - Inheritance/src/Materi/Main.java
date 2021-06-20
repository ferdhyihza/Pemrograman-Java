package Materi;

/*
    Class Pet:
        Constructor
        Attributes:
            - price: double
            - age: int
            - species: String
            - gender: boolean
        Methods:
            + getter
            + setter
            + toString
    Notes:
        ~ getGender if true return Male else Female
        ~ getPrice if gender return price + 25 else price
        ~ toString return all attributes
    Class Cow extends Pet
        Constructor
        Attributes:
            - horn: boolean
        Methods:
            + getter
            + setter
            + getPrice
            + toString
    Notes:
        ~ getHorn if horn return "Bertanduk" else "Belum bertanduk"
        ~ toString return parent attributes and horn
*/

public class Main {

    public static void main(String[] args) {

        // Test untuk class Pet
        Pet pet1 = new Pet(1000, 1, "Ikan Lele", true);
        System.out.println(pet1);

        Pet pet2 = new Pet(1000, 1, "Ikan Lele", false);
        System.out.println(pet2);

        // Test untuk class Cow
        Cow cow1 = new Cow(true, 5000, 2, "Limosin", true);
        System.out.println(cow1);

        Cow cow2 = new Cow(false, 5000, 2, "Limosin", true);
        System.out.println(cow2);
    }

}
