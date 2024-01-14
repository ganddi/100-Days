package pkg100days;
public class day98 {
    public static void main(String[] args) {
        StringBuffer day98 = new StringBuffer("Black Flag");
        System.out.println("Sebelum di hapus: "+ day98);
        
        day98.deleteCharAt(1);
        System.out.println("Sesudah di hapus: "+ day98);
        
        day98.reverse();
        String terbalik = day98.toString();
        System.out.println("Sudah di balik: " + day98);}}