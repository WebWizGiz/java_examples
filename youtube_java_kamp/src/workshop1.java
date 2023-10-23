public class workshop1 {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int aranacak = 44;

        boolean varMi = sayiBul(sayilar, aranacak);
        mesajVer(varMi, aranacak);

    }

    //MESAJ VERME ISLEMINI YAPAN FONKSIYON - METOT
    public static void mesajVer(boolean varMi, int aranacak){

        String mesaj = "";
        if (varMi){
            mesaj = "Sayi mevcuttur: " + aranacak;
            System.out.println(mesaj);
        }else {
            mesaj = "Sayi mevcut degildir: " + aranacak;
            System.out.println(mesaj);
        }
    }
    //SAYI BULMA ISLEMINI YAPAN BIR FONKSIYON - METOT
    public static boolean sayiBul(int[] sayilar, int aranacak){
        boolean varMi = false;

        for (int sayi : sayilar){
            if (sayi == aranacak){
                varMi = true;
                break;
            }
        }
        return varMi;

    }
}


//bir fonksiyon yaz  boolean dondur - sayiBul
//iki parametre alsin. P1 : dizi P2 : 3
//3 sayisi dizide vardir


