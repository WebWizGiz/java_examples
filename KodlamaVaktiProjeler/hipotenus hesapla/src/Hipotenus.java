import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //hipotenus bul
        System.out.print("Please enter 1.side: ");
        int firstSide = scan.nextInt();

        System.out.print("Please enter 2.side: ");
        int secondSide = scan.nextInt();

        double hipotenusCalculator = Math.sqrt((firstSide*firstSide) + (secondSide*secondSide));
        System.out.println("Hipotenus: " + (int)hipotenusCalculator);

        //alan bul

        double cevre = (firstSide + secondSide +hipotenusCalculator) / 2;
        double alan = cevre * (cevre-firstSide) * (cevre-secondSide) * (cevre-hipotenusCalculator);

        System.out.println("Ucgenin cevresi: " + (int)cevre);
        System.out.println("Ucgenin alani: " + (int)alan);



    }
}
