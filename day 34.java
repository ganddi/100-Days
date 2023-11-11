package pkg100days;

import java.util.Scanner;

public class day34 {

    /*Buatlah program untuk membantu (armada bus majene-makassar trans) dalam menghitung biaya tiket. 
    Adapun data yang perlu ditampung adalah adalah nama penumpang.jumlah tiket yang dipesan. 
    Output dari aplikasi sesuai data inputan, biaya Rp.180.000/tiket dan tambahan pajak 11% dari total biaya yang harus dibayarkan, 
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();
            System.out.print("Masukkan jumlah tiket yang di pesan : ");
        int tiket = sc.nextInt();
        int hargaTiket = tiket * 180000;
        double pajak = hargaTiket * 0.11;
        double total = hargaTiket + pajak;
            
        System.out.println("-----------------------------------------------");
        System.out.println("Nama Penumpang : " + nama);    
        System.out.println("Jumlah Tiket : " + tiket);    
        System.out.println("Total Harga yang harus di bayar : Rp." + total);  
        
        sc.close();
    }
}