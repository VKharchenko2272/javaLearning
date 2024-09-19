package package3;

import java.util.Arrays;
import java.util.Scanner;

//Создайте класс DocumentWorker.
//В теле класса создайте три метода openDocument(), editDocument(), saveDocument().
//В тело каждого из методов добавьте вывод на экран соответствующих строк: "Документ открыт",
//"Редактирование документа доступно в версии Про", "Сохранение документа доступно в версии Про".
//Создайте производный класс ProDocumentWorker.
//Переопределите соответствующие методы, при переопределении методов выводите следующие строки:
//"Документ отредактирован", "Документ сохранен в старом формате, сохранение в остальных форматах
//доступно в версии Эксперт".
//Создайте производный класс ExpertDocumentWorker от базового класса ProDocumentWorker.
//Переопределите соответствующий метод. При вызове данного метода необходимо выводить на экран
//"Документ сохранен в новом формате".
//В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp.
//Если пользователь не вводит ключ, он может пользоваться только бесплатной версией (создается
//экземпляр базового класса), если пользователь ввел номера ключа доступа pro и exp, то должен создаться
//экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker.
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DocumentWorker docWorker = chooseVersion();
        runDocumentOperations(docWorker);
    }

    private static DocumentWorker chooseVersion() {
        System.out.println("Enter your product number: ");
        String product = sc.nextLine().trim().toLowerCase();

        String[] pro = {"pro", "1", "super"};
        String[] expert = {"expert", "2", "best"};

        if (Arrays.asList(pro).contains(product)) {
            return new ProDocumentWorker();
        } else if (Arrays.asList(expert).contains(product)) {
            return new ExpertVersion();
        } else
            return new DocumentWorker();

    }

    private static void runDocumentOperations(DocumentWorker docWorker) {
        boolean running = true;
        while (running) {
            System.out.println("What do you want to do?\n1. Open new file \n2. Edit file \n3.Save file \n4.Close file");
            String userOption = sc.nextLine();
            switch (userOption) {
                case "1":
                    docWorker.openDocument();
                    break;
                case "2":
                    docWorker.editDocument();
                    break;
                case "3":
                    docWorker.saveDocument();
                    break;
                case "4":
                    docWorker.closeDocument();
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}