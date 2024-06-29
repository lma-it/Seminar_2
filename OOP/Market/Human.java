package OOP.Market;
import java.util.List;
import java.util.ArrayList;
/*
 * Основной класс, который используется для создания посетителей магазина
 * Переопределяет методы из класса наследника Actor
 */
public class Human extends Actor{

    /*
     * Корзина с продуктами
     */
    private List<Products> basket = new ArrayList<>();


    public void putInBasket(Products product){
        this.basket.add(product);
    }
    /*
     * Конструктор класса
     * 
     * @args name Имя посетителя заданное при создании экземпляра
     */
    public Human(String name) {
        super(name);
    }

    
    @Override
    public void setMakeOrder(boolean makeOrder) {
        this.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        this.isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /*
     * Метод возвращает имя посетителя
     * 
     * @return name Имя посетителя
     */
    @Override
    public String getname() {
        return name;
    }

    public int sizeOfBasket(){
        return this.basket.size();
    }

    @Override
    public String toString() {
        return String.format("Name: %s", getname());
    }
    
}
