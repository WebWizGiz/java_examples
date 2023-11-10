package okulProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogrenci {

    static Scanner scan = new Scanner(System.in);
    static Map<String, String> ogrenciMap = new HashMap<>();

    public static void feykOgrenciEkle() {
        ogrenciMap.put("123456789411", "Ali, Can, 2008, 3569, 12, A");
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
                    "\t     3- Sinif ve Sube ile ogrenci bulma\n" +
                    "\t     4- Bilgilerini girerek ogrenci ekleme\n" +
                    "\t     5- Kimlik no ile kayit silme\n" +
                    "\t     A- ANAMENU\n" +
                    "\t     Q- CIKIS\n");

            tercih = scan.nextLine();                                       //kullanicidan tercih almamiz lazim


            switch (tercih) {
                case "1":
                    ogreciListeYazdir();
                    break;
                case "2":
                    soyisimdenOgrenciBulma();
                    break;
                case "3":       // Sinif ve Sube ile ogrenci bulma
                    sinifVeSubeIleOgrenciBulma();
                    break;
                case "4":       //Bilgilerini girerek ogrenci ekleme
                    ogrenciEkle();
                    break;
                case "5":       //KimlikNo ile silme
                    tcNoIleOgrenciSilme();
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

    private static void tcNoIleOgrenciSilme() throws InterruptedException {
        System.out.println("Silinecek ogrenci kimlik no giriniz: ");
        String silinecekOgrenci = scan.nextLine();

        String silinecekValue = ogrenciMap.get(silinecekOgrenci);

        String sonucValue = ogrenciMap.remove(silinecekOgrenci);

        try {
            boolean sonuc = sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("Istediginiz TC no ile ogrenci bulunamadi");
        }
    }

    private static void ogrenciEkle() {

        System.out.println("TC No: ");
        String tcNo = scan.nextLine();
        System.out.println("Isim: ");
        String isim = scan.nextLine();
        System.out.println("Soyisim: ");
        String soyIsim = scan.nextLine();
        System.out.println("Dogum Yili: ");
        String dogumYili = scan.nextLine();
        System.out.println("Okl No: ");
        String okulNo = scan.nextLine();
        System.out.println("Sinif: ");
        String sinif = scan.nextLine();
        System.out.println("Sube: ");
        String sube = scan.nextLine();

        //kullanicidan aldigim bilgileri ogrenciMap'e ekliyorum
        String key = tcNo;
        String value = isim + ", " + soyIsim + ", " + dogumYili + ", " + okulNo + ", " + sinif + ", " + sube;
        ogrenciMap.put(key, value);

    }

    private static void sinifVeSubeIleOgrenciBulma() throws InterruptedException {
        Set<Map.Entry<String, String>> myEntrySet = ogrenciMap.entrySet();

        System.out.println("Istediginiz ogrenci SINIFINI yaziniz");
        String istenilenSinif = scan.nextLine();
        System.out.println("Istediginiz ogrenci SUBESINI yaziniz");
        String istenilenSube = scan.nextLine();

        System.out.println("========== OGRENCI LISTESI ==========\n" +
                "TC No        Isim     SoyIsim   D.Yili    Okul No    Sinif   Sube");

        for (Map.Entry<String, String> each : myEntrySet) {

            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String eachValueArr[] = eachValue.split(", ");  //aralarinda virgul olan bir Stringi arraye cevirmek icin en iyi yontem .split --> "," ile indexleri bolecek


            if (istenilenSinif.equalsIgnoreCase(eachValueArr[4]) && istenilenSube.equalsIgnoreCase(eachValueArr[5])) {
                System.out.printf("%-12s  %-6s  %-9s  %-9s  %-9s %-7s %-7s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3], eachValueArr[4], eachValueArr[5]);
            }
        }
        Thread.sleep(5000);

    }

    private static void soyisimdenOgrenciBulma() throws InterruptedException {
        Set<Map.Entry<String, String>> myEntrySet = ogrenciMap.entrySet();

        System.out.println("Istediginiz ogrenci soyismini yaziniz");
        String istenilenSoyisim = scan.nextLine();

        System.out.println("========== OGRENCI LISTESI ==========\n" +
                "TC No        Isim     SoyIsim   D.Yili    Okul No    Sinif   Sube");

        for (Map.Entry<String, String> each : myEntrySet) {

            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String eachValueArr[] = eachValue.split(", ");  //aralarinda virgul olan bir Stringi arraye cevirmek icin en iyi yontem .split --> "," ile indexleri bolecek


            if (istenilenSoyisim.equalsIgnoreCase(eachValueArr[1])) {
                System.out.printf("%-12s  %-6s  %-9s  %-9s  %-9s %-7s %-7s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3], eachValueArr[4], eachValueArr[5]);
            }
        }
        Thread.sleep(5000);

    }

    private static void ogreciListeYazdir() throws InterruptedException {
        Set<Map.Entry<String, String>> myEntrySet = ogrenciMap.entrySet();

        System.out.println("========== OGRENCI LISTESI ==========\n" +
                "TC No        Isim     SoyIsim   D.Yili    Okul No    Sinif   Sube");

        for (Map.Entry<String, String> each : myEntrySet) {


            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String eachValueArr[] = eachValue.split(", ");  //aralarinda virgul olan bir Stringi arraye cevirmek icin en iyi yontem .split --> "," ile indexleri bolecek
            System.out.printf("%-12s  %-6s  %-9s  %-9s  %-9s %-7s %-7s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3], eachValueArr[4], eachValueArr[5]);
        }
        Thread.sleep(5000);
    }
}




