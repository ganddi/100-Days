package pkg100days;

import java.util.Scanner;

public class day36 {
    /*  Buat program untuk menentukan gaji seorang karyawan berdasarkan waktu/jamkerjanya,
    dengan aturan bahwa batasan jam kerja normal adalah 50 sampai 60 jam/minggu dengan upah Rp.5000/jam.
    Jika lebih dari batas tersebut, maka kelebihan perjamnya dibayar Rp 7500/jam.
    Tetapi jika jam kerjanya kurang dari 50 jam/minggu,maka dikenakan potongan Rp.2500/jam nya.
    (Input : jam kerja/minggu, dan output : totalgaji)
    */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Total jam kerja selama 1 minggu : ");
    int jamKerja = sc.nextInt();
        if (jamKerja >= 50 && jamKerja <= 60) {
            int upahPerJam = 5000;
            int totalGaji = jamKerja * upahPerJam;
              System.out.printf("Total gaji dari %d jam kerja perminggunya adalah Rp.%d" ,jamKerja , totalGaji);  
        }
        if (jamKerja > 60) {
            int upahPerJam = 7500;
            int totalGaji = jamKerja * upahPerJam;
              System.out.printf("Total gaji dari %d jam kerja perminggunya adalah Rp.%d" ,jamKerja , totalGaji);  
        }else{
            int upahPerJam = 2500;
            int totalGaji = jamKerja * upahPerJam;
              System.out.printf("Total gaji dari %d jam kerja perminggunya adalah Rp.%d" ,jamKerja , totalGaji);  
        }
    }
}