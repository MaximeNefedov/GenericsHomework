package Generics.homework1;

public class Main {
    public static void main(String a[]) {
        // параметризируем класс типом String
        Box<String> sample1 = new Box<>("Нетология");
        System.out.println(sample1);
        // параметризируем класс типом Integer
        // Ошибкой в данном случае являлось то, что экзмепляр класса был неверно параметризован.
        // Решенем проблемы будет использование класса-обертки Integer
        // в качестве дженерика для дальнейшей работы с типом данных int у данного экземпляра
        Box<Integer> sample2 = new Box<>(1);
        System.out.println(sample2);
        // параметризируем класс типом Boolean
        Box<Boolean> sample3 = new Box<>(Boolean.TRUE);
        System.out.println(sample3);
    }
}
