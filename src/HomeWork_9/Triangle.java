package HomeWork_9;

  public class Triangle implements Figure {
    private double catetTriangle1;

    private double catetTriangle2;

    private double catetTriangle3;

     public Triangle(double catetTriangle1, double catetTriangle2, double catetTriangle3) {
         this.catetTriangle1 = catetTriangle1;
         this.catetTriangle2 = catetTriangle2;
         this.catetTriangle3 = catetTriangle3;
     }


     public double Area() {
         double area;
         return  area = Math.abs((catetTriangle1 -catetTriangle3) * (catetTriangle2 - catetTriangle1) -
                 (catetTriangle1)- (catetTriangle2) * (catetTriangle3 - catetTriangle1));
     }
 }
