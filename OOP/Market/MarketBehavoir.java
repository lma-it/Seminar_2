package OOP.Market;

public interface MarketBehavoir {
    void acceptToMarket(Actor actor); // входит в магазин
    void releaseFromMarket(Actor actor); // выходит из магазина
    void update(); // обновление состояния магазина
}
