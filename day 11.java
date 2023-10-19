package day.pkg11;

public class Day11 {
    public static void main(String[] args) {
        int hari = 6;

        switch (hari) {
            case 1:
                System.out.println("Minggu");
                break;
            case 2:
                System.out.println("Senin");
                break;
            case 3:
                System.out.println("Selasa");
                break;
            case 4:
                System.out.println("Rabu");
                break;
            case 5:
                System.out.println("Kamis");
                break;
            case 6:
                System.out.println("Jumat");
                break;
            case 7:
                System.out.println("Sabtu");
                break;
            default:
                System.out.println("Hari tidak valid");
        }
    }
}
