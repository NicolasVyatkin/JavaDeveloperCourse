package acad.prog.testgenerics;
/**
 * @author Kolin Vyatkin
 * Task 2.14.2
 * 1. Відкрийте проект під назвою TestGenerics.
 * 2. Додайте до пакету acad.prog.testgenerics клас MyTestMethod зі статичним методом calcSum з двома
 * параметрами: масив T[] і змінна maxval типу T, який обчислює суму елементів у масиві T[], які перевищують
 * вказане значення maxval.
 * 3. Додайте до методу main класу Main код, який створює два масиви, перший – масив типу Integer, а другий
 * – масив типу Double. Заповніть ці масиви деякими випадковими значеннями.
 * 4. Додайте код для підрахунку суми елементів у кожному з масивів, які перевищують вказаний елемент,
 * викликавши статичний метод calcSum.
 * 5. Виконайте програму.
 * 	Результат програми повинен бути таким, як у наступному прикладі:
 * 	Значення масиву: [1,2,3,4,5,6,7,8,9]
 * 	Сума елементів, що перевищує 3:
 * 	39
 * 	Значення масиву: [1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9]
 * 	Сума елементів, що перевищує 3:
 * 	46.2
 * 6. Зазначте у документованому коментарі класів номер завдання, своє ім'я та прізвище.
 * 7. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 18) лістинги коду програми та результат їх роботи.
 * */

public class MyTestMethod <T> {
    public static <T extends Number & Comparable<T>> T calcSum(T[] arr, T maxval) {
        if (arr[0].getClass() == Integer.class) {
            Integer sum = 0;
            for (T t : arr
            ) {
                if (t.compareTo(maxval) > 0) {
                    sum = Integer.class.cast(sum) + Integer.class.cast(t);
                }
            }
            return (T) sum;
        }
        if (arr[0].getClass() == Double.class) {
            Double sum = 0.0;
            for (T t : arr
            ) {
                if (t.compareTo(maxval) > 0) {
                    sum = Double.class.cast(sum) + Double.class.cast(t);
                }
            }
            return (T) sum;
        }
        return null;
    }
}