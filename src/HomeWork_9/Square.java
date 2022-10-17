package HomeWork_9;

public class Square  implements  Figure{
    private double numSquare1;
    private double numSquare2;

    public Square(double numSquare1, double numSquare2) {
        this.numSquare1 = numSquare1;
        this.numSquare2 = numSquare2;
    }

    public double Area() {
        double area;
        return area =  numSquare1 * numSquare2;
    }
}
