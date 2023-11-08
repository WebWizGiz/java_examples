package okulProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ogretmen {

    static Scanner scan = new Scanner(System.in);
    static Map<String, String> ogretmenlerMap = new  HashMap<>();

    public static void feykOgretmenEkle(){
        ogretmenlerMap.put("123456789411", "Ali, Can, 1980, Matematik");
        ogretmenlerMap.put("123456789412", "Veli, Yan, 1981, Fizik");
        ogretmenlerMap.put("123456789413", "Ayse, Can, 1982, Kimya");
        ogretmenlerMap.put("123456789414", "Ali, San, 1983, Kimya");
        ogretmenlerMap.put("123456789415", "Alp, Yan, 1984, Matematik");

        
    }

    public static void ogretmenMenu() {

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

        switch (tercih){
            case "1" :
                break;
            case "2" :
                break;
            case "3" :
                break;
            case "4" :
                break;
            case "1" :
                break;
            default:
                System.out.println("Lutfen gecerli tercih yapiniz");

        }

        }while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();


    }
}
