public class methods {
    public static void main(String[] args) {
     sayiBulmaca();
     sayiBulmaca();
     sayiBulmaca();

    }

    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 1;


        boolean varMi = false;

        for (int sayi : sayilar){
            if (sayi == aranacak){
                varMi = true;
                break;
            }
        }

        String mesaj = "";
        if (varMi){
            mesaj = "sayi mevcuttur: " + aranacak;
            mesajVer(mesaj);
        }else {
            mesajVer("sayi mevcut degildir:" + aranacak);
        }
    }

    public static void mesajVer(String mesaj){              //parametreli method
        System.out.println(mesaj);


    }




}
