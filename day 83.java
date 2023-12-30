package pkg100days;
public class day83 {
static void cekUmur(int umur) {
    if (umur < 18) {System.out.println("Anda belum memenuhi syarat menjadi pemilih pemilu");}
    else {System.out.println("Anda sudah memenuhi syarat menjadi pemilih pemilu");}}

  public static void main(String[] args) {
    cekUmur(20);
    cekUmur(54);
    cekUmur(15);}}