package Soal;

class Plat{

    int generatorPlat = (int) (Math.random()*10000);

    String plat;
    String daerah;

    Plat(String daerah){
        this.daerah = daerah;
        this.plat = getDuaHurufAwal(daerah) + " " + getAngka() + " " + getTigaHurufTerakhir();
    }

    public void show(){
        System.out.printf("%-10s : %s\n", "Daerah", this.daerah);
        System.out.printf("%-10s : %s\n\n", "Nomer Plat", this.plat);
    }

    private String getDuaHurufAwal(String daerah){
        final String KODE_JKT = "B";
        final String KODE_SBY = "L";
        final String KODE_MLG = "N";
        final String KODE_KDR = "AG";
        return switch (daerah){
            case "Jakarta","jakarta" -> KODE_JKT;
            case "Surabaya","surabaya" -> KODE_SBY;
            case "Malang","malang" -> KODE_MLG;
            case "Kediri","kediri" -> KODE_KDR;
            default -> throw new IllegalStateException("Unexpected value: " + daerah);
        };
    }

    private int getAngka(){
        int angka = generatorPlat;
        if (angka<1000) angka+=1000;
        return angka;
    }

    private String getTigaHurufTerakhir(){
        char[] huruf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        String[] platArr = new String[3];
        for (int i=0 ; i<platArr.length ; i++){
            int r = (int) (Math.random()*10);
            platArr[i] = String.valueOf(huruf[r]);
        }
        return String.join("",platArr);

    }

}

public class Samsat {

    public static void main(String[] args) {

        Plat kendaraan1 = new Plat("Malang");
        Plat kendaraan2 = new Plat("Jakarta");
        Plat kendaraan3 = new Plat("Kediri");
        Plat kendaraan4 = new Plat("Surabaya");

        Plat[] arrKendaraan = {kendaraan1,kendaraan2,kendaraan3,kendaraan4};
        for (Plat s:arrKendaraan) {
            s.show();
        }



    }
}
