package acad.prog.testgenerics;

/**
 * @author Kolin Vyatkin
 * Task 2.14.1
 * 1. Створіть новий проект під назвою TestGenerics. Додайте до нього пакет acad.prog.testgenerics.
 * 2. Створіть узагальнений клас MyTuple<A,B,C> із трьома полями різних типів, надайте конструктор
 * із трьома параметрами та геттерами для кожного поля.
 * 3. Створіть клас Main з методом main, який створює два об’єкти MyTuple. Перший має бути параметризований
 * такими типами: String, Integer, Long. Другий має бути параметризований такими типами: Double, String, String.
 * 4. Виконайте програму.
 * 5. Зазначте у документованому коментарі класів номер завдання, своє ім'я та прізвище.
 * 6. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 18) лістинги коду
 * програми та результат їх роботи.
 */

public class Main {
    public static void main(String[] args) {
        //2.14.1
        MyTuple First = new MyTuple<>("FirstTuple", 12, 125L);
        MyTuple Second = new MyTuple<>( 12.1, "SecondTuple", "125");

        System.out.println(First.toString());
        System.out.println(Second.toString());
        //2.14.2
        Integer [] integerArray = {1,2,3,4,5,6,7,8,9};
        Double [] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};

        MyTestMethod.calcSum(integerArray, 3);
        MyTestMethod.calcSum(doubleArray, 3.0);

        System.out.println(MyTestMethod.calcSum(integerArray, 3));
        System.out.println(MyTestMethod.calcSum(doubleArray, 3.0));
        //2.14.3
        Integer[] array1 = {1, 3, 5, 15, 21, 101};
        MyMixer a = new MyMixer<>(array1);
        a.shuffle();
        System.out.println(a.toString());

        String[] array2 = {"Один", "Три", "П'ять", "П'ятнадцять", "Двадцять один", "Сто один"};
        MyMixer b = new MyMixer<>(array2);
        b.shuffle();
        System.out.println(b.toString());
    }
}