public class Day27 {
    public static void main(String[] args) {
   /* Buatlah program dengan bahasa java untukmenampilkan deret bilangan dari 1 s.d 100dengan ketentuan sebagai berikut:
        a. Jika bilangan tersebut merupakan angkagenap maka output yang ditampilkan adalah kata “java”.
        b. Jika bilangan tersebut merupakan angkaganjil maka output yang ditampilkanadalah angka dari bilangan tersebut.
        Contoh Output yang diharapkan: 1 java 3 java 5 java 7 java 9 java . . . 97 java 99 java   
    */     
   
    for (int i = 1; i <= 100; i++) {
       if (i % 2 == 0){
          System.out.print(" java ");
    }else{
          System.out.print(i);
      }
    }
  }
}


