package day.pkg10;
public class Day10 {
    public static void main(String[] args) {
       //int ke double
        int bilanganBulat = 3;
        double pecahan = bilanganBulat;
        System.out.println(pecahan);
        
        //double ke int
        double pecahan2 = 10.5;
        int bilanganBulat2 = (int) pecahan2;
        System.out.println(bilanganBulat2);
        
        //double ke float
        double double1 = 245.984;
        float float1 = (float) double1;
        System.out.println(float1);

        //int ke char (nilai Unicode)
        char myChar = '?';
        int myInt = (int) myChar;
        System.out.println(myInt);
    }
    
}
