package OOP;
import static print_module.print_library.println;
/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {
        println("Hello");

        Animal cat = new Cat("Tom");
        FlyingAnimal duck = new Duck("Donald");
        Swimable duck2 = new Duck("Don");

        Duck duck3 = new Duck("MacDuck");

        duck.eat();
        duck.fly();
        duck2.swim(14.6f);

        duck3.eat();
        duck3.fly();
        duck3.swim(12.5f);
        
        duck2.swim(13.6f);// duck2 объявлен как Swimmable, поэтому у него нет методов eat и fly.

        cat.eat();

        
    }
}