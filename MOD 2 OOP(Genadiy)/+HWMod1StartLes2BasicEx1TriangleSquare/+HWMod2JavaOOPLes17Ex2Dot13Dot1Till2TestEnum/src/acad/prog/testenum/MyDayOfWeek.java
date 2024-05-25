package acad.prog.testenum;
/**
 * Homework 2.13.1-2.13.2
 * @author Kolin Vyatkin
 * 1. Відкрийте проект під назвою TestEnum (завдання 2-13-1).
 * 2. Додайте до перерахування MyDayOfWeek  метод nextDay(), який повертає наступний день тижня для
 * значення перерахування, з якого викликається цей метод.
 * Наприклад: MyDayOfWeek.FRIDAY.nextDay() має повертати MyDayOfWeek.SATURDAY.
 * 3. Додайте до методу main() класу Main код, який зчитує рядкове значення з консолі (за допомогою Scanner),
 * виконує парсинг рядкового значення до певного значення enum, а потім виводитьь на консоль назву наступного
 * дня тиждня. Передбачте генерування виключення у разі, якщо користувачем вводться помилкове рядкове значення.
 * 4. Виконайте програму.
 * Приклад виведення програми:
 * FRIDAY
 * Наступний день тижня: SATURDAY
 * 5. Зазначте у документованому коментарі класів номер завдання, своє ім'я та прізвище.
 * 6. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 17) лістинги коду
 * програми та результат їх роботи.
 */
public enum MyDayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    //2.13.2
    private static final MyDayOfWeek[] vals = values();

    public MyDayOfWeek nextDay() {
        return vals[(this.ordinal() + 1) % vals.length];
}}
