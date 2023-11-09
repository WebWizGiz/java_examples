package okulProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {

    static Scanner scan = new Scanner(System.in);
    static Map<String, String> ogretmenlerMap = new HashMap<>();

    public static void feykOgretmenEkle() {
        ogretmenlerMap.put("123456789411", "Ali, Can, 1980, Matematik");
        ogretmenlerMap.put("123456789412", "Veli, Yan, 1981, Fizik");
        ogretmenlerMap.put("123456789413", "Ayse, Can, 1982, Kimya");
        ogretmenlerMap.put("123456789414", "Ali, San, 1983, Kimya");
        ogretmenlerMap.put("123456789415", "Alp, Yan, 1984, Matematik");


    }

    public static void ogretmenMenu() throws InterruptedException {

        String tercih = "";
        do {
            System.out.println("==========YILDIZ KOLEJI==========\n" +
                    "========== OGRETMENLER MENU ==========\n" +
                    "\n" +
                    "\t     1- Ogretmenler listesi yazdir\n" +
                    "\t     2- Soyisimden ogretmen bulma\n" +
                    "\t     3- Branstan ogretmen bulma\n" +
                    "\t     4- Bilgilerini girerek ogretmen ekleme\n" +
                    "\t     5- Kimlik no ile kayit silme\n" +
                    "\t     A- ANAMENU\n" +
                    "\t     Q- CIKIS\n");

            tercih = scan.nextLine();

            switch (tercih) {
                case "1":      //ogretmen listesi yazdir
                    ogretmenListesiYazdir();
                    break;
                case "2":       //soyisimden ogretmen bulmak
                    soyisimdenOgretmenBulma();
                    break;
                case "3":       //branstan ogretmen bulma
                    branstanOgretmenBulma();
                    break;
                case "4":       //bilgilerini girerek ogretmen ekleme
                    ogretmenEkleme();
                    break;
                case "5":       //kimlik No ile kayit silme
                    System.out.println("Silinecek ogretmen kimlik no giriniz: ");
                    String silinecekOgretmen = scan.nextLine();

                    String silinecekValue = ogretmenlerMap.get(silinecekOgretmen);

                    String sonucValue = ogretmenlerMap.remove(silinecekOgretmen);

                    try {
                        boolean sonuc = sonucValue.equals(silinecekValue);
                    } catch (Exception e) {
                        System.out.println("Istediginiz TC no ile ogretmen bulunamadi");
                    }

                    break;
                case "A":
                case "a":
                    Depo.anaMenu();
                    break;
                case "Q":
                case "q":
                default:
                    System.out.println("Lutfen gecerli tercih yapiniz");

            }

        } while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();


    }

    public static void ogretmenEkleme() {
        System.out.println("TC No: ");
        String tcNo = scan.nextLine();
        System.out.println("Isim: ");
        String isim = scan.nextLine();
        System.out.println("Soyisim: ");
        String soyisim = scan.nextLine();
        System.out.println("Dogum Yili: ");
        String dogumYili = scan.nextLine();
        System.out.println("Brans: ");
        String brans = scan.nextLine();

        String eklenecekValue = isim + ", " + soyisim + ", " + dogumYili + ", " + brans;
        ogretmenlerMap.put(tcNo, eklenecekValue);

    }

    public static void branstanOgretmenBulma() throws InterruptedException {
        System.out.println("Aradiginiz ogretmenin bransini giriniz: ");
        String istenenSoyisim = scan.nextLine();

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();

        System.out.println("==========YILDIZ KOLEJI==========\n" +
                "====== BRANS ILE OGRETMEN ARAMA ======\n" +
                "TC No           Isim    Soyisim    D.Yili    Brans");

        for (Map.Entry<String, String> each : ogretmenEntrySet) {
            String aechKey = each.getKey();
            String eachValue = each.getValue();

            String eachValuearr[] = eachValue.split(", ");
            if (istenenSoyisim.equalsIgnoreCase(eachValuearr[3])) {
                System.out.printf("%11s %-6s  %-8s %4s     %s \n", aechKey, eachValuearr[0], eachValuearr[1], eachValuearr[2], eachValuearr[3]);
            }
        }
        Thread.sleep(5000);

    }

    public static void soyisimdenOgretmenBulma() throws InterruptedException {
        System.out.println("Aradiginiz ogretmenin soyismini giriniz: ");
        String istenenSoyisim = scan.nextLine();

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();

        System.out.println("==========YILDIZ KOLEJI==========\n" +
                "====== SOYISIM ILE OGRETMEN ARAMA ======\n" +
                "TC No           Isim    Soyisim    D.Yili    Brans");

        for (Map.Entry<String, String> each : ogretmenEntrySet) {
            String aechKey = each.getKey();
            String eachValue = each.getValue();

            String eachValuearr[] = eachValue.split(", ");
            if (istenenSoyisim.equalsIgnoreCase(eachValuearr[1])) {
                System.out.printf("%11s %-6s  %-8s %4s     %s \n", aechKey, eachValuearr[0], eachValuearr[1], eachValuearr[2], eachValuearr[3]);
            }
        }
        Thread.sleep(5000);

    }

    public static void ogretmenListesiYazdir() throws InterruptedException {
        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();

        System.out.println("==========YILDIZ KOLEJI==========\n" +
                "========== OGRETMENLER MENU ==========\n" +
                "TC No           Isim    Soyisim    D.Yili    Brans");

        for (Map.Entry<String, String> each : ogretmenEntrySet) {
            String aechKey = each.getKey();
            String eachValue = each.getValue();

            String eachValuearr[] = eachValue.split(", ");
            System.out.printf("%11s %-6s  %-8s %4s     %s \n", aechKey, eachValuearr[0], eachValuearr[1], eachValuearr[2], eachValuearr[3]);
        }
        Thread.sleep(5000);

    }
}
