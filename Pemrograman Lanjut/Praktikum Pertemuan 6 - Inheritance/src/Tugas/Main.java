package Tugas;

/*
Dari semua kelas yang telah dibuat, buatlah testcase (mencetak objek / toString()) untuk kasus berikut :
1. Manusia
    a. Laki-laki telah menikah.
    b. Perempuan telah menikah.
    c. Belum menikah.
2. MahasiswaFilkom (sesuai status Anda)
    a. Ipk < 3
    b. Ipk 3 – 3.5
    c. Ipk 3.5 – 4
3. Pekerja
    a. Lama bekerja 2 tahun, anak 2
    b. Lama bekerja 9 tahun
    c. Lama bekerja 20 tahun, anak 10
4. Manager, lama bekerja 15 tahun dengan gaji $7500

 */

public class Main {

    public static void main(String[] args) {

        gares("Manusia");
        Manusia manusiaA = new Manusia("A","11111",true,true);
        Manusia manusiaB = new Manusia("B","22222",false,true);
        Manusia manusiaC = new Manusia("C","33333",false,false);
        System.out.println(manusiaA);
        System.out.println(manusiaB);
        System.out.println(manusiaC);
        gares();

        gares("MahasiswaFILKOM");
        MahasiswaFILKOM mahasiswaFILKOMA = new MahasiswaFILKOM("205150401111011",2.9,"Ferdhy Ihza","350503",true,false);
        MahasiswaFILKOM mahasiswaFILKOMB = new MahasiswaFILKOM("205150401111011",3.3,"Ferdhy Ihza","350503",true,false);
        MahasiswaFILKOM mahasiswaFILKOMC = new MahasiswaFILKOM("205150401111011",3.9,"Ferdhy Ihza","350503",true,false);
        System.out.println(mahasiswaFILKOMA);
        System.out.println(mahasiswaFILKOMB);
        System.out.println(mahasiswaFILKOMC);
        gares();

        gares("Pekerja");
        Pekerja pekerjaA = new Pekerja(1000,2019,1,1,2,"Pekerja A","111",true,true);
        Pekerja pekerjaB = new Pekerja(1000,2012,1,1,0,"Pekerja B","222",true,true);
        Pekerja pekerjaC = new Pekerja(1000,2001,1,1,10,"Pekerja C","333",true,true);
        System.out.println(pekerjaA);
        System.out.println(pekerjaB);
        System.out.println(pekerjaC);
        gares();

        gares("Manager");
        Manager manager = new Manager("Engineer",7500,2006,1,1,0,"Nak Teknik","12345",true,true);
        System.out.println(manager);
        gares();

    }

    static void gares(){
        System.out.println("===============================");
    }

    static void gares(String judul){
        System.out.println("===============================");
        System.out.printf("Testcase : %s\n", judul);
        System.out.println("-------------------------------\n");
    }
}
