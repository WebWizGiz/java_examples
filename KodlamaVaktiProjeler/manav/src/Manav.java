import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double cucumber = 3.14;
        double apple = 4.11;
        double zuccini = 2.22;
        double tometo = 0.95;
        double eggplant = 7.00;


        System.out.print("Kac kilo cucumber?: ");
        double cucumberKg = scan.nextDouble();
        System.out.print(cucumberKg + " kg cucumber " + cucumberKg*cucumber + " TL");

        System.out.println("Kac kilo apple?: ");
        double appleKg = scan.nextDouble();
        System.out.println(appleKg + " kg apple " + appleKg*apple + " TL");

        System.out.println("Kac kilo zuccini?: ");
        double zucciniKg = scan.nextDouble();
        System.out.println(zucciniKg + " kg zuccini " + zucciniKg*zuccini + " TL");

        System.out.println("Kac kilo tometo?: ");
        double tometoKg = scan.nextDouble();
        System.out.println(tometoKg + " kg tometo " + tometoKg*tometo + " TL");

        System.out.println("Kac kilo eggplant?: ");
        double eggplantKg = scan.nextDouble();
        System.out.println(eggplantKg + " kg eggplant " + eggplantKg*eggplant + " TL");

    }
}
