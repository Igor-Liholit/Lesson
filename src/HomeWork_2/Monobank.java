package HomeWork_2;

import java.util.Scanner;

public class Monobank {

    public static void main(String[] args) {
        System.out.println("Вас вітає Монобанк 2.0 \nТут ви можете покласти на депозит свої кошти.\n" +
                "Річна ставка складає 7 % ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть імя та фамилію на кого бажаєте відкрити депозит:" );
        String name = scanner.nextLine();
        System.out.println("Введіть суму  яку бажаєте покласти на депозит:");
        double money = scanner.nextDouble();
        System.out.println("Ваш відсоток за 1 рік складає "  + ((money * 7)/100) );
        System.out.println("Ваш відсоток за 5 років складає "  + (((money * 7)/100) * 5));
        System.out.println("Ваш відсоток за 10 років складає "  + (((money * 7)/100) * 10));
    }
}