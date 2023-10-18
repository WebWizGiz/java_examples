public class sesliHarfler {
    public static void main(String[] args){

        char harf = 'A';

       /* if (harf == 'A') {
            System.out.println(harf + " kalin sesli bir harftir.");
        } else if (harf == 'E') {
            System.out.println(harf + " ince sesli bir harftir.");
        }*/

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalin sesli harf.");
                break;
            default:
                System.out.println("Ince sesli harf.");
        }
    }
}
