package pkg100days;
public class day39 {
    public static void main(String[] args) {
        int z = 5;
        for (int i = 1; i <= z ; i++) {
            for (int j = 1; j <= z; j++) {
               if( i + j == z + 1 ){
                   System.out.print(" *" + j);
               }else{
                   System.out.print("  ");
               }
            }System.out.println();
        }
    } 
}