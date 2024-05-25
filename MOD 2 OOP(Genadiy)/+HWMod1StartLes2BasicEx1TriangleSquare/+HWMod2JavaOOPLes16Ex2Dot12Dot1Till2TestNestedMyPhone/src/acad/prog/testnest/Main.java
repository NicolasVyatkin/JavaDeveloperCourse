package acad.prog.testnest;
/**
 * Task 2.12.1-2.12.2
 * @author Kolin Vyatkin
 * Task 2.12.1
 * 1. Створіть новий проект під назвою TestNested. Додайте до нього пакет acad.prog.testnest.
 * 2. Створіть клас MyPhoneBook зі статичним вкладеним класом PhoneNumber. Додайте до класу PhoneNumber два
 * поля: name (типу String) та phone (типу String), конструктор з двома параметрами, геттери для кожного поля
 * класу та перевизначений метод toString(), який повертає інформацію про ім’я та номер телефону.
 * 3. Додайте до класу MyPhoneBook приватне поле phoneNumbers як масив PhoneNumber (довжина масиву 10). Додайте
 * до класу MyPhoneBook загальнодоступний метод addPhoneNumber із двома параметрами типу (ім’я, телефон), які
 * використовуються для створення нового об’єкта PhoneNumber і розміщенн його у наступному доступному елементу
 * масиву.
 * 4. Додайте до класу MyPhoneBook загальнодоступний метод printPhoneBook, який циклічно обробляє масив
 * phoneNumbers і виводить інформацію про ім’я та номер телефону кожного запису на консоль.
 * 5. Створіть клас Main з методом main, який створює об’єкт об’єкт MyPhoneBook, і заповнює його п’ятьма
 * записами телефонних номерів. Додайте код для виклику методу printPhoneBook().
 * 6. Виконайте програму.
 * Приклад виведення програми:
 * Ім'я: Саша, телефон: 0501234567
 * Ім'я: Вова, телефон: 0679876543
 * 7. Зазначте у документованому коментарі класів номер завдання, своє ім'я та прізвище.
 * 8. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 16) лістинги коду
 * програми та результат їх роботи.
 * Task 2.12.2
 * 1. Відкрийте проект TestNested з завдання 2-12-1.
 * 2. Додайте до класу MyPhoneBook два загальнодоступних методи sortByName() і sortByPhoneNumber().
 * 3. За допомогою інтерфейсу Comparator та анонімного класу розробіть код у методі sortByName() для
 * сортування
 * масиву PhoneNumbers за назвою.
 * 4. За допомогою інтерфейсу Comparator та анонімного класу розробіть код у методі sortByPhoneNumber(),
 * щоб сортувати масив PhoneNumbers за номером телефона.
 * 5. Додайте до методу main() класу Main код, який створює об’єкт MyPhoneBook, і заповнює його десятьма
 * записами телефонних номерів. Додайте код для сортування телефонних номерів у телефонній книзі, викликавши
 * sortByName(), а потім викликавши метод printPhoneBook().
 */
public class Main {

    public static void main(String[] args) {
        MyPhoneBook phoneBook = new MyPhoneBook();

        phoneBook.addPhoneNumber("Саша", "+380501234567");
        phoneBook.addPhoneNumber("Вова", "+380679876543");
        phoneBook.addPhoneNumber("Iris", "+13888888888");
        phoneBook.addPhoneNumber("Natti", "+380739787545");
        phoneBook.addPhoneNumber("Ivan", "+380505535750");

        phoneBook.addPhoneNumber("Mali", "+380999999999");
        phoneBook.addPhoneNumber("John", "+380980000000");
        phoneBook.addPhoneNumber("Nancy", "+380688888888");
        phoneBook.addPhoneNumber("Olesya", "+380911111111");
        phoneBook.addPhoneNumber("Max", "+380352222222");

        phoneBook.sortByName();
        phoneBook.printPhoneBook();
    }
}