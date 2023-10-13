package day.pkg5;

import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         System.out.print("Masukkan nilai a : ");
        int nilai_a = input.nextInt();
        System.out.print("Masukkan nilai b : ");
        int nilai_b = input.nextInt();
        
        if (nilai_a > nilai_b){
            System.out.println("nilai a lebih besar dari pada nilai b");
        }else if(nilai_a < nilai_b){
            System.out.println("nilai b lebih besar dari pada nilai a");
        }else{
            System.out.println("nilai a sama dengan nilai b");
        }
    }
    
}
