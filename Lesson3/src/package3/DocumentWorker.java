package package3;

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
public class DocumentWorker {
    public void openDocument() {
        System.out.println("opened Document");
    }

    public void closeDocument() {
        System.out.println("closed Document");
    }

    public void editDocument() {
        System.out.println("editDocument is possible only with a Pro version");
    }

    public void saveDocument() {
        System.out.println("SaveDocument is possible only with a Pro version");
    }
}
