package OOP.Market;

import static print_module.print_library.println;
import java.util.List;

public class MarketMain {
    public static void main(String[] args) {
        println("Hello");

        Human igor = new Human("Igor");
        Human sveta = new Human("Svetlana");
        Human sergey = new Human("Sergey");

        Market korzinka = new Market();

        korzinka.acceptToMarket(sergey);
        korzinka.acceptToMarket(sveta);
        korzinka.acceptToMarket(igor);

        korzinka.update();

        igor.putInBasket(List.of(Products.MEAT, Products.ONION));
        sveta.putInBasket(List.of(Products.APPLE_JUICE, Products.GREEN_TEA, Products.PINEAPPLE));
        sergey.putInBasket(Products.SOAP);

        sergey.setMakeOrder(true);
        igor.setMakeOrder(true);
        sveta.setMakeOrder(true);

        korzinka.takeInQueue(sergey);
        korzinka.takeInQueue(igor);
        korzinka.takeInQueue(sveta);

        sergey.setTakeOrder(true);
        korzinka.giveOrders(sergey);
        korzinka.releaseFromMarket(sergey);
        korzinka.update();
        igor.setTakeOrder(true);
        korzinka.giveOrders(igor);
        korzinka.releaseFromMarket(igor);
        korzinka.update();
        sveta.setTakeOrder(true);
        korzinka.giveOrders(sveta);
        korzinka.releaseFromMarket(sveta);
        korzinka.update();

    }
}
