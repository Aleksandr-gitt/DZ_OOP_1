package HomeWorkOOP_1.TAsk_3;

public class MainBook {
    

    

    public static void main(String[] args) {
        
        
        // Book book = new Book("Сказки", "Пушкин",true);
        Book book = new Book();
        book.setAuthor("Пушкин");
        book.setTitle("Сказки");
        book.setAvailable(true);
        
        Book book2 = new Book();
        book2.setAuthor("Успенский");
        book2.setTitle("Чебурашка");
        book2.setAvailable(false);
        
        book.displayInfo();
        book2.displayInfo();
    }
    
}
