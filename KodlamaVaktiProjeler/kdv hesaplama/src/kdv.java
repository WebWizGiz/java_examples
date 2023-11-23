import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Urunun fiyati ne kadar?: ");
        double fiyat = scan.nextDouble();

        double rate = 18;

        double kdvliFiyat = fiyat * rate/100;
        System.out.println("KDV'li fiyat: " + (fiyat + kdvliFiyat));
    }
}
