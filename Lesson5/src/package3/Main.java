package package3;


import java.util.ArrayList;
import java.util.ListIterator;

//Создать класс Main, создать список целых чисел и используя ListIterator пройтись по списку и увеличить
//значения на 1;
public class Main {
    public static void main(String[] args) {
        numberMethod();
    }

    public static void numberMethod() {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            int current = listIterator.next();
            listIterator.set(current + 1);
        }
        for (Integer i : list) {
            System.out.println(i);
        }

    }
}
