package pkg100days;

import java.util.Arrays;
import java.util.Scanner;

public class day59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String array[] = new String[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan Nama ke "+(i+1)+": ");
            array[i] = scan.next();
        }
        System.out.println(Arrays.toString(array));   
    }
    
}
