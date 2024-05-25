package acad.prog.testcollection;

import java.util.*;

/**
 * Task 2.15.1-Task 2.15.3
 *
 * @author Kolin Vyatkin
 * Task 2.15.1
 * 1. Створіть новий проект під назвою TestCollection. Додайте до нього пакет acad.prog.testcollection.
 * 2. Створіть клас Main з методом main, який оголошує змінну list (типу List) рядкових об’єктів, яка вказує на
 * колекцію ArrayList<String>.
 * 3. Напишіть код, щоб заповнити цей список у циклі рядковими значеннями "number_i", де i - номер поточної
 * ітерації (від 0 до 10).
 * 4. Додайте код, який за допомогою ітератора виводить значення елементів на консоль.
 * 5. Виконайте програму.
 * Результат програми повинен бути таким, як у наступному прикладі:
 * number_0 * number_1 * number_2 * … * number_10
 * 6. Зазначте у документованому коментарі класів номер завдання, своє ім'я та прізвище.
 * 7. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 19) лістинги
 * коду програми та результат їх роботи.
 * Task 2.15.3
 * 1. Відкрийте проект TestCollection.
 * 2. Додайте до методу main() класу Main код, що оголошує змінну lnkdList (типу List) рядкових об’єктів,
 * яка вказує на колекцію LinkedList<String>.
 * 3. Додайте до методу main() класу Main код, що заповнює цей список у циклі рядковими значеннями "number_i",
 * де i -  номер поточної ітерації (від 0 до 10) за випадковими індексами (від 0 до номера поточної ітерації).
 * 4. Додайте до методу main() класу Main код, який за допомогою ітератора виводить значення
 * елементів на консоль.
 * 5. Виконайте програму.
 */

public class Main {
    public static void main(String[] args) {

        //Task 2.15.1
//        List<String> list = new ArrayList<>();
//        for (int i = 0; i < 11; i++) {
//            list.add("number_" + i);
//        }
//        for (String s : list) {
//            System.out.println(s);
//        }
        List<String> listOne = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            listOne.add("number_" + i);
        }
        Iterator<String> iter = listOne.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("==============================================================");

        //Task 2.15.2

        ArrayBox<Byte> byteBox = new ArrayBox<>(7, "Byte");
        System.out.println(byteBox);
        System.out.println("The List of positive elements: " + byteBox.positiveElements());

        System.out.println();

        ArrayBox<Integer> intBox = new ArrayBox<>(6, "Integer");
        System.out.println(intBox);
        System.out.println("The List of positive elements: " + intBox.positiveElements());

        System.out.println();

        ArrayBox<Float> floatBox = new ArrayBox<>(5, "Float");
        System.out.println(floatBox);
        System.out.println("The List of positive elements: " + floatBox.positiveElements());

        System.out.println();
        System.out.println("==============================================================");

        //Task 2.15.3
        LinkedList<String> listTwo = new LinkedList<>();
        Random rdn = new Random();
        for (int i = 0; i < 11; i++) {
            listTwo.add(rdn.nextInt(i+1), "num-" + i);
        }

        ListIterator<String> iterTwo = listTwo.listIterator();
        while (iterTwo.hasNext()) {
            System.out.println(iterTwo.next());
        }

    }
}