package HomeWork_3;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        System.out.println();
        checkSumSign();
        System.out.println();
        printColor();
        System.out.println();
        compareNumbers();
        System.out.println();
        System.out.println(testBoolean(15, 10));
        System.out.println();
        definitionNumber(-7);
        System.out.println();
        System.out.println(chekBoolean(-5));
        System.out.println();
        stringAndNumbers("Hello", 4);
        System.out.println(leapYear(1900));
    }

    public static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple");
    }

    public static void checkSumSign() {
        int a = 58;
        int b = 78;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 99) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 87;
        int b = 100;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean testBoolean(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    public static void definitionNumber(int q) {
        if (q >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean chekBoolean(int e) {
        if (e < 0) {
            return true;
        }
        return false;
    }

    public static void stringAndNumbers(String str, int g) {
        for (int i = 1; i <= g; i++) {
            System.out.println(i + " " + str);
        }
    }

    public static boolean leapYear(int year) {

    }
}
