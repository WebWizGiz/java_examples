public class Main_0 {
    public static void main(String[] args) {

            //reference type
        CustomerManagerInheritance customerManager = new CustomerManagerInheritance();
        CustomerManagerInheritance customerManager1 = new CustomerManagerInheritance();
        customerManager = customerManager1;
        customerManager.Add();
       // customerManager.Remove();
       // customerManager.Update();

            //value type
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        int[] sayilar1 = new int[]{1,2,3}; // iki degisken ayni referansi tutuyor
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);


    }
}


