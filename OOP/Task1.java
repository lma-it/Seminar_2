package OOP;
import static print_module.print_library.println;
/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {
        println("Hello");

        Animal cat = new Cat("Tom");
        Animal duck = new Duck("Donald");

        duck.eat();
        duck.fly();
        
        cat.eat();
        cat.fly();
        
    }
}