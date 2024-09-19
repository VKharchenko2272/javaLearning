package package1;

////Используя IntelliJ IDEA, создайте проект. Требуется:
////Создайте класс AbstractHandler.
////В теле класса создать методы void open(), void create(), void change(), void save().
////Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
////Написать программу, которая будет выполнять определение документа и для каждого формата должны
////быть методы открытия, создания, редактирования, сохранения определенного формата документа.
public class TXTHandler extends AbstractHandler {
    @Override
    public void change() {
        System.out.println("Change TXT");
    }
    @Override
    public void save() {
        System.out.println("Save TXT");
    }
}
