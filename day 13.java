package day.pkg13;

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan kategori nilai: ");
        char hari = scanner.next().charAt(0);
        String nilai;
        switch (hari) {
            case 'A' -> nilai = "100 - 90";
            case 'B' -> nilai = "89 - 80";
            case 'C' -> nilai = "79 - 70";
            case 'D' -> nilai = "69 - 60 ";
            case 'E' -> nilai = "59 - 0";
            default -> nilai = "Kategori tidak valid";
            
    }
        System.out.println("Rentang nilai :" + nilai);
}
}