package HomeWorkOOP_1.TAsk_3;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Класс "Библиотека" (Library):
Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг в библиотеке.
Публичный метод "добавить книгу" (addBook), который принимает объект типа Book и добавляет его в каталог библиотеки.
Публичный метод "удалить книгу" (removeBook), который принимает объект типа Book и удаляет его из каталога библиотеки.
Публичный метод "показать доступные книги" (displayAvailableBooks), который выводит на консоль информацию о доступных книгах в библиотеке.
Публичный метод "поиск книги по автору" (searchByAuthor), который принимает имя автора в качестве параметра и выводит на консоль информацию 
о книгах данного автора, находящихся в каталоге библиотеки.
 */
public class Library extends Book {
    ArrayList<Book> catalog;

    public ArrayList<Book> addBook(String author, String title){
        Set<String> catalog = new HashSet<>();
        Book setAuthor = new Book();
        
        author.setAuthor("Пушкин");
        title.setTitle("Сказки");
        
        catalog.add(Book.class.toString());
    }
    
}
