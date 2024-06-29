package OOP.ActorBehavoir;

public interface QueueBehavoir {
    void takeInQueue(Actor actor);
    void takeOrder(); // cделать заказ
    void giveOrders(); // забрать заказы
    void releaseFromQueue(); // очистить очередь
}
