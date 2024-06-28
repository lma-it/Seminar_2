package OOP;

import static print_module.print_library.println;

public class Duck extends FlyingAnimal implements Swimable{

    public Duck(String name) {
        super(name);
    }

    @Override
    public void eat() {
        println(getType() + " " + getName() + " Щиплет травку");
    }

    @Override
    public void fly() {
        println(getType() + " " + getName() + " Кря! я полетела");
    }

    @Override
    public void swim(float speed) {
        println(getType() + " " + getName() +" Кря! Я плыву со скоростью " + speed);
    }

    
}
