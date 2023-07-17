package HomeWorkOOP_1.Task_1;

public class MainCatsGreet {

    public static void main(String[] args) {

        
        Cats cat = new Cats();   // 1й кот со значениями по умолчанию

        Cats cat2 = new Cats();  // 2й кот с пользовательскими параметрами(передаваемыми с помощью SET)
        cat2.setAge(13);
        cat2.setName("Bars");
        cat2.setOwnerName("Boss");
        
        
        System.out.println("Приветствие :");
        cat.Greet();
        System.out.println("Приветствие :");
        cat2.Greet();
        
    }

    
    
}
