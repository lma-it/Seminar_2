package OOP.Market;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehavoir, QueueBehavoir{

    private List<Actor> actors = new ArrayList<>();
    private Queue<Human> queueOfActors = new LinkedList<Human>();

    // Можно менять сигнатуру методов, если это необходимо.
    @Override
    public void takeInQueue(Human actor) {

        if (actor.sizeOfBasket() != 0){
            if (!actor.isTakeOrder && actor.isMakeOrder){
                queueOfActors.add(actor);
            } else{
                System.out.println("Вы уже забрали свой заказ.");
            }
        }
    }

    @Override
    public void takeOrder(Human actor) {
        if(actor.sizeOfBasket() > 0){
            if(actor.isMakeOrder == false){
                actor.setMakeOrder(true);
            }
        }
    }

    @Override
    public void giveOrders(Human actor) {
        if (queueOfActors.contains(actor) && queueOfActors.peek() == actor){
            if(actor.isTakeOrder){
                releaseFromQueue(actor);
            }
        }
    }

    @Override
    public void releaseFromQueue(Human actor) {
        if(actor.isTakeOrder){
            queueOfActors.remove(actor);
        }
    }

    @Override
    public void acceptToMarket(Actor actor) {
        actor.setMakeOrder(false);
        actor.setTakeOrder(false);
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        if(actor.isTakeOrder || actor.isMakeOrder == false){
            actors.remove(actor);
        }
    }

    @Override
    public void update() {
        /*
         * Понятия не имею что должен обновлять данный метод, потому что все очереди и посетители обновляются автоматически, так как
         * списки для хранения этих значений являются глобальными, и при каждом обращении к ним, они обновляются автоматически, поэтому 
         * сделаю просто вывод списка посетителей магазина
         */

        if(actors.size() != 0){
            System.out.println(actors);
        }else{
            System.out.println("Покупатели получили свои заказы и покинули магазин.");
        }
        
    }
    
}
