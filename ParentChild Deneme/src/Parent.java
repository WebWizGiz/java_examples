public class Parent {
    private int parentField;


    public Parent(int value) {
        this.parentField = value;

        System.out.println("Parent class constructor");
    }

    public void display(){
        System.out.println("Parent class: " + parentField);

    }
}
