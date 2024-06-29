package OOP.ActorBehavoir;

import java.util.List;

public interface MarketBehavoir {
    void acceptToMarket(Actor actor); // входит в магазин
    void releaseFromMarket(List<Actor> actors); // выходит из магазина
    void update(); // обновление состояния магазина
}
