package pkg100days;
import java.util.Scanner;
public class day86 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = scan.nextInt();
        cekangka(angka);}
    
    static void cekangka(int ang){
             if(ang > 0 && ang %2==1){System.out.println("Angka Positif dan ganjil");}
        else if(ang > 0 && ang %2==0){System.out.println("Angka Positif dan genap");}
        else if(ang < 0 && ang %2!=0){System.out.println("Angka negatif dan ganjil");}
        else if(ang < 0 && ang %2==0){System.out.println("Angka negatif dan genap");}
        else{System.out.println("Angka nol");}}}
 
