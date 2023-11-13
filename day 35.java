package ays;

public class day35 {
    
    public static void main(String[] args){ 
        /*buatlah program dengan menggunakan perulangan for atau while yang
          bilangan angka genap dari 1 sampai 100 yang habis di bagi 4
        */
        
        int i = 1;
        while (i <= 100){
            if (i % 4 ==0){
                System.out.println(i);
            }i++;
        }
    }
    
}