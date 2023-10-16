package day.pkg8;

import java.util.Scanner;

public class Day8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Masukkan Angka: ");
        int angka = scanner.nextInt();
        String hasil = (angka > 7) ? "Lebih besar dari 7" : "Tidak lebih besar dari 7";
        System.out.printf("Angka %d ", angka );
        System.out.println(hasil);

        System.out.print("Masukkan Bilangan: ");
        int bilangan = scanner.nextInt();
        String jenis = (bilangan % 2 == 0)? "Genap" : "Ganjil";
        System.out.printf("Bilangan %d " , bilangan);
        System.out.println("adalah bilangan " + jenis);
        
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();
        String status = (nilai >= 75)? "Lulus" : "Tidak Lulus, see you tahun depan";
        System.out.println("Status : " + status);
    }
}