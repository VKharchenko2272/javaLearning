package package1;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    public void startMenu(){
        System.out.println("Welcome to the Menu");
        System.out.println("Input 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Input 2nd number:");
        int num2 = sc.nextInt();
        System.out.println("Choose one of the following options:\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit");
        int choice = sc.nextInt();

        Calculator calculator = new Calculator();
        switch(choice){
            case 1: calculator.add(num1, num2);
            break;
            case 2: calculator.sub(num1, num2);
            break;
            case 3: calculator.mul(num1, num2);
            break;
            case 4: calculator.div(num1, num2);
            break;
            default: System.exit(0);
        }


    }
}
