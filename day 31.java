public class day31 {
    public static void main(String[] args) {
     /*	Buatlah program dengan bahasa java untuk menampilkan deret bilangan dari 1 s.d 100 dengan ketentuan sebagai berikut:
        a.Jika bilangan tersebut merupakan angka genap maka output yang ditampilkan adalah angka dari bilangan tersebut.
        b.Jika bilangan tersebut merupakan angka ganjil maka output yang ditampilkan adalah kata “ganjil”.
        c.Jika bilangan tersebut merupakan angka yang dapat dibagi 2 dan dapat dibagi 3 maka output yang ditampilkan adalah kata “INDONESIA”
     */
        for (int i = 1; i < 100; i++) {
            if(i % 2 == 0 && i % 3 == 0 ){
                System.out.println("INDONESIA");
            }else if(i % 2 == 1){
                System.out.println("ganjil");
            }else if(i % 2 == 0){
                System.out.println(i);
            }
            }
        }
     
    }
    

