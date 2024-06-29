package OOP.Market;

/*
 * Абстрактный класс имитирующий поведение и состояния посетителей магазина
 * 
 * @param name Имя посетителя
 * @param isMakeOrder булево состояние, указывающее на то, сделал ли посетитель заказ
 * @param isTakeOrder булево состояние, указывающее на то, получил ли посетитель свой заказ
 */
public abstract class Actor implements ActorBehavior{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    


    public Actor(String name) {
        this.name = name;
    }

    public abstract String getname();
}
