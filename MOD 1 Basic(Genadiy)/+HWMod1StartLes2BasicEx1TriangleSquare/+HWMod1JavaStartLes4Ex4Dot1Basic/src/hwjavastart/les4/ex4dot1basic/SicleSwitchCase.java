package hwjavastart.les4.ex4dot1basic;
import java.util.Scanner;
/**
 * @author  Kolin Vyatkin
 * @version 2.0
 */
public class SicleSwitchCase {
    /**
     *
     * @param args line command arguments
     */
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();
        String numberName;
        switch(number) {
            case 1: numberName = "One";
                break;
            case 2: numberName = "Two";
                break;
            case 3: numberName = "Three";
                break;
            case 4: numberName = "Four";
                break;
            case 5: numberName = "Five";
                break;
            case 6: numberName = "Six";
                break;
            case 7: numberName = "Seven";
                break;
            case 8: numberName = "Eight";
                break;
            case 9: numberName = "Nine";
                break;
            default: numberName = "Other";
                break;
        }
        System.out.println(numberName);
    }
}