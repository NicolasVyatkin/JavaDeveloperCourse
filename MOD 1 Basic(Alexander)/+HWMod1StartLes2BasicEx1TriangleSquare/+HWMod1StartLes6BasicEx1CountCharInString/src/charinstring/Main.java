package charinstring;

import java.util.Scanner;

/**
 * 1) Считайте строку текста с клавиатуры. Подсчитайте сколько раз в нем встречается символ «b».
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Input some text from keyboard: ");
//        String newText = sc.next();
        String newText = "Various Java conventions enable a data type to take advantage of\n" +
                "built-in language mechanisms by including specific methods in the API. \n" +
                "For example, all Java data types inherit a toString()  method that returns \n" +
                "a String representation of the data-type values. Java calls this method when\n" +
                "any data-type value is to be concatenated with a String value with the + operator.\n";
        System.out.println(newText);

        int bCounter=0;
        String b = "b";
        char[] symbols = newText.toLowerCase().toCharArray();
        System.out.println(symbols);
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i]==b.toCharArray()[0]){
                bCounter+=1;
            }
        }
        System.out.println("Counter is "+bCounter);
    }
}