package Tugas;

abstract class Organism {

    private String name;

    Organism(String name){
        this.name = name;
    }

    abstract void breathe();

    abstract void reproduction();

    abstract void move();

    void grow(){
        System.out.println(this.name + " grows up");
    }

    void eat(){
        System.out.println(this.name + " eating food");
    }

    void excretion(){
        System.out.println(this.name + " bab");
    }

    public String getName() {
        return name;
    }

}

abstract class Animal extends Organism{

    boolean isHeterotrophs;

    Animal(boolean isHeterotrophs, String name) {
        super(name);
        this.isHeterotrophs = isHeterotrophs;
    }

    abstract void huntingFood();

}

interface Mammals {

    void breastFeeding();
}

interface Viviparous {

    void beranak();
}

class Tapir extends Animal implements Mammals, Viviparous{

    Tapir(boolean isHeterotrophs, String name) {
        super(isHeterotrophs, name);
    }

    @Override
    void breathe() {
        System.out.println(getName() + " breathing with paru-paru");
    }

    @Override
    void reproduction() {
        System.out.println(getName() + " beranak singa");
    }

    @Override
    void move() {
        System.out.println(getName() + " running-running");
    }

    @Override
    void huntingFood() {
        System.out.println(getName() + " hunting food for lyfe");
    }

    @Override
    public void breastFeeding() {
        System.out.println(getName() + " feeding it's children");
    }

    @Override
    public void beranak() {
        System.out.println(getName() + " berkembangbiak dengan melahirkan");
    }
}

public class Main {

    public static void main(String[] args) {

        Tapir tapir = new Tapir(true,"Tapir");
        tapir.breathe();
        tapir.reproduction();
        tapir.move();
        tapir.grow();
        tapir.eat();
        tapir.excretion();
        tapir.huntingFood();
        tapir.breastFeeding();
        tapir.beranak();
    }
}





