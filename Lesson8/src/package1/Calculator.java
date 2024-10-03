package package1;
//В теле класса создайте четыре метода для арифметических действий: (add – сложение, sub – вычитание,
//mul – умножение, div – деление).
//Метод деления должен делать проверку деления на ноль, если проверка не проходит, сгенерировать
//исключение.
//Пользователь вводит значения, над которыми хочет произвести операцию и выбрать саму операцию. При
//возникновении ошибок должны выбрасываться исключения.
public class Calculator {

    public void add(int a, int b) {
        try {
            int sum = a + b;
            System.out.println(sum);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public void sub(int a, int b) {
        try{
            int sub = a - b;
            System.out.println(sub);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public void mul(int a, int b) {
        try {
            int mul = a * b;
            System.out.println(mul);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public void div(int a, int b) {
        try {
            int div = a / b;
            System.out.println(div);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
