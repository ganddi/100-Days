package pkg100days;
public class day92 {
    public static void main(String[] args) {
        int[] nilai = {96,10,59,23,66,73,33,82,84,16};
        int nilaiTertinggi = cariNilaiTertinggi(nilai);
        System.out.println("Nilai tertinggi dalam array adalah: " + nilaiTertinggi);}

    static int cariNilaiTertinggi(int[] nilai) {
        int nilaiTertinggi = 0;
        for (int i = 0; i < nilai.length; i++){
        if (nilai[i] > nilaiTertinggi){
        nilaiTertinggi = nilai[i];}}
        return nilaiTertinggi;}}