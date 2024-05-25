package hwjavastart.les4.ex4dot1basic;
import java.util.Scanner;
/**
 *
 * @author  Kolin Vyatkin
 * @version 3.0
 */
public class SicleEnhancedSwitch  {
    /**
     *
     * @param args line command arguments
     */
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();
        String numberName;
        numberName = switch (number) {
            case 1 -> "One";
            case 2 ->  "Two";
            case 3 ->  "Three";
            case 4 ->  "Four";
            case 5 ->  "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 ->  "Eight";
            case 9 ->  "Nine";
            default ->  "Other";
        };
        System.out.println(numberName);
    }
}