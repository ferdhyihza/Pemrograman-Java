package LatihanEncapsulasiRelasi;

public class Person {

    private final String address;
    private String name;

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    String getName(){
        return this.name;
    }

    String getAddress(){
        return this.address;
    }
}
