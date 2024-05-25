public class Main {
    public static void main(String[] args) {
        //=======Without Generics===========
//        Container container1 = new Container(100);
//
//        Container container2 = new Container("Hello world");
//
//        System.out.println(container1);
//        System.out.println(container2);
//
//        container1.setElement("Java");
//
//        int sum = 50 + (Integer) container1.getElement();
//
//        System.out.println(sum);
        //=======With Generics============

        Container<Integer> container1 = new Container<>(100);

        Container<String> container2 = new Container<>("Hello world");

        System.out.println(container1);
        System.out.println(container2);

//    container1.setElement("Java");

        int sum = 50 + container1.getElement();

        System.out.println(sum);

        Pair<Integer, String> pairOne = new Pair<>(10, "one");

        Integer[] arrayOne = new Integer[]{2, 5, 8, 22, 14, 7};
        Integer minOne = getMin(arrayOne);
        System.out.println(minOne);
    }

    //=======method for searching minimal element in array====
    public static <E extends Comparable<E>> E getMin(E[] array) {
        E min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }
}