package pkg100days;

import java.util.Scanner;

public class day53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlah = 0;
        int rentang = 0;
        System.out.println("Masukkan bilangan bulat (masukkan 0 untuk mengakhiri):");
        while (true) {
            int bilangan = scan.nextInt();
            if (bilangan == 0) {
                break;
            }
            jumlah+= bilangan;
            rentang++;
        }
        if (rentang != 0) {
            double rataRata = (double) jumlah / rentang;
            System.out.println("Rata-rata dari bilangan yang dimasukkan: " + rataRata);
        } else {
            System.out.println("Tidak ada bilangan yang dimasukkan.");
        }
        scan.close();
    }
    
}
