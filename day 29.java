public class day29 {
    public static void main(String[] args) {
/* Tulislah program dengan bahasa java untukmenampilkan output seperti dibawah ini:
    5 4 3 2 1
     4 3 2 1
      3 2 1
       2 1
        1
*/

  for (int i = 5; i >= 1; i--){
    for (int j = i; j >= 1; j--) {
          System.out.print(j + " ");            
  }
          System.out.println();
    for (int k = 5; k >= i; k--) {
             System.out.print(" ");
            }
        }          
    }
 }
    

