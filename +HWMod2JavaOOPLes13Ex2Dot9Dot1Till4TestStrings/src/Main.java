import java.util.Arrays;

/**
 * The class searches for a substring in a string and reverses a string
 *
 * @author Kolin Vyatkin
 * task 2.9.1
 * 1. Створіть новий проект під назвою TestStrings. Додайте пакет acad.prog.teststring1.
 * 2. Створіть клас Main з методом main, у якому оголосіть локальну змінну myStr типу String та присвойте
 * їй значення: "abracadabra".
 * 3. Використовуючи методи класу String, виконайте наступне:
 *   - знайдіть індекс першого підрядка "ra" значення myStr і виведіть результат на консоль;
 *   - знайдіть індекс останнього підрядка "ra" значення myStr і виведіть результат на консоль;
 *   — отримайте підрядок myStr від 3 до 7 символів індексу та виведіть результат на консоль;
 * 4. До класу Main додайте статичний метод reverseString(String), який повертає як результат значення
 * рядка-параметра із зміненим на зворотній порядком літер (наприклад, "abcd" -> "dcba").
 * 5. У методі main викличте метод reverseString з аргументом myStr і виведіть результат на консоль.
 * 6. Зазначте у документованому коментарі класу та методів їх призначення, у документованому коментарі
 * класу - номер завдання, а також своє ім'я та прізвище.
 * 7. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 13) лістинги коду
 * програм та результат їх роботи.
 * task 2.9.2
 * 1. До проекту TestStrings додайте пакет acad.prog.teststring2.
 * 2. Створіть клас Main з методом main, у методі main оголосіть дві локальні змінні myStr1 та myStr2 типу
 * String та призначте значення "Cartoon" для першого рядка та "Tomcat" для другого.
 * 3. Напишіть код, що виводить на консоль всі букви, які є у першому слові, але відсутні у другому.
 * task 2.9.3
 * 1. До проекту TestStrings додайте пакет acad.prog.teststring3.
 * 2. Створіть клас Main, в ньому створіть статичний метод uniqueChars, який має приймати рядок як аргумент
 * і повертати масив унікальних символів аргумента-рядка.
 * 3. Створіть метод main та додайте до нього виклик методу uniqueChars і передайте йому рядок "Використання
 * методів класу String" як аргумент. Виведіть результат роботи методу на екран.
 * task 2.9.4
 * 1. До проекту TestStrings додайте пакет acad.prog.testsregexp.
 * 2. Створіть клас Main, в ньому створіть статичний метод checkPersonWithRegExp, який приймає аргумент-рядок
 * і повертає булеве значення true, лише якщо перший символ рядка-аргументу зазначений у верхньому регістрі,
 * а всі інші символи - у нижньому регістрі і рядок містить лише літери.
 * 3. Створіть метод main та оголосіть у ньому масив рядків з такими значеннями: {"VOVA", "Ivan", "R2d2", "ZX",
 * "Anna", "12345", "ToAd", "TomCat", " "}
 * 4. Додайте код для перевірки кожного з цих значень за допомогою методу checkPersonWithRegExp і виведіть
 * результат на консоль.
 */
public class Main {
    public static void main(String[] args) {

//        //2.9.1
//        String myStr = "abracadabra";
//
//        System.out.println(myStr.indexOf("ra"));
//        System.out.println(myStr.lastIndexOf("ra"));
//        System.out.println(myStr.substring(2, 7));
//        System.out.println(reverseString(myStr));
//
//        //2.9.2
//        String myStr1 = "Cartoon".toLowerCase();
//        String myStr2 = "Tomcat".toLowerCase();
//
//        for (char letter : myStr1.toCharArray()) {
//            if (myStr2.indexOf(letter) == -1) {
//                System.out.print(letter);
//            }
//        }
//        //2.9.3
//        System.out.println(uniqueChars("Використання методів класу String"));
//    }
//
//    public static char[] uniqueChars(String str) {
//        StringBuilder unique = new StringBuilder();
//
//        for (int i = 0; i < str.length(); i++) {
//            char letter = str.charAt(i);
//
//            if (str.indexOf(letter) == str.lastIndexOf(letter)) {
//                unique.append(letter);
//            }
//        }
//
//        return unique.toString().toCharArray();
//    }
    //2.9.4
    String[] words = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};
        Arrays.stream(words).forEach(word -> System.out.println("'" + word + "' - "
                + checkPersonWithRegExp(word)));
}

    public static boolean checkPersonWithRegExp(String str) {
        return str.matches("^[A-ZА-Я][a-zа-я]+");
    }


//2.9.1
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}