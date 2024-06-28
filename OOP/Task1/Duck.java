package OOP.Task1;

import static print_module.print_library.println;

public class Duck extends FlyingAnimal implements Swimable, Diveable{

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

    @Override
    public void dive() {
        println("Кря! Я ныряю");
    }

    
}
