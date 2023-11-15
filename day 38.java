package pkg100days;
public class day38 {
    public static void main(String[] args) {
int z = 5;
  for (int i = 0; i < z; i++) {
    for (int j = 0; j < z ; j++) {
      if (i == 0 || i == z - 1 || j == z - i - 1) {
         System.out.print(" *" );
     } else {
         System.out.print("  "); 
     }
  }      System.out.println(); 
        }
    }
}