package package1;

//Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать
//целочисленное значение (возраст животного), и содержать перегруженный метод toString(), который
//должен возвращать название экземпляра и возраст животного.
public class Main {
    public static void main(String[] args) {

        for (Animals a : Animals.values()) {
            System.out.println(a.toString());
        }
    }
}

enum Animals {
    DOG(5),
    CAT(3),
    HORSE(10),
    ELEPHANT(25);
    private final int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name() + " (age: " + age + ")";
    }
}