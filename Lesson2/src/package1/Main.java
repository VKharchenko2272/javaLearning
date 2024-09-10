package package1;

//Create a Car class with fields year(int), color(String).
//Create a default constructor, a constructor with one and two parameters.
//Create a class package1.Main in which to create instances by calling different constructors.

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(2001);
        Car car2 = new Car(2002, "Green");
        Car car3 = new Car();

        car1.print();
        car2.print();
        car3.print();
    }
}