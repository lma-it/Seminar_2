package OOP;

import static print_module.print_library.println;

public class Cat extends Animal implements Swimable{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        println(getType() + " " +  getName() + " Пьет молоко из блюдечка");
    }

    @Override
    public void swim(float speed) {
        println(getType() + " " +  getName() + " Мяу! Плыву");
    }
    
}
