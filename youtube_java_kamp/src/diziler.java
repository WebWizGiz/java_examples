public class diziler {

        public static void main(String[] args) {

            String[] sehirler1 = new String[]{"Ankara", "Istanbul", "Izmir"};

            for (String sehir : sehirler1) {
                System.out.println(sehir);
            }

            for (int i = 0; i < 3; i++) {
                System.out.println(sehirler1[0]);
            }



            //heap memory
            sehirler1 = new String[4];
            sehirler1[3] = "Bursa";

            System.out.println(sehirler1[1]);

            // stack memory
            int sayi1 = 10;
            int sayi2 = 20;
            sayi1 = sayi2;
            sayi2 = 30;
            System.out.println(sayi1);

            //Value types: boolean, int, double...
            //Referance type: array, class, abstract, interface


        }
}
