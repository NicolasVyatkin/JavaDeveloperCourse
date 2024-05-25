package hwstart.les2.ex2dot3;

/**
 * Class that changes data type
 *
 * @author Kolin Vyatkin

 * Домашнє завдання #3 з уроку №2:
 * 1. Отримайте значення цілочисельної змінної доданням значень дня, місяця та року дати Вашого народження.
 * 2. Напишіть програму, що:
 *    а) виконує приведення отриманого у п.1 значення цілочисельної змінної до типу short та виводить результат
 *    б) виконує приведення отриманого у п.1 значення цілочисельної змінної до типу byte та виводить результат
 *    в) виводить символ, код якого дорівнює значенню, отриманому у п.1.
 * 3. Поясніть отримані результати.
 * 4. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 2) код програми
 * та скріншот документації.
 */

public class HW2_3 {

    /**
     * Start method of the class.
     *
     * @param args command line arguments
     */

    public static void main(String[] args) {

        //myVarInt:2+11+1988=2001//
        int myVarInt = 2001;
        byte myVarByte = (byte) myVarInt;
        //result = -47
        short myVarShort = (short) myVarInt;
        //result = 2001
        char myVarChar = (char) myVarInt;
        //result = ߑ

        System.out.println("Значення змінної int = " + myVarInt);
        System.out.println("Значення змінної int приведеної до типу byte = " + myVarByte);
        System.out.println("Значення змінної int приведеної до типу sort = " + myVarShort);
        System.out.println("Значення змінної int приведеної до типу char = " + myVarChar);

    }
}
