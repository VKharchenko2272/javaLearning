package package2;
//Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте
//статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы
//измерения (к примеру, из метров в километры, из километров в мили, и так далее).
public class Main {
    public static void main(String[] args) {

        System.out.println(Distance.Converter.kilometersToMiles((1000)));
        System.out.println(Distance.Converter.metersToKilometers(5243));
    }
}
