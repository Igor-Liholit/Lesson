package HomeWork_4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the first number and press Enter");
        double number = scanner.nextDouble();
        System.out.println("Type the second number and press Enter");
        double number2 = scanner.nextDouble();
        System.out.println("Enter the operation you want to perform +,-,*,/ and press Enter");
        char operation = scanner.next().charAt(0);
        String stop;
        switch (operation) {
            case '+' -> {
                System.out.println("Addition result : " + (number + number2));
            }
            case '-' -> {
                System.out.println("Subtraction result : " + (number - number2));
            }
            case '*' -> {
                System.out.println("The result of multiplication : " + (number * number2));
            }
            case '/' -> {
                if (number == 0) {
                    System.out.println("You cannot divide by zero");
                } else {
                    System.out.println("The result of division : " + (number / number2));
                }
            }
            default -> {
                System.out.println("You entered an invalid character, please try again");
            }
        }
        do {
            System.out.println("Enter exit to end the program");
            stop = scanner.next();
        }
        while (!stop.equals("exit"));
        {
            System.out.println("Thank you, good bye!");
        }
    }
}


