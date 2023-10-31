package day.pkg24;
public class Day24 {
    public static void main(String[] args) {
    for (int i = 0; i <= 10; i++) {
        if (i == 8){
        break;
    }System.out.println(i);
  }
    System.out.println("-------------------------");
        for (int a = 20; a > 0; a--) {
            if (a >= 9 ){
                continue;
            }System.out.println(a);          
        }
    }
}