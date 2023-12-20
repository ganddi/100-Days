package pkg100days;

import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] array2 = new int[3][3];    
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    System.out.printf("Masukkan nilai index ke %d.%d:",i,j);
                    array2[i][j] = scan.nextInt();}}
        
        int baris = 0;
            while(baris < array2.length){
                int kolom = 0;
                while(kolom < array2[baris].length){
                    System.out.print(array2[baris][kolom]);
                    ++kolom;}
             System.out.println();
            ++baris;
 }}}
