package pkg100days;

import java.util.Scanner;

public class day55 {
    /*Buatlah program deteksi genap ganjil dimana program tersebut dapat melakukan input nilai melalui console,
      mula-mula program akan meminta jumlah inputan, selanjutnya menginput nilai-nilai tertentu.
      output program hanya menampilkan tulisan genap ganjil (scanner, looping, percabangan)
      Masukkan jumlah inputan : 4  
      12
      46
      87
      55
      Genap
      Genap
      Ganjil
      Ganjil */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.print("Masukkan jumlah inputan: ");
        
        int jumlahInputan = scan.nextInt();

        int[] nilai = new int[jumlahInputan];
       
        for (int i = 0; i < jumlahInputan; i++) {
            System.out.print("Masukkan nilai: ");
            nilai[i] = scan.nextInt();
        }
       
        for (int i = 0; i < jumlahInputan; i++) {
            if (nilai[i] % 2 == 0) {
                System.out.println("Genap");
            } else {
                System.out.println("Ganjil");
            }
        }
        }
    }