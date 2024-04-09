public class Main {
    public static void main(String[] args) {

        int sayi = 0;       //deger tipli degisken stack memoryde olusturur. sadece 1 degeri tutar

        //Ornek abc = null;   //referans tipli degisken.1den fazla degeri tutan nesneleri isaretler. heap memoryde deger arayacaktir yani nesneyi arayacaktir
                            //bu nesne icinde metotlar bulundurabilir degerler buludurabilir
                            // null oldugu icin heapte henuz hic bir seyi isaretlemedi. sadece stack uzerinde 1 nokta su an.

        //referans tipli degiskene nesne tanimlamak istiyorsam:
        Ornek abc = new Ornek();    //ornek tipinde bir abc referans noktasi olusturup yine Ornek tipindeki nesneyi isaretledim. nesne tipi referans tipiyle ayni olmak zorunda!!!!!!
                                    // nesneyi yaratip birakabilirim de isaretlemek zorunda degilim. or: new Ornek();



        //Ornek abc; //referans tipli bir degiskendir. tip 1 sinif olmalidir!! Ornek classi gibi

        /*Matematik matematik = new Matematik();
        int sonuc = matematik.topla(5, 8);  //bu topla metou nesnenin icinde calisir.
        System.out.println(sonuc);*/

        /*Matematik matematik = null;  //FAKAT ASLINDA nesne olmadan da metotlari gorebiliyoruz ama. burda oldugu gibi... AMA ISLEM YAPAMAYIZ NullPointerException alinir
        System.out.println(matematik.topla(5,8));
*/

        Matematik matematik1 = new Matematik();
        matematik1.topla(5,8);
        matematik1.topla(4,5.3,6.7);
        System.out.println("ne dondurecek bakalim: " + matematik1.bolme(6, 1));

        //metot isimleri ayni olabilir ama parametrelerle coklu yukleme (overload) yapabilirim
        //parametre sayilari ya da parametre tipleri farkli olmali. ya da en azindan parametre siralari farkli olmalidir.
    }


}
