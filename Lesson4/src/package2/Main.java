package package2;

import java.util.Scanner;

//Создайте 2 интерфейса Playable и Recodable. В каждом из интерфейсов создайте по 3 метода void play() /
//void pause() / void stop() и void record() / void pause() / void stop() соответственно.
//Создайте производный класс Player от базовых интерфейсов Playable и Recodable.
//Написать программу, которая выполняет проигрывание и запись.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        System.out.println("Select an action: ");
        System.out.println("1. Play");
        System.out.println("2. Record");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                player.play();
                player.pause();
                player.stop();
                break;
            case 2:
                player.record();
                player.pause();
                player.stop();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}
