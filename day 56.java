package pkg100days;

import java.util.Scanner;

public class day56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan bulat: ");
        int bilangan = scan.nextInt();

        if (bilangan <= 1) {
            System.out.println("Bukan bilangan prima");
        } else {
            boolean prima = true;

            for (int i = 2; i <= Math.sqrt(bilangan); i++) {
                if (bilangan % i == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.println(bilangan + " adalah bilangan prima");
            } else {
                System.out.println(bilangan + " bukan bilangan prima");
            }
        }

        scan.close();
    }
}