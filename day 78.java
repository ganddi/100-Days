package pkg100days;
import java.util.Scanner;
public class day78 {
/*  Buatlah program yang mengetahui gaji bersih yang diterima karyawan setiap bulannya dengan ketentuan:
    1. Gaji pokok masukkan melalui input
    2. Gaji lembur/jam adalah Rp. 55.000
    3. Lama lembur dimasukkan melalui fungsi input()*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan gaji pokok: ");
        int gajiPokok = scan.nextInt();
        System.out.println("Masukkan lama lembur: ");
        int lamaLembur = scan.nextInt();
        int gajiLembur = lamaLembur * 55000;
        int hasil = gajiPokok + gajiLembur;
        System.out.println("Total gaji keseluruhan adalah: "+ hasil);
        
    }
    
}
