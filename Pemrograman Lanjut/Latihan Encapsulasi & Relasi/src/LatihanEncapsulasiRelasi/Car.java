package LatihanEncapsulasiRelasi;

public class Car {

    private String colour;
    private int CC;
    private String typeName;

    Car(String typeName, int CC, String colour){
        this.typeName = typeName;
        this.CC = CC;
        this.colour = colour;
    }

    String getTypeName(){
        return typeName;
    }

    int getCC(){
        return CC;
    }

    String getColour(){
        return colour;
    }
}
