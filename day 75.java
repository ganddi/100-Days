package pkg100days;
import java.util.Scanner;
public class day75 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] angka = new int[3][2];

            int tambah = 0;
            int kurang = 0;
            int kali = 0;

            for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
            
                if(i==0) {System.out.print("Masukkan pejumlah :");
                         angka[i][j] = scan.nextInt();
                         tambah = angka[0][0] + angka[0][1];}
               
                else if(i==1) {System.out.print("Masukkan pengurangan :");
                         angka[i][j] = scan.nextInt();
                         kurang = angka[1][0] - angka[1][1];}
               
                else if(i==2) {System.out.print("Masukkan perkalian :");
                         angka[i][j] = scan.nextInt();
                         kali = angka[2][0] * angka[2][1];}}
            
                System.out.println();}
                System.out.println("-------------------------");
                System.out.println("Hasil Penjumlahan: "+tambah);
                System.out.println("Hasil Pengurangan: "+kurang);
                System.out.println("Hasil Perkalian  : "+kali);
    }}
