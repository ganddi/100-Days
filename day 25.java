package day.pkg25;

import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
    
        /* Buat program yang meminta inputan jari-jari,
       yang kemudian dihitung dan di tampilkan luas dan keliling lingkaran tersebut */
    
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Jari jari lingkaran : ");
        double jariJari = sc.nextDouble();
        
        double luasLingkaran = 3.1415 * jariJari * jariJari;
        double kelilingLingkaran = 2 * 3.1415 * jariJari;
        System.out.format("Luas lingkaran dari jari jari %s cm adalah %s cm^2 %n", jariJari, luasLingkaran);
        System.out.format("Keliling lingkaran dari jari jari %s cm adalah %s cm %n", jariJari, kelilingLingkaran);
        
    }
    
}
