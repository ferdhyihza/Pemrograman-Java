package Agregasi;

public class Main {

    public static void main(String[] args) {

        Dosen budi = new Dosen("Budi");
        Mahasiswa toni = new Mahasiswa("Toni", "12345");
        Mahasiswa doni = new Mahasiswa("Doni", "678910");

        budi.getMhsList().add(toni);
        budi.getMhsList().add(doni);

        System.out.println("Get nama Toni dari objek toni : " + toni.getNama());
        System.out.println("Get nama Toni dari objek dosen : " + budi.getMhsList().get(0).getNama());

        budi = null;

        System.out.println("Get nama Toni dari objek toni : " + toni.getNama());
        System.out.println("Get nama Toni dari objek dosen : " + budi.getMhsList().get(0).getNama());


    }
}
