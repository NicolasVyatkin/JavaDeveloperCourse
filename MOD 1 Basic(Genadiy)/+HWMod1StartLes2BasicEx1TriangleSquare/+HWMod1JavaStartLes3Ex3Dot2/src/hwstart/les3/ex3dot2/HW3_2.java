package hwstart.les3.ex3dot2;
import java.util.Arrays;
/**
 * Class that calculates bite operations
 *
 * @author Kolin Vyatkin


 * Домашнє завдання #2 з уроку №3:
 * 1. Розробіть програму, яка виконує цілочисельні бітові операції над змінними:
 *    int a = d OR m
 *    int b = a XOR d >>> 3
 *    int c = a AND NOT d << 2
 *    int e = (a == b) ? 0 : 5
 *    де значення змінної d - залишок від цілочисельного ділення дня дати Вашого народ-ження на 16,
 *    а значення змінної m - порядковий номер місяця дати Вашого народження.
 * 2. Виконайте обнуління старших 28 бітів отриманих результатів типу int шляхом операції побітового І (AND)
 * з маскою 0xf.
 * 3. Організуйте виведення на екран значень змінних d, m, a, b, c та e в десятковій, двійковій та
 * шістнадцятковій формі.
 *    Для переведення чисел з десяткової форми до двійкової використовуйте функцію
 *    Integer.toBinaryString(int i).
 *    Для переведення чисел з десяткової форми до шістнадцяткової використовуйте функцію
 *    Integer.toHexString(int i).
 * 4. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 3) код
 * програми (у документованому коментарі класу зазначьте своє ім'я та прізвище).
 */
public class HW3_2 {
    public static void main(String[] args) {
        // п.1 Зміннa d
        int d = 11 % 16;
        System.out.println("Змінна 'd' у десятковій формі = " + d); //11
        System.out.println("Змінна 'd' у бінарній формі = " + Integer.toBinaryString(d)); //1011
        System.out.println("Змінна 'd' у шістнадцятковій формі = " + Integer.toHexString(d) + '\n'); //B
        // п.1 Зміннa m
        int m = 2;
        System.out.println("Змінна 'm' у десятковій формі = " + m); //2
        System.out.println("Змінна 'm' у бінарній формі = " + Integer.toBinaryString(m)); //10
        System.out.println("Змінна 'm' у шістнадцятковій формі = " + Integer.toHexString(m) + '\n'); //2
        //п.1 Цілочисельні бітові операції над змінними:
        //int a = d OR m;
        int a = d | m;
        System.out.println("Змінна 'a' у десятковій формі = " + a); //11
        System.out.println("Змінна 'a' у бінарній формі = " + Integer.toBinaryString(a)); //1011
        System.out.println("Змінна 'a' у шістнадцятковій формі = " + Integer.toHexString(a) + '\n'); //B
        //int b = a XOR d >>> 3;
        int b = a ^ d >>> 3;
        System.out.println("Змінна 'b' у десятковій формі = " + b); //10
        System.out.println("Змінна 'b' у бінарній формі = " + Integer.toBinaryString(b)); //1010
        System.out.println("Змінна 'b' у шістнадцятковій формі = " + Integer.toHexString(b) + '\n'); //A
        //int c = a AND NOT d << 2;
        int c = a & ~ d << 2;
        System.out.println("Змінна 'c' у десятковій формі = " + c); //0
        System.out.println("Змінна 'c' у бінарній формі = " + Integer.toBinaryString(c)); //0
        System.out.println("Змінна 'c' у шістнадцятковій формі = " + Integer.toHexString(c) + '\n'); //0
        //int e = (a == b) ? 0 : 5;
        int e = (a == b) ? 0 : 5;
        System.out.println("Змінна 'e' у десятковій формі = " + e); //5
        System.out.println("Змінна 'e' у бінарній формі = " + Integer.toBinaryString(e)); //101
        System.out.println("Змінна 'e' у шістнадцятковій формі = " + Integer.toHexString(e) + '\n'); //5
        //2. Виконайте обнуління старших 28 бітів отриманих результатів типу int шляхом операції
        // побітового І (AND)(&) з маскою 0xf(15 у шістнадцятковій системі).
        int mask = 0xf;
        System.out.println("Змінна маски у десятковій системі числення = " + mask); //15
        System.out.println("Змінна маски у десятковій системі числення = " + Integer.toHexString(mask)); //F
        int aPlusMask = a & mask; //11
        int bPlusMask = b & mask; // 10
        int cPlusMask = c & mask; // 0
        int ePlusMask = e & mask; // 5
        System.out.println("Результат обнулення старших 28 бітів маскою: a = " + aPlusMask + ", "
                + "b = " + bPlusMask + ", c = " + cPlusMask + ", e = " + ePlusMask);
    }
}
