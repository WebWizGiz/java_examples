package okulProject;

public class Okul {
    static final String okulIsmi = "Yildiz Koleji";  //static oldugu icin bu bilgiye tum lasslardan ulasirlar ama final oldugu icin degistirmek istediklerinde degistiremezler
    static final String adres = "Cankaya / Ankara";
    static final String telefon = "0312451255";

    private Okul() {     //okul classindan obje olusturulamasin diye bunu yazdik. private yaptik bu class icinde obje olusturabiliriz ama baska classtan okul icin obje olusturamayiz.
        //okul constructorimizi private yaparsak buna baska classtan obje olusturamazlar Okul okul = nem Okul(); -->obje olusturmak
    }

}
