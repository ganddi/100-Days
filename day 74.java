package pkg100days;
public class day74 {
    public static void main(String[] args) {
        int[][] nilai = {
                        {67,83,79},
                        {64,74,98},
                        {117,107,61}};
       
        for (int i = 0; i < nilai.length; i++) {
        int jumlah = 0;
          
        for (int j = 0; j < nilai[i].length; j++) {
                jumlah += nilai[i][j];}
            
        int rataRata = jumlah / nilai[i].length;
        System.out.println("Nilai rata rata pada baris " + (i+1)+": "+rataRata );
}}}