package pkg100days;
public class day60 {
    public static void main(String[] args) {
        int[] array = {73,20,16,38};
        int jumlah = 0;

        for (int i = 0; i < array.length; i++) {
            jumlah = jumlah + array[i];
        }
         System.out.format("Masil penjumlahan %d",jumlah);
    }
    
}
