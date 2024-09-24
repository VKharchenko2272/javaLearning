package package1;
//Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Wheel и Door, которые
//также должны содержать метод print. Создайте экземпляры классов Wheel и Door.
public class Main {
    public static void main(String[] args) {
        Vehicle.Wheel wheel = new Vehicle.Wheel();
        Vehicle.Door door = new Vehicle.Door();

        wheel.print();
        door.print();
    }
}
