package HomeWorkOOP_1.Task_1;
// Дополнительное задание:
// Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String.
// Добавьте соответствующее поле в классе "Кот"
// и методы доступа для него. Измените метод "приветствие" класса "Кот", чтобы
// он выводил приветствие вида
// "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".

public class Owner {

    static String OwnerName;
    

    public static String getOwnerName() {
        return "Alex";
    }

    public void setOwnerName(String OwnerName) {
        Owner.OwnerName = OwnerName;
    }

}