package pkg100days;
public class day95 {
public static void main(String[] args) {
    String kalimat = "The Quick Brown Fox Jumps Over The Lazy Dog";
    
    String kecil = kalimat.toLowerCase();
    String besar = kalimat.toUpperCase();
    
    String hasil = kecil.concat(" & ").concat(besar);
    
    System.out.println(hasil);}}