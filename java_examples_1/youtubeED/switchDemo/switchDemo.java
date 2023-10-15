public class switchDemo {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Mukemmel : Gectiniz.");
                break;
            case 'B':
            case 'C':
                System.out.println("Iyi : Gectiniz.");
                break;
            case 'D':
                System.out.println("Fena Degil : Gectiniz.");
                break;
            case 'E':
                System.out.println("Iyi Degil : Kaldiniz.");
            case 'F':
                System.out.println("Maalesef Kaldiniz.");
                break;
            default:
                System.out.println("Gecersiz not girdiniz.");
        }


    }
}
