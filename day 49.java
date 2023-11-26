package pkg100days;

import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        String[] array = {"index pertama", "index kedua", "index kegita", "index keempat", "index kelima"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan indeks yang ingin ditampilkan: ");
        
        int indexToDisplay = sc.nextInt();

        if (indexToDisplay >= 0 && indexToDisplay < array.length) {
            System.out.println(indexToDisplay +" "+ array[indexToDisplay]);
        } else {
            System.out.println("Indeks tidak valid");
        }

        sc.close();
    }
    
}
