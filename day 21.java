package day.pkg21;

import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = scanner.nextInt();
        
      int faktorial = 1;
      int i = 1;
        while (i <= n) {
            faktorial *= i;
            i++;
        }
        System.out.printf( "hasil dari " + n + "! adalah " + faktorial);
    }
    
}
