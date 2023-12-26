package pkg100days;
import java.util.Scanner;
/*Buatlah program yang dapat mengetahui berapa uang bersih yang didapatkan dari hasil penjualan tanah setelah dipotong pajak dengan ketentuan:
    1. Harga Jual Permeter adalah Rp 300.000
    2. Jika total harga jual 50 jt keatas maka dikenakan pajak 3%
    3. Jika Total harga jual 100 jt keatas maka dikenakan pajak 5%
    4. Dibawah 50jt maka dikenakan pajak 1%.
    5. Luas tanah diinput menggunakan fungsi input*/
public class day79 {
    public static void main(String[] args) {        
        Scanner scan = new Scanner(System.in);
        
        int luas, hargajual, pajak, uangbersih, persentasepajak;
        
        System.out.print("Masukkan Luas tanah: ");
        luas = scan.nextInt();
        hargajual = 300_000 * luas;
        persentasepajak = 0;
        
        if(hargajual >= 50_000_000 && hargajual < 100_000_000){persentasepajak = 3;}
        if(hargajual >= 100_000_000){persentasepajak = 5;}
        if(hargajual < 50_000_000){persentasepajak = 1;}
        
        pajak = (hargajual * persentasepajak)/100;
        uangbersih = hargajual - pajak;
        
        System.out.println("Luas Tanah: "+luas);
        System.out.println("Harga jual Permeter: Rp.300.000");
        System.out.println("Total Harga jual: Rp."+hargajual);
        System.out.println("Potongan pajak: Rp."+pajak);
        System.out.println("Uang Bersih: Rp."+uangbersih);
    }
    
}
