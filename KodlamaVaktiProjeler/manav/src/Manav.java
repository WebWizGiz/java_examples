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
        System.out.println(cucumberKg + " kg cucumber " + cucumberKg * cucumber + " TL");

        System.out.print("Kac kilo apple?: ");
        double appleKg = scan.nextDouble();
        System.out.println(appleKg + " kg apple " + appleKg * apple + " TL");

        System.out.print("Kac kilo zuccini?: ");
        double zucciniKg = scan.nextDouble();
        System.out.println(zucciniKg + " kg zuccini " + zucciniKg * zuccini + " TL");

        System.out.print("Kac kilo tometo?: ");
        double tometoKg = scan.nextDouble();
        System.out.println(tometoKg + " kg tometo " + tometoKg * tometo + " TL");

        System.out.print("Kac kilo eggplant?: ");
        double eggplantKg = scan.nextDouble();
        System.out.println(eggplantKg + " kg eggplant " + eggplantKg * eggplant + " TL");

        double total = 0.0;
        total += (cucumberKg * cucumber);
        total += (appleKg * apple);
        total += (zucciniKg * zuccini);
        total += (tometoKg * tometo);
        total += (eggplantKg * eggplant);

        System.out.println("Toplam tutar: " + total + " TL");

    }
}
