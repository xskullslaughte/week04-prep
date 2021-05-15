import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();


      triangle1.setBase(scnr.nextDouble());
      triangle1.setHeight(scnr.nextDouble());
      triangle2.setBase(scnr.nextDouble());
      triangle2.setHeight(scnr.nextDouble());


      double area1 = triangle1.getArea();
      double area2 = triangle2.getArea();


      System.out.println("Triangle with larger area:");
      double max = Math.max(area1, area2);
      if(max==area1){
         triangle1.printInfo();
      }
      else{
         triangle2.printInfo();
      }

   }
}
