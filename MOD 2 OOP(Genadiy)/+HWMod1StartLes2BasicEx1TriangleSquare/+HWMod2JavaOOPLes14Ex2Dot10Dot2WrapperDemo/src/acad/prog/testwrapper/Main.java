package acad.prog.testwrapper;

/**
 * In the class, objects of type Integer are created in different ways and compared with each other
 * homework 2.10.2
 * @author Kolin Vyatkin
 * 1. Створіть новий проект під назвою WrapperDemo. Додайте до нього пакет acad.prog.testwrapper.
 * 2. Створіть клас Main з методом main, у якому оголосіть декілька локальних змінних xN класу Integer
 * та ініціалізуйте їх однаковим значенням (менше 128), але різними способами:
 * - заданням значення-літерала;
 * - заданням значення через параметр конструктора;
 * - заданням значення через параметр метода valueOf;
 * - заданням значення парсингом рядка з відповідними цифровими символами.
 * 3. Порівняйте ці змінні кожну з кожною за допомогою == та метода equals і виведіть результат на консоль.
 * 4. Оголосіть локальні змінні такими ж способами, але для значення більше 128 і порівняйте їх кожну з
 * кожною за допомогою == та метода equals і виведіть результат на консоль.
 * 5. Порівняйте результати та зробіть висновки.
 * 6. Зазначте у документованому коментарі класу номер завдання, своє ім'я та прізвище, а також висновки
 * з результатів порівняння змінних Integer, стоврених різними способами, для різних значень цих змінних.
 * 7. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 14) лістинги коду
 * програм та результат їх роботи.
 */
public class Main {

    public static void main(String[] args) {

        Integer x1 = (int) (Math.random() * 128);
        Integer x2 = new Integer(x1);
        Integer x3 = Integer.valueOf(x1);
        Integer x4 = Integer.parseInt(x1.toString());

        System.out.println("number till 128:");

        System.out.println("літерал == конструктор      | " + (x1 == x2));
        System.out.println("літерал.equals(конструктор) | " + x1.equals(x2) + "\n");

        System.out.println("літерал == valueOf      | " + (x1 == x3));
        System.out.println("літерал.equals(valueOf) | " + x1.equals(x3) + "\n");

        System.out.println("літерал == парсинг      | " + (x1 == x4));
        System.out.println("літерал.equals(парсинг) | " + x1.equals(x4) + "\n");

        System.out.println("конструктор == valueOf      | " + (x2 == x3));
        System.out.println("конструктор.equals(valueOf) | " + x2.equals(x3) + "\n");

        System.out.println("конструктор == парсинг      | " + (x2 == x4));
        System.out.println("конструктор.equals(парсинг) | " + x2.equals(x4) + "\n");

        System.out.println("valueOf == парсинг      | " + (x3 == x4));
        System.out.println("valueOf.equals(парсинг) | " + x3.equals(x4) + "\n");

//          При створенні об'єкту числа, яке менше 128, через літерал, парсинг або метод valueOf(),
//      він кешується шляхом присвоєння однакового посилання на об'єкт для різних змінних.
//          Об'єкти чисел створені через конструктор, будуть унікальні - посилання будуть різними.
//      Такі об'єкти варто порівнювати через метод equals()

        Integer y1 = (int) ((Math.random() * 128) + 128);
        Integer y2 = new Integer(x1);
        Integer y3 = Integer.valueOf(x1);
        Integer y4 = Integer.parseInt(x1.toString());

        System.out.println("number more than 128:");

        System.out.println("літерал == конструктор      | " + (y1 == y2));
        System.out.println("літерал.equals(конструктор) | " + y1.equals(y2) + "\n");

        System.out.println("літерал == valueOf      | " + (y1 == y3));
        System.out.println("літерал.equals(valueOf) | " + y1.equals(y3) + "\n");

        System.out.println("літерал == парсинг      | " + (y1 == y4));
        System.out.println("літерал.equals(парсинг) | " + y1.equals(y4) + "\n");

        System.out.println("конструктор == valueOf      | " + (y2 == y3));
        System.out.println("конструктор.equals(valueOf) | " + y2.equals(y3) + "\n");

        System.out.println("конструктор == парсинг      | " + (y2 == y4));
        System.out.println("конструктор.equals(парсинг) | " + y2.equals(y4) + "\n");

        System.out.println("valueOf == парсинг      | " + (y3 == y4));
        System.out.println("valueOf.equals(парсинг) | " + y3.equals(y4) + "\n");

//      Для чисел >= 128 кешування не застосовується, окрім використання valueOf() та парсингу числа із строки
    }
}