package OOP;

import static print_module.print_library.println;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        println(getType() + " " +  getName() + " Пьет молоко из блюдечка");
    }
    
}
