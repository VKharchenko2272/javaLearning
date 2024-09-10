package package2;

//Using Intelij IDEA to create a project, package.
//(Again!) Create a Car class with the fields year(int), speed(double), weight(int) color(String).
//Create a default constructor, constructor with 1st parameter, 2nd, 3rd, 4th.
//Overload constructors.
//Create a Main class in which to create instances of the Machine class with different parameters.

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(2001, 100.01, 1442, "Green");
        Car car2 = new Car(2011, 160.01, 1643);
        Car car3 = new Car(2022, 200.32);
        Car car4 = new Car(2025);
        Car car5 = new Car();

        car1.print();
        car2.print();
        car3.print();
        car4.print();
        car5.print();
    }
}
