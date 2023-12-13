package pkg100days;
public class day66 {
    public static void main(String[] args) {
        char[][] array2d = {
            {'i','U','W'},
            {'4','1','8'},
            {'?','@','&'}
        };
        String[] kategori = {"Kategori huruf","kategori angka","kategori simbol"};
        int k = 0;
        
        for (char[] i: array2d) {
                System.out.print(kategori[k]+": ");
            for (char j : i) {
                System.out.print(j); 
            }k++;
        System.out.println();
        }        
        
    }
    
}
