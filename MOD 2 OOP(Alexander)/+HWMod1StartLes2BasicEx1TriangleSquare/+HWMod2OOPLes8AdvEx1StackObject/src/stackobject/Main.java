package stackobject;

/**
 *Создайте класс-контейнер типа стек (класс в который можно добавлять и удалять
 * объекты других классов, только в вершину стека), в который можно сохранять объекты
 * произвольного типа. Создайте стек на основе массива Object.
 * Реализуйте методы:
 * ● public void push(Object obj) добавления элемента в стек
 * ● public Object pop() получение с удалением элемента из вершины стека
 * ● public Object peek() получение элемента с вершины стека без удаления.
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BlackList blacklist = new BlackList();
        Stack stack = new Stack(blacklist);

        blacklist.addClass(Double.class);
        blacklist.addClass(Scanner.class);

        System.out.println(blacklist);
        System.out.println(stack);

        stack.add(new Scanner(System.in));
        stack.add(2.2);
        stack.add(7);
        stack.add("Java");

        Object copy1 = stack.copyElement();
        System.out.println(stack);

        Object copy2 = stack.copyElementAndDelete();
        System.out.println(stack);

    }
}