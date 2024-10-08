package package2;
//Создать класс Vehicle.
//В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год
//выпуска).
//Создайте 3 производных класса Plane, Саг и Ship.
//Для класса Plane должна быть определена высота и количество пассажиров.
//Для класса Ship – количество пассажиров и порт приписки.
//Написать программу, которая выводит на экран информацию о каждом средстве передвижения.
public class Main {
    public static void main(String[] args) {
        Vehicle plane1 = new Plane(10, 20, 150000, 900, 2019, 10000, 150);
        Ship ship = new Ship(50, 60, 300000, 40, 2015, 500, "New York");
        Car car = new Car(5, 10, 20000, 180, 2020);

        plane1.display();
        ship.display();
        car.display();
    }
}
