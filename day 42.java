package pkg100days;

import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        String[] nama = new String[6];
        
        Scanner ner = new Scanner(System.in);
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Anggota Kelompok" + i +": ");
            nama[i] = ner.nextLine();  
        }
        System.out.println("----------------------------");
        for(String k : nama){
            System.out.println(k);
        }
    }
    
}
