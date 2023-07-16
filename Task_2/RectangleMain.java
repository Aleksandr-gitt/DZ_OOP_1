package HomeWorkOOP_1.Task_2;

public class RectangleMain {
    public static void main(String[] args) {


        
        Rectangle rm = new Rectangle();
        rm.setWight(5.0);
        rm.setHeight(4.0);
        //Rectangle rm = new Rectangle(5.0, 4.0);

        Rectangle rm2 = new Rectangle();

        System.out.println("Площадь 1:  " + rm.calculateArea());
        System.out.println("Периметр 1:  " + rm.calculatePerimeter());
        System.out.println();
        System.out.println();
        System.out.println("Площадь 2:  " + rm2.calculateArea());
        System.out.println("Периметр 2:  " + rm2.calculatePerimeter());
        
        
    }

   
}
