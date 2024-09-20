package package1;

import java.util.ArrayList;
import java.util.ListIterator;

//Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index,
//element).
//Вывести список в консоль.
public class Zoo {
    public void addAnimals() {
        ArrayList<Integer> animals = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            animals.add(i);
        }

        //       for (Integer animal : animals){
        //           System.out.println(animal);
        //       }

        ListIterator<Integer> it = animals.listIterator();
        while (it.hasNext()) {
            it.next();
        }
        while (it.hasPrevious()) {
            Integer animal = it.previous();
            System.out.println(animal);
        }
    }
}
