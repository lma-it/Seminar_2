package OOP.ActorBehavoir;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehavoir, QueueBehavoir{

    private List<Actor> actors = new ArrayList<>();

    // Можно менять сигнатуру методов, если это необходимо.
    @Override
    public void takeInQueue(Actor actor) {
        
    }

    @Override
    public void takeOrder() {
        
    }

    @Override
    public void giveOrders() {
        
    }

    @Override
    public void releaseFromQueue() {
        
    }

    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        actors.remove(0);
    }

    @Override
    public void update() {
        // добавить аргумент
        // создать список продуктов магазина
        // метод будет удалять или 
    }
    
}
