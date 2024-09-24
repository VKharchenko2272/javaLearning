package package1;
//Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Wheel и Door, которые
//также должны содержать метод print. Создайте экземпляры классов Wheel и Door.
public class Vehicle {

    public void print(){
        System.out.println("Vehicle");
    }

    public static class Wheel{
        public void print(){
            System.out.println("Wheel");
        }
    }

    public static class Door{
        public void print(){
            System.out.println("Door");
        }
    }
}
