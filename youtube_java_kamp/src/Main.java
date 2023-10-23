public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int arananSayi = 3;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == arananSayi){
                varMi = true;
                break;

            }
        }

        String mesaj = "";
        if (varMi){
            mesaj = "Sayi mevcuttur: " + arananSayi;
            mesajVer(mesaj);
        }else {
            mesajVer("Sayi mevcut degildir: " +arananSayi);
        }

    }
    public static void mesajVer(){
        System.out.println(mesaj);
    }
    public static boolean sayiBul(int[] sayilar, int arananSayi)



    }
//bir fonksiyon yaz  boolean dondur - sayiBul
//iki parametre alsin. P1 : dizi P2 : 3
//3 sayisi dizide vardir