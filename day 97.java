package pkg100days;

import java.util.Scanner;

public class day97 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan merek motor: ");
        String merekMotor = scan.next();
        System.out.print("Masukkan tipe: ");
        String tipeMotor = scan.next();
        System.out.print("Masukkan tenaga mesin: ");
        int tenagaMesin = scan.nextInt();
        System.out.print("Masukkan tahun keluaran: ");
        int tahunKeluaran = scan.nextInt();
        
        String sudahformat = String.format
        ("Merek : %s ,Tipe : %s ,tenaga : %d cc ,tahun : %d" 
          ,merekMotor,tipeMotor,tenagaMesin,tahunKeluaran);
        String[] hasil = sudahformat.split(",");
        
        for (String i : hasil) {
        System.out.println(i);}}}