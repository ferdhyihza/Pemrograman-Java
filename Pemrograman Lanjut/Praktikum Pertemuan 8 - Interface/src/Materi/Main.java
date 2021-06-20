package Materi;

interface Ayah {

    public void speakIndonesia();
}

interface Ibu {

    public void speakThailand();
}

class Anak implements Ayah, Ibu {
    @Override
    public void speakIndonesia() {
        System.out.println("Aku orang indonesia");
    }

    @Override
    public void speakThailand() {
        System.out.println("aakua");
    }
}

public class Main {
    public static void main(String[] args) {
        Anak anak = new Anak();
        anak.speakIndonesia();
        anak.speakThailand();
    }
}
