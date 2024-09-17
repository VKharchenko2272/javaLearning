package package2;
//Создать класс Vehicle.
//В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год
//выпуска).
//Создайте 3 производных класса Plane, Саг и Ship.
//Для класса Plane должна быть определена высота и количество пассажиров.
//Для класса Ship – количество пассажиров и порт приписки.
//Написать программу, которая выводит на экран информацию о каждом средстве передвижения.
public class Vehicle {
    double x;
    double y;
    double price;
    double speed;
    int year;

    public Vehicle(double x, double y, double price, double speed, int year) {
        this.x = x;
        this.y = y;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public void display() {
        System.out.println("X coordinate: " + x + " Y coordinate: " + y + " Price: " + price + " Speed: " + speed + " Year: " + year);
    }

}
