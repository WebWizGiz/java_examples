public class recapDemo2 {
    public static void main(String[] args) {
        //double[] myList = new double[2];   ile birebir ayni
        double[] myList = {1.2, 1.3, 4.3, 7.6};

        double total = 0;
        double enBuyuk = myList[0];

        for (double number : myList) {
            if (enBuyuk<number){
                enBuyuk = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam: " +total);
        System.out.println("En Buyuk: " +enBuyuk);

    }
}
