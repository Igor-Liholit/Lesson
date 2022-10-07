package HomeWork_8;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(7);
        Figure triangle = new Triangle(8, 4 ,5);
        Figure square = new Square(7,7);

        Figure [] figure = { new Circle(10),
                new Triangle(8,5,7),
                new Square(5,5) };
        for (Figure fig : figure){
            System.out.println(circle.Area() + triangle.Area() + square.Area() );
        }
    }


}

