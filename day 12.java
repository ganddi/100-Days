package day.pkg12;

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        System.out.print("Masukkan Angka1: ");
        int angka1 = scanner.nextInt();
        System.out.print("Masukkan Angka2: ");
        int angka2 = scanner.nextInt();
        System.out.print("Masukkan operator: ");
        char operator = scanner.next().charAt(0);
        double hasil;
        
        switch (operator){
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil penjumlahan: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil pengurangan: " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil perkalian: " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println("Hasil pembagian: " + hasil);
                break;
        }
    }
    
}
