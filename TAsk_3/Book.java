package HomeWorkOOP_1.TAsk_3;
/**
 * Реализуйте систему управления библиотекой. Создайте классы "Книга" (Book) и "Библиотека" (Library) 
 * со следующими свойствами и методами:

 Класс "Книга" (Book):
Приватные поля "название" (title) и "автор" (author) типа String для хранения названия и автора книги соответственно.
Приватное поле "доступность" (available) типа boolean для указания доступности книги.
Публичные методы доступа (геттеры и сеттеры) для полей "название" и "автор".
Публичные методы доступа (геттеры и сеттеры) для поля "доступность".
Публичный метод "показать информацию" (displayInfo), который выводит на консоль информацию о книге (название, автор, доступность).

Класс "Библиотека" (Library):
Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг в библиотеке.
Публичный метод "добавить книгу" (addBook), который принимает объект типа Book и добавляет его в каталог библиотеки.
Публичный метод "удалить книгу" (removeBook), который принимает объект типа Book и удаляет его из каталога библиотеки.
Публичный метод "показать доступные книги" (displayAvailableBooks), который выводит на консоль информацию о доступных книгах в библиотеке.
Публичный метод "поиск книги по автору" (searchByAuthor), который принимает имя автора в качестве параметра и выводит на консоль информацию 
о книгах данного автора, находящихся в каталоге библиотеки.
 */
public class Book {
    private String title;
    private String author;
    private Boolean available;


    // public Book(String title, String author, Boolean available){
    //     this.title = title;
    //     this.author = author;
    //     this.available = available;
    // }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public Boolean getAvailable(){
        return available;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }


    void displayInfo(){
        if (available){
            System.out.println("Наименование : " + title);
            System.out.println("Автор : " + author);
            System.out.println("В наличии");
        }else{
            System.out.println("Наименование : " + title);
            System.out.println("Автор : " + author);
            System.out.println("Отсутствует");
        }
    }
    
}
