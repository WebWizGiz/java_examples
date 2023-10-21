public class sartBloklari {
    public static void main(String[] args) {

        int not = 45;
        //50 ve uzeri   : Gecti
        //40-49         : Butunleme
        //0-39          : Kaldi

        if (not >= 55) {
            System.out.println("Gecti!!");
        } else if (not >= 40) {
            System.out.println("Butunleme");
        } else {
            System.out.println("Kaldi");
        }
    }
}
