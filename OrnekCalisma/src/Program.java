import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        int sayilar[] = new int[25];

        //eleman sayisi belirtilmeli
        //bellekte elemanlari atamasak da yer ayriliyor
        //performans zayif
        //kod maliyeti yuksek


        ArrayList<String> liste = new ArrayList<>();
        liste.add("apple");
        liste.add("banana");
        liste.add("cucumber");

        System.out.println(liste);
        System.out.println("--------------------");
        System.out.println("Elements in ArrayList: ");
        for (String item : liste){
            System.out.println(item);
        }

        System.out.println("Index of apple: " + liste.indexOf("apple"));

        liste.set(2, "Grape");
        System.out.println("Updated list: ");
        for (String newItem : liste){
            System.out.println(newItem);
        }

    }
}
