package acad.prog.testmap;
/**
 * Homework 2.15.6 *
 * @author Kolin Vyatkin
 * @version 1.0
 * 1. Створіть новий проект під назвою TestMap. Додайте пакет acad.prog.testmap.
 * 2. Створіть клас MyTranslator із приватним полем dictionary типу HashMap<String,String>.
 * 3. Додайте метод addNewWord(String en, String uk), який додає до "словника" нове слово двома мовами.
 * 4. Додайте метод translate(String en), який приймає деякий рядок англійською мовою та повертає цей текст,
 * перекладений на українську мову.
 * 5. Створіть клас Main з методом main(), у коді якого створіть екземпляр MyTranslator. Додайте код для
 * заповнення MyTranslator кількома парами слів en-uk, викликавши метод addNewWord.
 * Наприклад:
 * "cat", "кіт"
 * "mouse", "мишу"
 * …
 * 6. Додайте код для читання рядка з консолі, який передається до методу перекладу. Додайте код для
 * виведення результату методу перекладу на консоль.
 * 7. Виконайте програму. Введіть рядок, що містить введені до словника слова, англійською мовою.
 * Результат програми повинен бути таким, як у наступному прикладі:
 * cat caught mouse
 * кіт зловив мишу
 * 8. Зазначте у документованому коментарі класів номер завдання, своє ім'я та прізвище.
 * 9. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 20) лістинги
 * коду програми та результат їх роботи.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyTranslator dic = new MyTranslator();
        dic.addNewWord("red", "червоний");
        dic.addNewWord("yellow", "жовтий");
        dic.addNewWord("violet", "фіолетовий");
        dic.addNewWord("green", "зелений");
        dic.addNewWord("orange", "помаранчевий");
        System.out.print("Enter the word you look for: ");
        Scanner wordEntry = new Scanner(System.in);
        String word = wordEntry.nextLine();
        System.out.println("Translation of " + word + " is: " + dic.translate(word) );
        System.out.print("Enter your sentence: ");
        Scanner sentence = new Scanner(System.in);
        String sent = sentence.nextLine();
        System.out.println("Your sentence: " + dic.translateSentence(sent));
    }
}