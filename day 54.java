package pkg100days;
  
import java.util.Scanner;

public class day54 {
    public static void main(String[] args) {
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli"};
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan nomor bulan (1-7): ");
        int nomorBulan = scan.nextInt();
        if (nomorBulan >= 1 && nomorBulan <= 7) {
            String namaBulan = bulan[nomorBulan - 1];
            System.out.println("Nama bulan untuk nomor " + nomorBulan + " adalah: " + namaBulan);
        } else {
            System.out.println("Nomor bulan tidak valid. Harap masukkan nomor antara 1 dan 7.");
        }
        scan.close();
    }
}