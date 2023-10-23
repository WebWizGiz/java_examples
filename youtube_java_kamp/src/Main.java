public class Main {
    public static void main(String[] args) {

       for (int i = 0; i<4; i++){
           mesajVer("mahmut");
       }

       mesajVer("gizem");
       mesajVer("gokhan");


        hesapla();
        hesapla();

        System.out.println(topla(6,3));
        System.out.println(toplananIkiSayininYuzdeOnu(10,90));
        topla(6,98);
        topla(6,5);


// DRY Do Not Repeat Yourself

    }


    public static void mesajVer(String isim) {
        System.out.println("Merhaba "+ isim);

    }

    public static void hesapla() {
        System.out.println("Hesaplandi");
    }

    public static int topla(int sayi1, int sayi2){
        int toplam = sayi1 + sayi2;
        return toplam;



    }
    //toplanan iki sayinin %10unu bul
    public static double toplananIkiSayininYuzdeOnu(int sayi1, int sayi2) {
        int toplam = topla(sayi1, sayi2);
        double sonuc = toplam * 10 / 100;
        return sonuc;
    }

    public static double krediHesapla(double krediMiktari){
    //hesaplamalar yapilir
    return 125000;
    }

}