package day.pkg17;

import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        //Menentukan Harga motor honda menggukan rule switch dan input char
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("a. Motor Matic");
        System.out.println("b. Motor Manual");
        System.out.print("Pilih tipe motor: ");
        
        char tipe = scanner.next().charAt(0);

       
 switch (tipe){
           case 'a' -> {
               System.out.println("a. BeAT");
               System.out.println("b. Genio");
               System.out.println("c. Scoopy");
               System.out.println("d. Vario125");
               System.out.println("e. vario160");
               System.out.println("f. PCX 160");
               System.out.println("g. ADV 160");
               System.out.print("Pilih Model: ");
               char model = scanner.next().charAt(0);
               
               switch (model){
                   case 'a' -> System.out.println("Harga Motor BeAT mulai dari Rp. 18,050,000");
                   case 'b' -> System.out.println("Harga Motor Genio mulai dari Rp. 19,110,000");
                   case 'c' -> System.out.println( "Harga Motor Scoopy mulai dari Rp. 21,875,000");
                   case 'd' -> System.out.println("Harga Motor Vario 125 mulai dari Rp. 22,550,000");
                   case 'e' -> System.out.println("Harga Motor Vario 160 mulai dari Rp. 26,639,000");
                   case 'f' -> System.out.println("Harga Motor PCX 160 mulai dari Rp. 32,670,000");
                   case 'g' -> System.out.println( "Harga Motor ADV 160 mulai dari Rp. 36,200,000");
               default -> System.out.println("Inputan Tidak Valid");
               }
            }
 
           case 'b' -> {
               System.out.println("a. Revo");
               System.out.println("b. SupraX 125");
               System.out.println("c. GTR 150");
               System.out.println("d. Sonic 150R");
               System.out.println("e. CRF 150L");
               System.out.println("f. CBR 150R");
               System.out.print("Pilih Model: ");
               char model = scanner.next().charAt(0);
               
               switch (model){
                   case 'a' -> System.out.println("Harga Motor Revo Mulai dari Rp 16.020.000");
                   case 'b' -> System.out.println("Harga Motor Suprax 125 Mulai dari Rp 19,100,000");
                   case 'c' -> System.out.println("Harga Motor GTR 150 Mulai dari Rp 25,180.000");
                   case 'd' -> System.out.println( "Harga Motor Sonic 150R Mulai dari Rp 25,520.000");
                   case 'e' -> System.out.println("Harga Motor CRF 150L Mulai dari Rp 35,930.000");
                   case 'f' -> System.out.println("Harga Motor CBR 150R Mulai dari Rp 37,283.000");
                   default -> System.out.println("Inputan Tidak Valid");
               }
            }default -> System.out.println("Inputan Tidak Valid");
        }
    }
}