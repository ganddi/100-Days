package pkg100days;

import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
      Scanner ner = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal array: ");
        int batasAwal = ner.nextInt();
        System.out.print("Masukkan batas akhir array: ");
        int batasAkhir = ner.nextInt();
        
        if (batasAwal > batasAkhir) {
            System.out.println("Batas akhir harus lebih besar dari batas awal. Program berhenti.");
            System.exit(0);
        }
        int[] numbers = new int[batasAkhir - batasAwal + 1];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = batasAwal + i;
        }   System.out.println("\nBilangan ganjil dalam rentang:");
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
