import java.util.Scanner;
public class KonversiWaktu {

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        jumlahdata ();
        double sisa1;
        double bulan;
        double sisa2;
        int hari;
        double tahun;
        hari = input.nextInt ();

        tahun = hari / 365;
        sisa1 = hari % 365;

        bulan = hari / 30;
        sisa2 = hari % 30;

        System.out.println (hari + "hari = " + tahun + "tahun");
        System.out.println (bulan + "bulan dan " + sisa2 + "hari");

    }

    private static void jumlahdata () {
        int hari;
        double tahun, sisa1, bulan, sisa2;

        System.out.println ("Masukkan Jumlah Hari :");
    }
}
