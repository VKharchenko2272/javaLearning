package package3;

//Create a Car class with the fields year(int), speed(double), weight(int) color(String).
//Create a default constructor, constructor with 1st parameter, 2nd, 3rd, 4th.
//Overload constructors by calling a constructor from a constructor.
//Create a Main class in which to create instances of the Machine class with different parameters.

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car(2021);
        Car car3 = new Car(2022, 150.5);
        Car car4 = new Car(2023, 180.0, 1500);
        Car car5 = new Car(2024, 200.0, 1800, "Red");

        car1.print();
        car2.print();
        car3.print();
        car4.print();
        car5.print();
    }
}
