package OOP.Market;

public enum Products {

    MEAT ("Мясо"),
    POTATO ("Картошка"),
    TOMATO ("Помидоры"),
    LEMON_JUICE ("Лимонный сок"),
    APPLE_JUICE ("Яблочный сок"),
    BLACK_TEA ("Черный чай"),
    GREEN_TEA ("Зеленый чай"),
    SOAP ("Мыло"),
    PEPER ("Перец"),
    WATERMELON ("Арбуз"),
    PINEAPPLE ("Ананас"),
    MUSHROOMS ("Грибы"),
    WATER ("Вода минеральная"),
    ONION ("Лук репчатый");


    private String name;

    Products(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    

}
