package Materi;

//    Class Pet:
//            Constructor
//            Attributes:
//            - price: double
//            - age: int
//            - species: String
//            - gender: boolean
//            Methods:
//            + getter
//            + setter
//            + toString
//            Notes:
//            ~ getGender if true return Male else Female
//            ~ getPrice if gender return price + 25 else price
//            ~ toString return all attributes

public class Pet {

    private double price;
    private int age;
    private String species;
    private boolean gender;

    public Pet(double price, int age, String species, boolean gender) {
        this.price = price;
        this.age = age;
        this.species = species;
        this.gender = gender;
    }

    public double getPrice() {
        return price + (gender ? 25 : 0);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        return gender ? "Male" : "Female";
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "price : " + getPrice() + "\n" +
                "age : " + getAge() + "\n" +
                "species : " + getSpecies() + "\n" +
                "gender : " + getGender() + "\n";
    }
}
