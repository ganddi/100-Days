package pkg100days;
public class day96 {
    public static void main(String[] args) {
        String jenis = "sony,canon,nikkon,fujifilm,kodak";
        String[] merek = jenis.split(",");

        System.out.println("jenis: " + jenis);
        System.out.println("merek:");
        for (String kamera : merek) {
            System.out.println(kamera);}}}