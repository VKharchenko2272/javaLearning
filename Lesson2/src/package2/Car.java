package package2;

//Используя Intelij IDEA создать проект, пакет.
//(Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
//Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//Перегрузить конструкторы.
//Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.
public class Car {
    int year;
    double speed;
    int weight;
    String color;

    public Car() {

    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public void print() {
        System.out.println("Year: " + year + ", Speed: " + speed + ", Weight: " + weight + ", Color: " + color);
    }
}
