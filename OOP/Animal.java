package OOP;

public abstract class Animal {
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    public abstract void eat();

    public abstract void fly();
}
