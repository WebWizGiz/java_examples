import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Urunun fiyati ne kadar?: ");
        double fiyat = scan.nextDouble();


        if (fiyat<500){
            double kdv1 = 18;
            double kdvliFiyat = fiyat * kdv1/100;
            System.out.println("KDV'li fiyat: " + (fiyat + kdvliFiyat) + " KDV orani: " + (int)kdv1);
        }else {
            double kdv2 = 8;
            double kdvliFiyat = fiyat * kdv2/100;
            System.out.println("KDV'li fiyat: " + (fiyat + kdvliFiyat) + " KDV orani: " + (int)kdv2);
        }


    }
}
