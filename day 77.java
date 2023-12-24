package pkg100days;
import java.util.Scanner;
public class day 77 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] namaTeam = {"Red_Bull", "Mercedes", "Ferrari", "McLaren", "Aston Martin", "Alpine", "Williams", "Alpha Tauri", "Alfa Romeo", "Haas"};
        
        boolean i = true;
        while(i){ System.out.print("Masukkan Team F1(gunakan underscore \"_\" untuk spasi): ");
                  String team = scan.next();

                  for(String cari : namaTeam){
                  
                  if(cari.equalsIgnoreCase(team)){
                  System.out.println(cari + " ditemukan");
                  i = false;}}
                  if(i==true){
                  System.out.println("Tidak ditemuka.");}}
}}