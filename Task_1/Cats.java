package HomeWorkOOP_1.Task_1;
/**
 * Задача 1:
Создайте класс "Кот" (Cat) со следующими свойствами:
Приватное поле "имя" (name) типа String для хранения имени кота.
Приватное поле "возраст" (age) типа int для хранения возраста кота.
Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
Дополнительное задание:
Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле в классе "Кот" 
и методы доступа для него. Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида
 "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".
 */

public class Cats {
    private String name;
    private int age; 
    String OwnerName;
    
    public Cats(String name, int age, String OwnerName){
        this.name = name;
        this.age = age;
        this.OwnerName = Owner.OwnerName;
    }

    void Greet(){
        System.out.println( "Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец - " + Owner.OwnerName + ".");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

}




