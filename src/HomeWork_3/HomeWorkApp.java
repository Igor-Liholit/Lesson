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
    }

    public static void  printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 58;
        int b = 78;
        int sum = a + b;

        if (sum >=0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }


    public static void printColor(){
        int value = 100;
        if (value <= 0){
            System.out.println("Красный");
        } else if  (value > 0 & value <=99) {
            System.out.println("Желтый");
        }
        else{
            System.out.println("Зеленый");
        }
    }

    public  static void compareNumbers(){
        int a = 87;
        int b = 100;
        if (a >=b){
            System.out.println("a >= b");
        }
        else{
            System.out.println( "a < b");
        }
    }


}
