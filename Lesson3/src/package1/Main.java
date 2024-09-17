package package1;
//Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
//Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и
//переопределите каждый из методов, в зависимости от успеваемости ученика.
//Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
//Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
//Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать,
//отдыхать.
public class Main {
    public static void main(String[] args) {
        Pupil excellentPupil1 = new ExcellentPupil();
        Pupil excellentPupil2 = new ExcellentPupil();
        Pupil goodPupil1 = new GoodPupil();
        Pupil badPupil1 = new BadPupil();

        ClassRoom classRoom1 = new ClassRoom(excellentPupil1, goodPupil1, badPupil1, excellentPupil2);

        classRoom1.print();
    }
}
