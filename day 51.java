package pkg100days;

import java.util.Scanner;

public class day51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        int gan = 0; 
        int gen = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan nilai index "+i+" : ");
            array[i]= scan.nextInt();
            if(i % 2 ==0){
                gen++;
            }else{
                gan++;
            }
        }System.out.format("Jumlah nilai ganjil : %d%nJumlah nilai genap : %d%n",gan, gen);
        
    }
}