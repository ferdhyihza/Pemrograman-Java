package LatihanPemlan;

public class Person {

    private String address;
    private String name;

    public Person(String name, String address) {
        this.address = address;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
