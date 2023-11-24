package pkg100days;

import java.util.Arrays;
import java.util.Scanner;

public class day47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        
        int[] array = new int[5];
        int arraybaru = 0; 

        while (true) {
            System.out.println("Array saat ini: " + Arrays.toString(array));
            System.out.print("Masukkan angka (0 untuk keluar): ");
            
            int input = sc.nextInt();

            if (input == 0) {
                break; 
            }
            if (arraybaru == array.length) {
                array = Arrays.copyOf(array, array.length * 2);
            }
            array[arraybaru] = input;
            arraybaru++;
        }
        System.out.println("Array akhir: " + Arrays.toString(Arrays.copyOf(array, arraybaru)));
        sc.close();
    }
}