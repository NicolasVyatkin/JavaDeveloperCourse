package acad.prog.testexcp1;
/**
 * Task 2.11.1
 * @author Kolin Vyatkin
 * 1. Створіть новий проект під назвою ExceptionDemo. Додайте до нього пакет acad.prog.testexcp1.
 * 2. Створіть у цьому пакеті клас Person, у якому оголосіть поля firstName(типу String), lastName(String),
 * age (int). Додайте до класу конструктор, геттери та сеттери для кожного поля.
 * 3. Створіть клас InvalidAgeException, який є підкласом RuntimeException, із конструктором без параметрів,
 * який передає до конструктора суперкласу повідомлення про помилкове значення віку.
 * 4. Виконайте модифікацію сеттера поля age, який має викликати InvalidAgeException, коли вік виходить за
 * межі діапазону 1-120.
 * 5. Створіть клас Main з методом main, який створює об’єкт Person і викликати метод setAge з обробкою
 * винятків за допомогою оператора try-catch і виводить на консоль повідомлення винятка про помилку.
 * 6. Виконайте програму.
 * 7. Зазначте у документованому коментарі класів номер завдання, своє ім'я та прізвище.
 * 8. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 15) лістинги коду
 * програм та результат їх роботи.
 */
public class Main {

    public static void main(String[] args) {
        try {
            new Person("Rita", "Star", 17).setAge(127);

        } catch (InvalidAgeException e) {
            System.out.println("\n" + e.getMessage());
        }
    }
}