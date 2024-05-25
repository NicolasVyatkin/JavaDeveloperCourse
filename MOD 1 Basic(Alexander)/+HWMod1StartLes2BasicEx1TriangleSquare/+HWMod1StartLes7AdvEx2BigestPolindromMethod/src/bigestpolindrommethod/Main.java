package bigestpolindrommethod;
/**
 *Число-палиндром с обеих сторон (справа налево и слева направо) читается одинаково. Самое
 * большое число-палиндром, полученное умножением двух двузначных чисел – 9009 = 91 × 99.
 * Найдите самый большой палиндром, полученный умножением двух трехзначных чисел.
 *
 */


public class Main {
    public static void main(String[] args) {
        int palindromMax = 0;
        int a = 0;
        int b = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                if (palindromTest(i * j) && (palindromMax < i * j)) {
                    palindromMax = i * j;
                    a = j;
                    b = i;
                }
            }
        }
        System.out.println("The bigest polindrom of numbers " + a + " and " + b + " multiplication is - " + palindromMax);
    }

    static boolean palindromTest(int number) {
        boolean result = false;
        String strReverse = "";
        String str = Integer.toString(number);
        if (str.length() == 6) {
            strReverse = new StringBuffer(str).reverse().toString();
            if (str.equals(strReverse)) {
                result = true;
            }
        }
        return result;
    }
}