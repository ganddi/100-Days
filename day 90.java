package pkg100days;
import java.util.Scanner;
public class day90 {
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.print("Masukkan Angka");
  int angka = scan.nextInt();
  int hasil = faktorial(angka);
  System.out.println("Nilai faktorial "+angka+" adalah "+hasil);}

static int faktorial(int i){
  if(i==1){return 1;}
  else{return (i*faktorial(i-1));}}}
