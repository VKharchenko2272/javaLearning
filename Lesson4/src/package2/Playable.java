package package2;
//Используя IntelliJ IDEA, создайте проект.Требуется:
//Создайте 2 интерфейса Playable и Recodable. В каждом из интерфейсов создайте по 3 метода void play() /
//void pause() / void stop() и void record() / void pause() / void stop() соответственно.
//Создайте производный класс Player от базовых интерфейсов Playable и Recodable.
//Написать программу, которая выполняет проигрывание и запись.
public interface Playable extends Recordable {
    void play();
}
