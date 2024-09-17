package package2;
//Создать класс Vehicle.
//В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год
//выпуска).
//Создайте 3 производных класса Plane, Саг и Ship.
//Для класса Plane должна быть определена высота и количество пассажиров.
//Для класса Ship – количество пассажиров и порт приписки.
//Написать программу, которая выводит на экран информацию о каждом средстве передвижения.
public class Plane extends Vehicle {
    double z;
    int passengers;

    public Plane(double x, double y, double price, double speed, int year, double z, int passengers) {
        super(x, y, price, speed, year);
        this.z = z;
        this.passengers = passengers;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Z: " + z + " Passengers: " + passengers);
    }
}
