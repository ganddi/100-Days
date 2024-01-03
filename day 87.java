package pkg100days;
public class day87 {
    public static void main(String[] args) {
        int angka = 17; 
        boolean prima = prima(angka);
        if (prima) {System.out.println(angka + " adalah angka prima.");} 
        else {System.out.println(angka + " bukan angka prima.");}}

    static boolean prima(int angka) {
        for (int i = 2; i < Math.sqrt(angka) + 1; i++) 
        {if (angka % i == 0) {return false;}}
        return true;}}