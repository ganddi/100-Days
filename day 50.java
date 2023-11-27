package pkg100days;
public class day50 {
    public static void main(String[] args) {
        int[] array = new int[25]; 
        int index = 0; 
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println("Angka ganjil: " + i);
            }
            else {
                array[index] = i;
                index++;
            }
        }
        System.out.println("Angka genap yang dimasukkan ke dalam array:");
        for (int evenNumber : array) {
            System.out.print(evenNumber + " ");
        }
    }
}
