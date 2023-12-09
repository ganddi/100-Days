package pkg100days;
public class day62 {
    public static void main(String[] args) {
        byte[] umur = {23,45,14,65,78,53,82,33};
        byte maks = 0;
        byte min = 127;
        for (int i = 0; i < umur.length; i++) {
         if(maks<=umur[i]){
            maks = umur[i];}
         if(min>=umur[i]){
             min = umur[i];}
        }System.out.println(maks);
    }
}