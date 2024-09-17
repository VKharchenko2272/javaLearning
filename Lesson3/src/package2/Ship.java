package package2;

//Создать класс Vehicle.
//В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год
//выпуска).
//Создайте 3 производных класса Plane, Саг и Ship.
//Для класса Plane должна быть определена высота и количество пассажиров.
//Для класса Ship – количество пассажиров и порт приписки.
//Написать программу, которая выводит на экран информацию о каждом средстве передвижения.
public class Ship extends Vehicle {
    int passengers;
    String port;

    public Ship(double x, double y, double price, double speed, int year, int passengers, String port) {
        super(x, y, price, speed, year);
        this.passengers = passengers;
        this.port = port;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Ship Port: " + port + "Passengers: " + passengers);
    }
}
