package package1;

//Используя IntelliJ IDEA, создайте проект. Требуется:
//Создайте класс AbstractHandler.
//В теле класса создать методы void open(), void create(), void change(), void save().
//Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
//Написать программу, которая будет выполнять определение документа и для каждого формата должны
//быть методы открытия, создания, редактирования, сохранения определенного формата документа.
abstract class AbstractHandler {
    public void open() {
        System.out.println("Open file format");
    }

    public void create() {
        System.out.println("Create file");
    }

    public abstract void change();

    public abstract void save();
}
