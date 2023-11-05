public class day28 {
    public static void main(String[] args) {
      /*Tulislah program dengan menggunakan bahasa java untuk membuat tampilan konversi kg ke dalam pon dari 1 kg s.d 100 kg
        seperti di bawah ini:
        1 kg = 2 pon
        2 kg = 4 pon
        3 kg = 6 pon
        .
        .
        .
        100 kg = 200 pon
        *Gunakan konsep perulangan
        *1kg = 2 pon*/
      
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " kg = ");
            System.out.println((i * 2) + " pon");
        }
    }
}
