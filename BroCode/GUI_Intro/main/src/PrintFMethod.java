public class PrintFMethod {
    public static void main(String[] args) {

        //System.out.printf("%d This is a format string", 123);
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Gizem";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion character]
        System.out.printf("%b", myBoolean);
        System.out.println();
        System.out.printf("%c", myChar);
        System.out.println();
        System.out.printf("%s", myString);
        System.out.println();
        System.out.printf("%d", myInt);
        System.out.println();
        System.out.printf("%f", myDouble);
        System.out.println();

        // [width]
        System.out.printf("Hello %-10s", myString);
        System.out.println();

        // [precision]
        System.out.printf("You have this much money %.2f", myDouble);   //digit of precision
        System.out.println();

        // [flags]
        System.out.printf("You have this much money %+f", myDouble);
        System.out.println();
        System.out.printf("You have this much money %,f", myDouble);


    }
}
