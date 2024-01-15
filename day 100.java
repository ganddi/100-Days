package pkg100days;
import java.util.LinkedList;
public class day100 {
     public static void main(String[] args) {
        LinkedList<String> ligaInggris = new LinkedList<>();
        
        ligaInggris.add("Liverpool");
        ligaInggris.add("Arsenal");
        ligaInggris.add("Manchaster united");
        System.out.println("LinkedList: " + ligaInggris);
       
        ligaInggris.addFirst("Manchester city");
        ligaInggris.addLast("Chelsea");
        System.out.println("Update LinkedList: " + ligaInggris);
      
        ligaInggris.remove("Manchaster united");
        System.out.println("Final LinkedList: " + ligaInggris);}}