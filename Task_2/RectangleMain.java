package HomeWorkOOP_1.Task_2;

public class RectangleMain {
    public static void main(String[] args) {


        Rectangle rm = new Rectangle(5, 4);
        Rectangle rm2 = new Rectangle();

        System.out.println("Площадь :");
        rm.calculateArea();
        System.out.println();
        System.out.println("Периметр :");
        rm.calculatePerimeter();

        System.out.println("Площадь :");
        rm2.calculateArea();
        System.out.println();
        System.out.println("Периметр :");
        rm2.calculatePerimeter();
        
    }

   
}
