package hwjavastart.les4.ex4dot1basic;
/**
 * task 4.2
 * @author  Kolin Vyatkin
 * @version 1.0
 */
public class SicleFor {
    /**
     * start
     *
     * @param args line command arguments
     */
    public static void main(String[] args) {
        String result = "";
        for (int i=1; i<9; i++) {
            result = String.valueOf(i) + " " + result;
            System.out.println(result);
        }
    }
}