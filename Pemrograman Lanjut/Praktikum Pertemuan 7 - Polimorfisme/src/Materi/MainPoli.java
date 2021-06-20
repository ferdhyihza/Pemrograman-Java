package Materi;

class Animal {
    void animalSound() {
        System.out.println("default sound");
    }
}

class Pig extends Animal{
    @Override
    void animalSound() {
        super.animalSound();
    }
}

public class MainPoli {
    public static void main(String[] args) {
        Animal pig = new Pig();
        pig.animalSound();
    }
}