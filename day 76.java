package pkg100days;
public class day76 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int panjang = array1.length + array2.length;
        int[] arrayGabungan = new int[panjang];

        for (int i = 0; i < array1.length; i++){
            arrayGabungan[i] = array1[i];}
        for (int i = 0; i < array2.length; i++){
            arrayGabungan[array1.length + i] = array2[i];}
        System.out.print("Array Gabungan: ");
        for (int i = 0; i < arrayGabungan.length; i++){
            System.out.print(arrayGabungan[i] + " ");}
    }}