package OOP.Market;

public interface ActorBehavior {
    /**
     * Метод, который задает состояние {@code true}, если посетитель сделал заказ 
     */
    void setMakeOrder(boolean makeOrder);

    /**
     * Метод, который задает состояние {@code true}, если посетитель получил заказ 
     */
    void setTakeOrder(boolean takeOrder);

    /**
     * Метод, который возвращает состояние {@code true} или {@code false}, в зависимости от того сделал ли посетитель заказ или нет
     */
    boolean isMakeOrder();

    /**
     * Метод, который возвращает состояние {@code true} или {@code false}, в зависимости от того получил ли посетитель заказ или нет
     */
    boolean isTakeOrder();
 
}
