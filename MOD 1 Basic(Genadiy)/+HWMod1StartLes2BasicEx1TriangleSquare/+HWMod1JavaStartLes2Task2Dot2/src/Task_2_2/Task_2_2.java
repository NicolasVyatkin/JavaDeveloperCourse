package Task_2_2;

/* Практичне завдання 2.1*/

/**
 * @author Kolin Vyatkin

     * Домашнє завдання #2 з уроку №2:
         * 1. Напишіть програму, що:
         *     а) оголошує змінні усіх примітивних типів з довільними значеннями,
         *     б) вмводить на екран ім'я та значення кожної змінної відповідного типу..
         * 2. Додайте документовані коментарі для класу (включаючи теги автора та версії)
         * та методу (включаючи тег аргументів) і згенеруйте документацію.
         * 3. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 2)
         * код програми та скрнішот документації.
 */

public class Task_2_2 {

    /**
     * @param args arguments
     */

    public static void main(String[] args) {

        byte byte_type = 13;
        short short_type = 1984;
        int int_type = 20041102;
        long long_type = 1010945687;
        float float_type = (float) Math.random() * 99;
        double double_type = Math.random() * 99;
        char char_type = 8482;
        boolean boolean_type = true;

        System.out.println("Значення змінної byte: " + byte_type);
        System.out.println("Значення змінної short: " + short_type);
        System.out.println("Значення змінної int: " + int_type);
        System.out.println("Значення змінної long: " + long_type);
        System.out.println("Значення змінної float: " + float_type);
        System.out.println("Значення змінної double: " + double_type);
        System.out.println("Значення змінної char: " + char_type);
        System.out.println("Значення змінної boolean: " + boolean_type);
    }
}