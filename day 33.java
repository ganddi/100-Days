package pkg100days;
public class day33 {
  /* Buatlah Program untuk menghitung 
    a. keleliling Segitiga
    b. luas segitiga
    */
    public static void main(String[] args) {
    int a, b, c, keliling;
    double luas, t;
     a = 10;
     b = 10;
     c = 10;
     t = Math.sqrt(Math.pow(a, 2)- Math.pow(b/2, 2));
     
    keliling = a + b + c;
        System.out.printf("keliling dari Segitiga %d %d %d adalah %d %n", a , b , c , keliling);
     
    luas = 0.5 * a * t;
        System.out.println("Luas dari Segitiga adalah " + luas);
    }
    
}
