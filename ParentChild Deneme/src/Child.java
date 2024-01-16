public class Child extends Parent {

    private int childField;

    public Child(int parentValue, int childField) {
        super(parentValue);  //--> ust sinifin constructorini cagirir
        this.childField = childField;

        System.out.println("Child Class Constructor");
    }

    @Override
    public void display() {
        super.display();  //--> ust sinifin metodunu cagirir

        System.out.println("Child Class: " + childField);
    }
}
