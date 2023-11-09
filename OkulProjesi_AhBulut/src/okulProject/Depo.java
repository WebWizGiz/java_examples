package okulProject;

import java.util.Scanner;
import java.nio.channels.ScatteringByteChannel;

public class Depo {                     //tum metotlari Depo classinda olusturmak istiyorum

    static Scanner scan = new Scanner(System.in);      //kullanicidan veri almak icin Scanner objesini olusturuyorum

    public static void anaMenu() throws InterruptedException {

        String tercih = "";
        do {
            System.out.println("==========YILDIZ KOLEJI==========\n" +
                    "========== ANA MENU ==========\n" +
                    "\n" +
                    "\t     1- Okul Bilgileri Goruntule\n" +
                    "\t     2- Ogretmen Menu\n" +
                    "\t     3- Ogrenci Menu\n" +
                    "\t     Q- CIKIS\n");

            System.out.println("Lutfen menuden tercihinizi yapiniz: ");
            tercih = scan.nextLine();

            switch (tercih) {
                case "1":  //okul bilgileri icin ayri bir classa ihtiyacim olacak
                    Depo.okulBilgileriniYazdir();
                    break;
                case "2":  //ogretmen menu buraya gelmeli
                    Ogretmen.ogretmenMenu();
                    break;
                case "3":  //ogrenci menu buraya gelmeli
                    Ogrenci.ogrenciMenu();
                    break;
                case "q":
                case "Q":
                    break;
                default:
                    System.out.println("Lutfen gecerli bir tercih giriniz.");
            }

        } while (!tercih.equalsIgnoreCase("q"));

        Depo.projeDurdur();


    }

    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("==========YILDIZ KOLEJI==========\n" +
                "\t\t Adres : " + Okul.adres + "\n" +
                "\t\t Telefon : " + Okul.telefon + "\n");
        Thread.sleep(5000);  // code bekletmek istediginde kullan ici milisaniye


    }

    public static void projeDurdur() {
        System.out.println("Okul projesinden ciktiniz.");
        System.exit(0); //bunu yazinca sstem tamamen durmus oluyor.
    }


}
