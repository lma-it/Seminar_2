package OOP.Market;

import java.util.List;

public interface MarketBehavoir {
    void acceptToMarket(Actor actor); // входит в магазин
    void releaseFromMarket(Actor actor); // выходит из магазина
    void update(List<Human> actors); // обновление состояния магазина
}
