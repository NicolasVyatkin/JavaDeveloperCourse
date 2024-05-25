package countelements;

/*
 * 3. Решить задачу подсчета повторяющихся элементов в массиве с
помощью HashMap.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] data = new int[100];

        Random r = new Random();

        for (int i = 0; i < data.length; i++)
            data[i] = r.nextInt(100);

        Map<Integer, Integer> rez = new HashMap<Integer, Integer>();

        for (int i : data) {

            Integer tmp1 = i;

            if (rez.containsKey(tmp1)) {
                int tmp2 = rez.get(tmp1) + 1;
                rez.put(tmp1, tmp2);
            } else
                rez.put(tmp1, 0);
        }


        for (Map.Entry<Integer, Integer> entry : rez.entrySet()) {
            if (!entry.getValue().equals(0))
                System.out.printf("Number...  %s, Duplicates...  %s\r\n", entry.getKey(), entry.getValue() + 1);
        }
    }
}


//    static <E> List<E> noDuplicate(E[] array) {
//        List<E> list = new ArrayList<>();
//        Map<E, E> map = new HashMap<>();
//        for (E arr : array) {
//            map.put(arr, arr);
//        }
//
//        Set<Map.Entry<E, E>> set = map.entrySet();
//        for (Map.Entry<E, E> st : set) {
//            list.add(st.getKey());
//        }
//        return list;
//    }
//
//    static List<String> noDuplicate(String value) {
//        String text = value;
//        text = text.replace(" ", "");
//        String[] arrayString = text.split(",");
//
//        return Main.<String>noDuplicate(arrayString);
//    }
//
//    public static void main(String[] args) {
//        Integer[] arrayInt = {0, 1, 9, 2, 8, 3, 7, 4, 6, 5, 5, 6, 4, 7, 3, 8, 2, 9, 1, 0};
//        List<Integer> listInt = Main.<Integer>noDuplicate(arrayInt);
//
//        System.out.println(Arrays.toString(arrayInt));
//        System.out.println(Arrays.toString(listInt.toArray()));
//        System.out.println("The number of repetitions = " + (arrayInt.length - listInt.size()));
//
//        System.out.println();
//
//        System.out.println("Enter a set of numbers:");
//        Scanner scanner = new Scanner(System.in);
//        String text = scanner.nextLine();
//        List<String> listString = Main.<String>noDuplicate(text);
//
//        System.out.println(text);
//        System.out.println(Arrays.toString(listString.toArray()));
//    }
