import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int fizik;
        int matematik;
        int turkce;
        int kimya;
        int muzik;
        int tarih;

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = scan.nextInt();

        System.out.print("Matematik notunuzu giriniz: ");
        matematik = scan.nextInt();

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = scan.nextInt();

        System.out.print("Kimya notunuzu giriniz: : ");
        kimya = scan.nextInt();

        System.out.print("Muzik notunuzu giriniz: ");
        muzik = scan.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = scan.nextInt();

        double sonuc = (fizik + matematik + turkce + kimya + muzik + tarih ) / 6;

        System.out.println("Tum notlarin ortalamasi:" + sonuc);
    }
}
