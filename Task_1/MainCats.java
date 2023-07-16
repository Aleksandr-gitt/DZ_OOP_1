package HomeWorkOOP_1.Task_1;

public class MainCats {

    public static void main(String[] args) {

        //Cats cat = new Cats("Barsik", 3, "Саня");
        Cats cat = new Cats();
        cat.setAge(3);
        cat.setName("Barsik");

        System.out.println("Приветствие :");
        cat.Greet();
        
    }

    
    
}
