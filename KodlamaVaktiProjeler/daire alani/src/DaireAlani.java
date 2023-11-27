import java.util.Map;
import java.util.Scanner;
public class DaireAlani {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Dairenin yaricapini giriniz: ");
        int yariCap = scan.nextInt();

        double alan = Math.PI * yariCap * yariCap;
        double cevre = 2 * Math.PI * yariCap;

        System.out.println("Dairenin alani: " + alan);
        System.out.println("Dairenin cevresi: " + cevre);


        //Bonus Daire Diliminin Alani: (PI*(r*r))*a / 360

        System.out.println("Hesaplamak istediginiz daire diliminin merkez acisi nedir: ");
        int a = scan.nextInt();

        double daireDilimiAlani = Math.PI * yariCap * yariCap * a / 360;

        System.out.println("Daire diliminin alani: " + daireDilimiAlani);
    }
}
