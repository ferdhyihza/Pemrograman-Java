package UTS;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class nomor3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        DecimalFormat UANGINDO = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        UANGINDO.setDecimalFormatSymbols(formatRp);

        double saldoPokokPinjaman = scan.nextInt();
        double sukuBungaTiapTahun = scan.nextInt();
        double jumlahBulan = scan.nextInt();

        int angsuranPokok = (int) (saldoPokokPinjaman/jumlahBulan);
        System.out.print("Angsuran pokok: " + UANGINDO.format(angsuranPokok) + "\n\n");

        System.out.print("Angsuran bulan ke : ");
        int bulan = scan.nextInt();
        System.out.println("Total angsuran bulan ke " + bulan + " yaitu " + UANGINDO.format(hitungAngsuran(saldoPokokPinjaman,sukuBungaTiapTahun,jumlahBulan,bulan)));

    }

    public static int hitungAngsuran(double spp, double bunga, double bulan, int bulanN){
        DecimalFormat UANGINDO = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        UANGINDO.setDecimalFormatSymbols(formatRp);

        int angsuranPokok = (int) (spp/bulan);
        int angsuranBayar=0;
        for (int i=1 ; i<=bulan ; i++) {
            int angsuranBunga = (int) (spp*(bunga/100)/12);
            angsuranBayar = angsuranPokok+angsuranBunga;
            spp = (int) (spp - angsuranPokok);
            if (i == bulanN) break;
        }
        return angsuranBayar;
    }
}
