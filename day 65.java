package pkg100days;

import java.util.Scanner;

public class day65 {
    public static void main(String[] args) {
        int angkaBOOM = (int) (Math.random() * 100) + 1;

        Scanner scan = new Scanner(System.in);
        int tebakan;
        int kecil = 0;
        int besar = 100;
        System.out.println("Selamat datang di Game Angka BOOM!");
        System.out.println("\nPeserta diminta memasukkan angka antara 1 sampai 100\npeserta yang mendapatkan angka BOOM! dinyatakan kalah\n");

        do {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = scan.nextInt();

            if (tebakan < angkaBOOM) {
                if(tebakan < kecil){continue;}
                kecil = tebakan;
                System.out.printf("Angka diantara %d dan %d" ,kecil,besar);
            } else if (tebakan > angkaBOOM) {
                if(tebakan > besar){continue;}
                besar = tebakan;
                System.out.printf("Angka diantara %d dan %d",kecil,besar);
           } else {
                System.out.println(angkaBOOM + " adalah Angka BOOM!");
            }
        } while (tebakan != angkaBOOM);

        scan.close();
    }
    
}
