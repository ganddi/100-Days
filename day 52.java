package pkg100days;

import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.println("Pilih jenis konversi suhu:");
            System.out.println("1. Celsius ke Fahrenheit");
            System.out.println("2. Fahrenheit ke Celsius");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scan.nextInt();

            switch (pilihan) {
                case 1:                  
                    
                    System.out.print("Masukkan suhu dalam Celsius: ");
                    double suhuCelsius = scan.nextDouble();
                    double suhuFahrenheit = (suhuCelsius * 9/5) + 32;
                    System.out.println("Hasil konversi: " + suhuCelsius + " Celsius = " + suhuFahrenheit + " Fahrenheit\n");
                    break;
                    
                case 2:
                    
                    System.out.print("Masukkan suhu dalam Fahrenheit: ");
                    double suhuFahrenheit2 = scan.nextDouble();
                    double suhuCelsius2 = (suhuFahrenheit2 - 32) * 5/9;
                    System.out.println("Hasil konversi: " + suhuFahrenheit2 + " Fahrenheit = " + suhuCelsius2 + " Celsius\n");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
         scan.close();
    }
}