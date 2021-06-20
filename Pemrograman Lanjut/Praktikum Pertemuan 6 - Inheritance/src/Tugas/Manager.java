package Tugas;

public class Manager extends Pekerja {

    private String departemen;

    public Manager(String departemen, double gaji, int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahAnak, String nama, String nik, boolean jK, boolean menikah) {
        super(gaji, tahunMasuk, bulanMasuk, tanggalMasuk, jumlahAnak, nama, nik, jK, menikah);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + 0.1 * super.getGaji();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Departemen : " + getDepartemen() + "\n";
    }
}
