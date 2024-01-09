package pkg100days;
import java.util.Scanner;
public class day93 {
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = scan.nextLine();
        int jumlahKata = hitungKata(kalimat);
        System.out.println("Jumlah kata dalam kalimat adalah: " + jumlahKata);}

 static int hitungKata(String kalimat) {
        int jumlahKata = 0;
        for (int i = 0; i < kalimat.length(); i++) {
            if (kalimat.charAt(i) != ' ' && (i == 0 || kalimat.charAt(i - 1) == ' ')) {
                jumlahKata++;}}
        return jumlahKata;}}