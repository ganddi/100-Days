package pkg100days;
public class day99 {
     public static void main(String[] args) {
        String kata = "kasur ini rusak";
        StringBuilder palindrome = new StringBuilder(kata);
 
        palindrome.reverse();
        String reversedString = palindrome.toString();
        
        boolean hasil = kata.equalsIgnoreCase(reversedString);
        if (hasil) {
            System.out.println(palindrome + " adalah kata palindrome.");
        } else {
            System.out.println(palindrome + " adalah kata tidak palindrome");}}}
