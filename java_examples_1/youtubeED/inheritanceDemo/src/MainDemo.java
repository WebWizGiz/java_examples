public class MainDemo {
    public static void main(String[] args) {

       KrediUI krediUI = new KrediUI();
       krediUI.KrediHesapla(new OgretmenKrediManager());
       krediUI.KrediHesapla(new AskerKrediManager());
   //bu polimorfizm.
    }

}
