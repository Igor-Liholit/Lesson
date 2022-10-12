package HomeWork_9;

  public class Circle implements Figure {

    private double radius;

     public Circle(double radius) {
         this.radius = radius;
     }

     public double Area(){
         double area;
         return area = radius * radius * Math.PI;
     }
 }
