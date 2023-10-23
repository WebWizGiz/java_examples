import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

     CreditManager[] credits = new CreditManager[3];

        ArrayList<CreditManager> credits = new ArrayList<CreditManager>();
        credits.add(new MortgageManager());
        credits.add(new VehicleManager());
        credits.add(new OfficerCredit());

     for (CreditManager credit : credits){
         credit.calculate();
     }

    }
}
