package package2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {
    public void menu() {


        Scanner sc = new Scanner(System.in);
        Worker[] workers = new Worker[5];
        int currentYear = 2024;
        System.out.println("You need to enter info about 5 workers:");
        for (int i = 0; i < workers.length; i++) {
            System.out.println("Worker " + (i + 1) + ":");
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter Last name");
            String lastName = sc.next();
            System.out.println("Enter position");
            String position = sc.next();

            int yearHired = 0;
            boolean validYear = false;

            while (!validYear) {

                System.out.println("Enter year when hired:");

                try {
                    yearHired = sc.nextInt();
                    if (yearHired > 1900 && yearHired <= currentYear) {
                        validYear = true;
                    } else {
                        throw new IllegalArgumentException("Year must be between 1900 and " + currentYear);
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid year.");
                    sc.next();
                }
            }

            workers[i] = new Worker(lastName, name, position, yearHired);
        }

        Arrays.sort(workers, Comparator.comparing(Worker::getLastName));

        System.out.println("Type min years of exp:");
        int minYears = sc.nextInt();

        for (Worker worker : workers) {
            int experience = worker.getExperience(currentYear);
            if (experience > minYears) {
                System.out.println(worker);
            }
        }
    }
}

