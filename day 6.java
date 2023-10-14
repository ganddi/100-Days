package day.pkg6;
public class Day6 {
    public static void main(String[] args) {
       
        // konversi string ke tipe data primitif
        String stringAngka = "1945";
        int angka = Integer.parseInt(stringAngka);
        double angkaPecahan = Double.parseDouble(stringAngka);
        boolean benar = Boolean.parseBoolean("true");
        
        // konversi tipe data primitif ke string
        int angka2 = 1998;
        String string2Angka = Integer.toString(angka2);
        
        double angka2Pecahan = 7.11;
        String stringAngkaPecahan = Double.toString(angka2Pecahan);

        char karakter = 'p';
        String stringKarakter = String.valueOf(karakter);

        System.out.println("String to Integer: " + angka);
        System.out.println("String to Double: " + angkaPecahan);
        System.out.println("String to Boolean: " + benar);
        
        System.out.println("Integer to String: " + string2Angka);
        System.out.println("Integer to String: " + stringAngkaPecahan);
        System.out.println("Integer to String: " + stringKarakter);
    }
}
