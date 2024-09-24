package package2;
//Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте
//статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы
//измерения (к примеру, из метров в километры, из километров в мили, и так далее).
public class Distance {
    double distance;

    public void print(){
        System.out.println("Distance: " + distance);
    }

    public static class Converter{

        public static double metersToKilometers(double distance){
            return distance / 1000;
        }
        public static double kilometersToMiles(double distance){
            return distance * 0.621371;
        }

    }
}
