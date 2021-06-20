package Materi;

abstract class Manusia {
    abstract void sound();
    abstract void walking();
}

class Budi extends Manusia {
    @Override
    void sound() {
        System.out.println("Assalamualaikum");
    }

    @Override
    void walking() {

    }

    void salto() {
        System.out.println("Salto");
    }
}

public class MainAbstract {
    public static void main(String[] args) {
        Manusia budi = new Budi();
        budi.sound();
    }
}