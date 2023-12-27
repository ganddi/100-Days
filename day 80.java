package pkg100days;
import java.util.Scanner;
/*Buatlah program yang dapat memprediksi keuntungan setiap tahun yang akan didapatkan seorang investor jika ketentuan investasi
sebagai berikut:
1. Keuntungan tiap tahun adalah 5% dari total investasi
2. Setiap keuntungan per tahun, dimasukkan menjadi tambahan modal investasi pada tahun berikutnya
3. Modal awal dan lama investasi (dalam tahun) di input menggunakan fungsi input()*/
public class day80 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int modal, lama, untung;
        
        System.out.print("Masukkan modal awal: ");
        modal = scan.nextInt();
        System.out.print("Masukkan lama investasi: ");
        lama = scan.nextInt();
        
        for (int i = 1; i <= lama; i++)
        {untung = (modal*5)/100;
         System.out.println("untung tahun ke "+i+" adalah Rp."+untung);
         modal += untung;}
}}