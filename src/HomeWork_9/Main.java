package HomeWork_9;


public class Main {
    public static void main(String[] args) {
        myTotalArea();

    }
    public static void myTotalArea() {
        Figure[] figure = {new Circle(10),
                new Triangle(8, 5, 7),
                new Square(5, 5)};
        double totalArea = 0;
        for (Figure fig : figure) {
            totalArea = totalArea + fig.Area();
        }
        System.out.println("The total area of the figures : " + totalArea);
    }
}


