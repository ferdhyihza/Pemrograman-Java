package Modul.TugasPraktikum;

/*Perusahaan NV. Meneer memiliki koperasi karyawan yang memungkinkan karyawannya berbelanja di koperasi tersebut. Tentunya, karyawan
tersebut bisa membayar belanjaanya tersebut di akhir bulan melalui pemotongan gaji. Ada 2 kelas yang terlibat disini, Invoice dan
Employee. Kedua class tadi mengimplementasikan interface Payable yang mana ia hanya memiliki satu method yang harus diimplementasikan
di kedua class, yaitu getPayableAmount(). Program harus bisa mengolah gaji karyawan di akhir bulan beserta invoice belanjaan karyawan
yang nantinya gaji karyawan perbulannya dikurang total harga belanjaanya secara polimorfis. Tampilkan informasi dari karyawan
tersebut beserta total gaji setelah dipotong hutang belanjaan di koperasi dan tampilkan pula detail belanjaanya secara polimorfis
pula.

1.  Attribut dari Invoice:
    String productName, Integer quantity, Integer pricePerItem
2.  Attribut dari Employee:
    Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices*/

interface Payable {

    int getPayableAmount();
}

class Invoice implements Payable {

    String productName;
    int qty;
    int pricePerItem;

    @Override
    public int getPayableAmount() {
        return 0;
    }
}

class Employee implements Payable {

    int registrationNumber;
    String name;
    int salaryPerMonth;
    Invoice[] invoices;

    @Override
    public int getPayableAmount() {
        return 0;
    }
}

public class Main {

    public static void main(String[] args) {

    }
}
