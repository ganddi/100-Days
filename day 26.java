package pkg100days;
public class Day26 {
    public static void main(String[] args) {
        int n = 10; 

        for (int i = 2; i <= n; i+=2) {
            for (int j = 2; j <= i; j+=2) {
                System.out.print(j); 
            }
            System.out.println();
        }
    }
}        
  

