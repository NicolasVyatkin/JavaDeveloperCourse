package logestword;

/**
 * 2) Вводится строка из слов, разделенных пробелами. Найти самое длинное слово и вывести его на
 * экран.
 */

public class Main {
    public static void main(String[] args) {
        String newText = "Various Java conventions enable a data type to takes advantage";//input string
        System.out.println("String in witch you need to find the word with maximum length:\n" + newText);

        String[] words = newText.toLowerCase().split(" ");

        int maxLength = words[0].length(); //maximum length

        for (String word : words) {
            if (word.length() > maxLength) { //use < to make it search the minimum length word
                maxLength = word.length();
            }
        }

        for (String word : words) {
            if (word.length() == maxLength) {
                System.out.println("Word with maximum length - " + word);
            }
        }
    }
}