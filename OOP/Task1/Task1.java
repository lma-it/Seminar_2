package OOP.Task1;
import static print_module.print_library.println;
import java.util.List;
import java.util.ArrayList;
/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {
        println("Hello");

        Cat cat = new Cat("Tom");
        FlyingAnimal duck = new Duck("Donald");
        Swimable duck2 = new Duck("Don");

        Duck duck3 = new Duck("MacDuck");

        duck.eat();
        duck.fly();
        duck2.swim(14.6f);

        duck3.eat();
        duck3.fly();
        duck3.swim(12.5f);
        duck3.swim();
        
        duck2.swim(13.6f); // duck2 объявлен как Swimmable, поэтому у него нет методов eat и fly.

        cat.eat();
        cat.swim(3.5f);

        Animal a = new Animal("Animal") {

            @Override
            public void eat() {
                println("Кушает");
            }
            
        };

        Swimable swimable = new Swimable() {

            @Override
            public void swim(float speed) {
                println(speed / 2);
            }
            
        };
        /*
         * Данная конструкция работает когда в классе интерфейсе только один не реализованный метод, если их более чем один, то лямбда выражение уже не будет работать.
         */
        Swimable swimable2 = (speed -> println(speed * speed));

        swimable2.swim(12f);
        swimable.swim(12f);

        
    }
}