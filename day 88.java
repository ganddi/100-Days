package pkg100days;
import java.util.Scanner;
public class day88 {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat (1-5000): ");
        int bilangan = scan.nextInt();

        if (bilangan < 1 || bilangan > 5000) 
           {System.out.println("Bilangan harus berada di antara 1 sampai 5000");}
        else {System.out.println("Hasil konversi: " + bilanganKeRomawi(bilangan));}}

   static String bilanganKeRomawi(int bilangan) {
        String romawi = "";
        int[] angka = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < angka.length; i++) {
        while (bilangan >= angka[i]) {
               bilangan -= angka[i];
               romawi += simbol[i];}}
        return romawi;}}