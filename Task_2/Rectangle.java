package HomeWorkOOP_1.Task_2;
/**
 * Задача 2:
Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height). 
Класс должен обладать следующими методами:
Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
 */
public class Rectangle {

    double width;
    double height;

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    public Rectangle(){
        width=1.5;
        height=3.0;
    }
    

    double calculateArea(){
        return width*height;
    }


    double calculatePerimeter(){
        return 2*(width*height);
    }


}



