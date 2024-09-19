package package1;
//Используя IntelliJ IDEA, создайте проект. Требуется:
//Создайте класс AbstractHandler.
//В теле класса создать методы void open(), void create(), void change(), void save().
//Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
//Написать программу, которая будет выполнять определение документа и для каждого формата должны
//быть методы открытия, создания, редактирования, сохранения определенного формата документа.

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    DOCHandler docHandler = new DOCHandler();
    TXTHandler txtHandler = new TXTHandler();
    XMLHandler xmlHandler = new XMLHandler();

    public void startMenu() {

        System.out.println("Welcome to the Menu");
        System.out.println("Do you want to Create new document or Open existing?\n1. Create\n2. Open\n3. Exit");
        String userChoice = sc.nextLine().toLowerCase().trim();
        int choice = 0;
        if (userChoice.equals("1") || userChoice.equals("Create")) {
            choice = 1;
        } else if (userChoice.equals("2") || userChoice.equals("Open")) {
            choice = 2;
        } else if (userChoice.equals("3") || userChoice.equals("Exit")) {
            System.exit(0);
        }
        else
            System.out.println("Invalid choice");
        displayMenu(choice);
    }

    public void displayMenu(int choice) {
        String typeChoise = "";
        switch (choice) {
            case 1:
                System.out.println("Which style of document do you want to create?\n1. DOC\n2.TXT\n" +
                        "3. XML");
                typeChoise = sc.nextLine().toLowerCase().trim();
                int userTypeChoice = 0;
                userTypeChoice = getUserTypeChoice(typeChoise, userTypeChoice);

                documentOptions(userTypeChoice);
                break;
            case 2:
                System.out.println("Which document do you want to open?\n1. DOC\n2.TXT\n" +
                        "3. XML");
                typeChoise = sc.nextLine().toLowerCase().trim();
                userTypeChoice = 0;
                userTypeChoice = getUserTypeChoice(typeChoise, userTypeChoice);

                documentOptions(userTypeChoice);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    private int getUserTypeChoice(String typeChoise, int userTypeChoice) {
        if (typeChoise.equals("1") || typeChoise.equals("doc")) {
            userTypeChoice = 1;

        } else if (typeChoise.equals("2") || typeChoise.equals("xml")) {
            userTypeChoice = 2;
        } else if (typeChoise.equals("3") || typeChoise.equals("txt")) {
            userTypeChoice = 3;
        } else
            System.out.println("Invalid choice");
        return userTypeChoice;
    }

    public void documentOptions(int choice) {
        boolean running = true;
        while (running) {
            if (choice == 1) {
                docHandler.change();
                docHandler.save();
            }
            else if (choice == 2) {
                txtHandler.change();
                txtHandler.save();
            }
            else if (choice == 3) {
                xmlHandler.change();
                xmlHandler.save();
            }
            System.out.println("Do you want to continue?\n1. Yes\n2. No");
            String userChoice = sc.nextLine().toLowerCase().trim();
            if (userChoice.equals("1") || userChoice.equals("yes")) {
                running = true;
            }
            else if (userChoice.equals("2") || userChoice.equals("no")) {
                running = false;
            }
            else
                System.out.println("Invalid choice");
        }
        startMenu();
    }
}
