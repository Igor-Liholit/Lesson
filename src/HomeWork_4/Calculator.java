package HomeWork_4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число та натисніть Enter");
        double number = scanner.nextDouble();
        System.out.println("Введіть друге число та натисніть Enter");
        double number2 = scanner.nextDouble();
        System.out.println("Введіть операцію яку бажаєте здійснити +,-,*,/ та натисніть Enter");
        char operation = scanner.next().charAt(0);
        String stop ;
        switch (operation) {
            case '+' -> {
                System.out.println("Результат додавання : " + (number + number2));
            }
            case '-' -> {
                System.out.println("Результат віднімання : " + (number - number2));
            }
            case '*' -> {
                System.out.println("Результат множення : " + (number * number2));
            }
            case '/' -> {
                if (number == 0) {
                    System.out.println("На ноль ділити не можна");
                } else {
                    System.out.println("Результат ділення : " + (number / number2));
                }
            }
            default -> {
                System.out.println("Ви ввели не вірний символ повторіть спробу");
            }
        }
        do {
            System.out.println("Введіть exit для закінчення програми");
            stop = scanner.nextLine();
        }
        while (!stop.equals("exit"));
            System.out.println("Дякую,допобачення!");
        }
    }


