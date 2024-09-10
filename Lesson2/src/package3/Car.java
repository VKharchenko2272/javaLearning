package package3;

//Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
//Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//Перегрузить конструкторы вызывая конструктор из конструктора.
//Создать класс Main, в котором создать экземпляры класса Машина с разными параметрами.

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this(0, 0.00, 0, "Unknown");
    }

    public Car(int year){
        this(year, 0.00, 0, "Unknown");
    }

    public Car(int year, double speed) {
        this(year, speed, 0, "Unknown");
    }

    public Car(int year, double speed, int weight) {
        this(year, speed, weight, "Unknown");
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public void print(){
        System.out.println("Year: " + year + ", Speed: " + speed + ", Weight: " + weight);
    }
}
