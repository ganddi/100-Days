package day.pkg9;

import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai: ");
        int nilai = scanner.nextByte();
        String kategori = (nilai >= 90) ? "A" : (nilai >= 80) ? "B" : (nilai >= 70) ? "C" : (nilai >= 60)? "D" : "E";
        System.out.println("Kategori nilai: " + kategori);
        
        System.out.print("Masukkan Umur: ");
        int umur = scanner.nextInt();
        System.out.print("Warga Negara Indonesia ? : ");
        boolean wNI = scanner.nextBoolean();
        String status = (umur >= 17 ) ? ((wNI)? "Sudah memiliki hak pilih dan wajib mengikuti Pemilu" : "Tidak memiliki hak pilih") : "Belum memiliki hak pilih" ;
        System.out.println(status);
    }
    
}
