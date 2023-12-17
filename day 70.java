package pkg100days;

import java.util.Scanner;

public class day70 {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        float r1,r2,rTot,vR1,vR2,iR1,iR2;
        int vin = 9;
        System.out.print("Masukkan R1: ");
        r1 = scan.nextInt();
        System.out.print("Masukkan R2: ");
        r2 = scan.nextInt();
        rTot = 1/((1/r1) + (1/r2));
        vR1 = vin;
        vR2 = vin;
        iR1 = vin/r1;
        iR2 = vin/r2;
        System.out.printf("Rtot = 1/%f + 1/%f\n    =%f\n",r1,r2,rTot);
        System.out.printf("VR1 = %d \n    =%f\n",vin,vR1);
        System.out.printf("VR2 = %d \n    =%f\n",vin,vR2);
        System.out.printf("IR1 = %d / %f\n    =%f\n",vin,r1,iR1);
        System.out.printf("IR2 = %d / %f\n    =%f\n",vin,r2,iR2);
    }
    
}
