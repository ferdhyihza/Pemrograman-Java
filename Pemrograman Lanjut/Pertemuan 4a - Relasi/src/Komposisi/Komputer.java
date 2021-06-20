package Komposisi;

public class Komputer {

    private Processor CPU;
    private int tahun;

    public Komputer(int tahun){
        this.tahun = tahun;
        CPU = new Processor("Ryzen 5600x", 4700);
    }

    public Processor getCPU() {
        return CPU;
    }

    public void setCPU(Processor CPU) {
        this.CPU = CPU;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}
