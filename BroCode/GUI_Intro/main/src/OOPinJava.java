public class OOPinJava {
    public static void main(String[] args) {
        //the characteristics of an objects --> attributes
        //what actions with an objects can perform --> methods

        Car myCar1 = new Car(); // we need to create a construction first
        Car myCar2 = new Car();

        //to call attribute from the car class
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println();
        System.out.println(myCar2.model);
        System.out.println(myCar2.make);

        //to call the methods from the car class
        myCar1.drive();
        myCar1.brake();

    }

    public static class Car{

        String make = "Chevrolet";
        String model = "Corvette";
        int year = 2020;
        String color = "blue";
        double price = 50000.00;

        void drive(){
            System.out.println("You drive the car");
        }

        void brake(){
            System.out.println("You step on the brakes");
        }



    }

}
