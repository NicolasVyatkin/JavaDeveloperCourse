package ooplesson9.hw.basic.one;

import java.util.ArrayList;
import java.util.List;

public class ListCreator {

    public ListCreator() {
    }

    public void createList() {
        List<Integer> listInt = new ArrayList<>();
        System.out.println("Basic list: ");
        for (int i = 0; i <= 9; i++) {
            listInt.add((int) (Math.random() * 100));
            System.out.print("Elem № " + i + " = " + listInt.get(i) + " ");
        }
        listInt.remove(0);
        listInt.remove(0);
        listInt.remove(7);
        System.out.println("\nList with remuwed first, second and last element: ");
        System.out.println(listInt);
    }
}
