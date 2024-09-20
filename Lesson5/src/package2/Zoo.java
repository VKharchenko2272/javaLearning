package package2;


import java.util.ArrayList;
import java.util.ListIterator;

public class Zoo {
    public void addNames() {
        ArrayList<String> animalNames = new ArrayList<>();

        animalNames.add("Dog");
        animalNames.add("Cat");
        animalNames.add("Cow");
        animalNames.add("Sheep");
        animalNames.add("Pig");
        animalNames.add("Rabbit");
        animalNames.add("Bird");
        animalNames.add("Squid");
        animalNames.add("Chicken");
        animalNames.add("Giraffe");
        animalNames.add("Parrot");
        animalNames.add("Moose");

        ListIterator<String> it = animalNames.listIterator();

        System.out.println("List:");
        System.out.println("amount: " +animalNames.size());

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        animalNames.removeFirst();
        animalNames.remove("Parrot");

        it = animalNames.listIterator();

        System.out.println("\nUpdated List reversed:");
        System.out.println("amount: " + animalNames.size());

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
