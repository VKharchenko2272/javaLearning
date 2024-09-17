package package1;

//Создать класс, представляющий учебный класс ClassRoom.
//Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
//Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и
//переопределите каждый из методов, в зависимости от успеваемости ученика.
//Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
//Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
//Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать,
//отдыхать.
public class ClassRoom {

    Pupil[] pupils;

    public ClassRoom(Pupil... pupils) {
        if (pupils.length < 2 || pupils.length > 4) {
            System.out.println("Invalid number of pupils");
            throw new IllegalArgumentException("Invalid number of pupils");
        }
        this.pupils = new Pupil[4];

            System.arraycopy(pupils, 0, this.pupils, 0, pupils.length);

    }

    public void print() {
        for (int i = 0; i < pupils.length; i++) {
            if (pupils[i] != null) {
                System.out.println("Pupil " + (i+1) + ":");
                pupils[i].read();
                pupils[i].write();
                pupils[i].relax();
                pupils[i].study();
            }
        }
    }

}
