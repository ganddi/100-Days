package pkg100days;

import java.util.Scanner;

public class day68 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        float  r1,r2,rTotal,vR1,vR2,iR1,iR2;
        int vin = 9;
        System.out.print("Masukkan R1: ");
        r1 = scan.nextInt();
        System.out.print("Masukkan R2: ");
        r2 = scan.nextInt();
        rTotal = r1 + r2;
        vR1 = r1/rTotal*vin;
        vR2 = r2/rTotal*vin;
        iR1 = vin/rTotal;
        iR2 = vin/rTotal;
        System.out.printf("Rtotal = %f + %f\n    =%f\n",r1,r2,rTotal);
        System.out.printf("VR1 = %f / %f * %d\n    =%f\n",r1,rTotal,vin,vR1);
        System.out.printf("VR2 = %f / %f * %d\n    =%f\n",r2,rTotal,vin,vR2);
        System.out.printf("IR1 = %d / %f\n    =%f\n",vin,rTotal,iR1);
        System.out.printf("IR2 = %d / %f\n    =%f\n",vin,rTotal,iR2);

    }
    
}
