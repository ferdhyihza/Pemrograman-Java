package LatihanPemlan;

public class Car {

    private String colour;
    private int CC;
    private String typeName;

    Car(String typeName, int CC, String colour){
        this.typeName = typeName;
        this.CC = CC;
        this.colour = colour;
    }

    public String getTypeName() {
        return typeName;
    }

    public int getCC() {
        return CC;
    }

    public String getColour() {
        return colour;
    }
}
