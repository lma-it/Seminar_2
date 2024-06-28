package OOP.Task1;

import static print_module.print_library.println;



/*
 * Интерфейс это ссылочный тип данных, который не имеет состояний (полей класса), но имеет только поведения (мметоды класса)
 */
public interface Swimable {
    static String type = "Swimable";

    void swim(float speed); // По умолчанию у интерфейсов все методы public abstract, поэтому это не обязательно указывать.

    // метод default можно уже заранее описать в интерфесе. и он будет одинаковый для всех наследников этого метода.
    // ключевое слово default исключительно для интерфейсов, в классах abstract не используется, потому что там можно реализовывать логику метода уже изначально.
    default void swim(){
        println("Плывет со скоростью 5");
    }

    default String getType(){
        return type;
    }
}
