package ooples10.basic.one;

import java.util.*;

//3. Решить задачу подсчета повторяющихся элементов в массиве с
//        помощью HashMap.

public class Main {
    public static void main(String[] args) {
        Random rn = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(rn.nextInt(10));

        }
        System.out.println(list);
        Map<Integer, Integer> stat = new HashMap<>();
        for (Integer number : list
        ) {
            Integer n = stat.get(number);
            if (n == null) {
                stat.put(number, 1);
            } else {
                stat.put(number, n + 1);
            }
        }
        System.out.println(stat);
    }
}