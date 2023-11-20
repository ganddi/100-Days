package pkg100days;

import java.util.Scanner;

public class day43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nilai = new int[5];
        double hasil = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan nilai ke-" + (i + 1) + ":");
            nilai[i] = scanner.nextInt();
            hasil += nilai[i];
        }

        double rataRata = hasil / nilai.length;
        System.out.println("Rata-rata nilai adalah: " + rataRata);
    }
    
}
