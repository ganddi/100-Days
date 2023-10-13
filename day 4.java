package perbandingan.dan.logika;
public class PerbandinganDanLogika {
    public static void main(String[] args) {
       int a, b;
        a = 10;
        b = 5;
        
        System.out.print("Apakah nilai a sama dengan nilai b? : ");
        System.out.println( a==b );
        System.out.print("Apakah nilai a tidak sama dengan nilai b? : ");
        System.out.println( a!=b );
        System.out.print("Apakah nilai a lebih dari nilai b? : ");
        System.out.println( a > b );
        System.out.print("Apakah nilai a kurang dari nilai b? : ");
        System.out.println( a < b );
        System.out.print("Apakah nilai a lebih atau sama dengan nilai b? : ");
        System.out.println( a >= b );
        System.out.print("Apakah nilai a kurang atau sama dengan nilai b? : ");
        System.out.println( a<=b );
        System.out.print("Apakah nilai a sama dengan nilai b atau nilai a kurang dari nilai b? : ");
        System.out.println( a==b || a>b );
        System.out.print("Apakah nilai a kurang atau sama dengan nilai b dan nilai a tidak sama dengan nilai b? : ");
        System.out.println( a<=b && a!=b );
    }
    
}
