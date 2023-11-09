package okulProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogrenci {

    static Scanner scan = new Scanner(System.in);
    static Map<String, String> ogrenciMap = new HashMap<>();

    public static void feykOgrenciEkle() {
        ogrenciMap.put("123456789411", "Ali, Can, 2008, 3569,12, A");
        ogrenciMap.put("123456789412", "Veli, Yan, 2008, 3559, 12, B");
        ogrenciMap.put("123456789413", "Ayse, Can, 2007, 4569, 12, A");
        ogrenciMap.put("123456789414", "Ali, San, 2009, 1569, 11, A");
        ogrenciMap.put("123456789415", "Alp, Yan, 2009, 3769, 11, A");

    }

    public static void ogrenciMenu() throws InterruptedException {

        String tercih = "";                                                //kullanicidan tercih almamiz lazim
        do {
            System.out.println("==========YILDIZ KOLEJI==========\n" +
                    "========== OGRENCI MENU ==========\n" +
                    "\n" +
                    "\t     1- Ogrenci listesi yazdir\n" +
                    "\t     2- Soyisimden ogrenci bulma\n" +
                    "\t     3- Bilgilerini girerek ogrenci ekleme\n" +
                    "\t     5- Kimlik no ile kayit silme\n" +
                    "\t     A- ANAMENU\n" +
                    "\t     Q- CIKIS\n");

            tercih = scan.nextLine();                                       //kullanicidan tercih almamiz lazim


            switch (tercih) {
                case "1":
                    ogreciListeYazdir();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "a":
                case "A":
                    Depo.anaMenu();
                    break;
                case "q":
                case "Q":
                    Depo.projeDurdur();
                    break;
                default:
                    System.out.println("Lutfen gecerli bir tercih giriniz");

            }
        } while (!tercih.equalsIgnoreCase("q"));                 // q Q basilmadigi surece bunu dondurmeye devam et
        Depo.projeDurdur();

    }

    private static void ogreciListeYazdir() {
        Set<Map.Entry<String, String>> myEntrySet = ogrenciMap.entrySet();

        System.out.println("========== OGRENCI LISTESI ==========\n" +
                "TC No          Isim      SoyIsim     D.Yili     Okul No     Sinif    Sube");

        for (Map.Entry<String, String> each : myEntrySet) {


            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String eachValueArr[] = eachValue.split(", ");  //aralarinda virgul olan bir Stringi arraye cevirmek icin en iyi yontem .split --> "," ile indexleri bolecek
            System.out.printf("%-12s  %-6s  %-9s  %-4s  %-4s %-2s %-2s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3], eachValueArr[4], eachValueArr[5]);
        }
    }
}
