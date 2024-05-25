package printpi;

/**
 *3) Выведите на экран 10 строк со значением числа Пи. Причем в первой строке должно быть 2 знака
 * после запятой, во второй 3, в третьей 4 и т. д.
 * */

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            String printPI = String. format(i+". PI number with "+(i+1)+" numbers after coma is: %."+(i+1)+"f", Math.PI);
            System. out.println( printPI);

        }

    }
}