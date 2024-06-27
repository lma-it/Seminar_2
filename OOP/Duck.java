package OOP;

import static print_module.print_library.println;

public class Duck extends Animal{

    public Duck(String name) {
        super(name);
    }

    @Override
    public void eat() {
        println(getType() + " Щиплет травку");
    }

    @Override
    public void fly() {
        println(getType() + " Кря! я полетела");
    }
    
}
