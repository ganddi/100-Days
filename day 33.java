package pkg100days;
public class day33 {
  /* Buatlah Program untuk menghitung 
    a. keleliling Segitiga
    b. luas segitiga
    */
    public static void main(String[] args) {
     int a, b, c, t;
     a = 20;
     b = 16;
     c = 16;
     t = 14;
     
     int keliling = a + b + c;
        System.out.printf("keliling dari Segitiga %d %d %d adalah %d %n", a , b , c , keliling);
     
    double luas = 0.5 * a * t;
        System.out.println("Luas dari Segitiga adalah " + luas);
    }
    
}
