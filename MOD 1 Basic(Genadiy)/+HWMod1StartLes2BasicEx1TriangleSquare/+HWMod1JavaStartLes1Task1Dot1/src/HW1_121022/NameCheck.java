package HW1_121022;
import java.util.Scanner;
/**
 * Programm that print a sting
 * @author Kolin Vyatkin

        * Домашнє завдання з уроку №1:
             * 1.Встановіть JDK.
             * 2. Налаштуйте змінні оточення JAVA_HOME та PATH.
             * 3. Перевірте роботу java та javac.
             * 4. Встановіть IntelliJ IDEA.
             * 5. Напишіть програму, що:
             *     а) виводить на екран Ваше прізвище, ім'я та по-батькові,
             *     б) забезпечує введення рядка (нехай це буде Ваше прізвище, ім'я
             *        та по-батькові) з клавіатури і виводить на екран.
             * 6. Додайте документовані коментарі для класу (включаючи теги автора та версії) та методу
                * (включаючи тег аргументів) і згенеруйте документацію.
             * 7. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 1)
                * код програми та скріншот документації.
 */
public class NameCheck {
    public static void main(String[] args){
    System.out.println("Доброго дня Вяткін Микола Олександрович");

    System.out.println("Підтвердіть, будь ласка, Ваше П.І.Б.");
    Scanner typeInfo = new Scanner(System.in);
    String userName = typeInfo.nextLine();
    System.out.println("Ваше П.І.Б. - " + userName);
}
}