import java.util.Scanner;

public class KitleIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Boy degerinizi metre olarak giriniz: ");
        double boy = scan.nextDouble();

        System.out.print("Kilo degerinizi kilogram olarak giriniz: ");
        double kilo = scan.nextDouble();

        double vki = kilo / (boy * boy);

        System.out.println("Vucut Kitle Indeksiniz: " + vki);

        if (vki < 18.5) {
            System.out.println("Zayif");
        } else if (vki >= 18.5 && vki < 25) {
            System.out.println("Ideal");
        } else if (vki >= 25 && vki < 30) {
            System.out.println("Sisman");
        } else if (vki >= 30 && vki < 35) {
            System.out.println("Obez");
        } else {
            System.out.println("Asiri Obez");
        }

    }
}

