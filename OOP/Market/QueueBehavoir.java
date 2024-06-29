package OOP.Market;


public interface QueueBehavoir {
    void takeInQueue(Human actor); // поместить в очередь
    void takeOrder(Human actor); // cделать заказ
    void giveOrders(Human actor); // забрать заказы
    void releaseFromQueue(Human actor); // очистить очередь
}
