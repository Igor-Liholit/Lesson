package Coffee.order;

public class Main   {
    public static void main(String[] args) {

        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        orderBoard.add("Petya");
        orderBoard.add("Artem");
        orderBoard.add("Petro");
        orderBoard.deliver(12);
        orderBoard.deliver(52);
        orderBoard.deliver(124);
        orderBoard.draw();
    }
}

