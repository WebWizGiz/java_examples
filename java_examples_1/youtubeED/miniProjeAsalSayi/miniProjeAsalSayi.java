public class miniProjeAsalSayi {
    public static void main(String[] args) {

        // Verilen sayinin asal sayi olup olmadigini bulan programi yaz.

        int number = 25;
        int remainder = number % 2;

        boolean isPrime = true;

        if (number < 2){
            System.out.println("gecersiz sayi.");
        }
        if (number == 1){
            System.out.println("sayi asal degildir.");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println("sayi asaldir.");
        }else{
            System.out.println("sayi asal degildir.");
        }

    }
}
