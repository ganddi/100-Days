package day.pkg20;

import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan gaji : ");
        double gaji = scanner.nextDouble();

        double potonganPajak = 0.0;

        if (gaji >= 3_000_000 && gaji < 5_000_000) {
            potonganPajak = 0.05 * gaji;
            System.out.println("Potongan pajak sebesar 5%");
        } else if (gaji >= 5_000_000) {
            potonganPajak = 0.10 * gaji;
            System.out.println("Potongan pajak sebesar 10%");
        }
        
        double gajiSetelahPotongan = gaji - potonganPajak;

        System.out.println("Gaji sebelum potongan: " + gaji);
        System.out.println("Potongan pajak: " + potonganPajak);
        System.out.println("Gaji setelah potongan: " + gajiSetelahPotongan);

        scanner.close();    }

}
