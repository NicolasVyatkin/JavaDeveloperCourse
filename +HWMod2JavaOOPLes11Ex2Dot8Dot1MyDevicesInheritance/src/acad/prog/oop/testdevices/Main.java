package acad.prog.oop.testdevices;
/**
 * Class that compairs the objects and print the result
 * Task 2.8.1
 * @author Kolin Vyatkin
 * @version 1.0
 * 1. Створіть новий проект під назвою MyDevices. Додайте пакет acad.prog.oop.testdevices.
 * 2. Створіть базовий клас Device з полями manufacturer(String), price(float), serialNumber(String)) та
 *      конструктором,  що буде приймати відповідні параметри.
 * 3. Створіть підкласи Monitor з полями resolutionX(int), resolutionY(int) та EthernetAdapter з полями
 *      speed (int), mac (String)   та з відповідними параметризованими конструкторами.
 * 4. Виконайте інкапсуляцію полів базового класу та підкласів.
 * 5. Перевизначте метод toString у кожному класі так, щоб він повертав назву класу та значення полів.
 * 6. Перевизначте методи equals та hashcode так, щоб вони враховували поля класів (для підкласів - також
 *      поля базового класу).
 * 7. Додайте клас Main з методом main, у якому створіть масив з трьома моніторами та трьома адаптерами.
 *      Для кожного типу пристроїв    два з них повинні мати однакові значення полів, а один - відмінні.
 * 8. Виконайте перевірку та виведення у циклі результатів порівняння адрес та вмісту сусідніх елементів
 *      масиву. Виведення повинно бути у вигляді:
 *          "назва_об'єкту_i (виведена toString) - назва_об'єкту_i+1 (виведена toString), адреси співпадають:
 *          true_або_false,  об'єкти дорівнюють один одному: true_або_false".
 */
public class Main {
    public static void main(String[] args) {
        Device[] deviceList = {
                new Monitor("IBM", 2010.55f, "1255", 1366, 768),
                new Monitor("IBM", 2010.55f, "1255", 1366, 768),
                new Monitor("Benq", 100.25f, "2516", 800, 600),
                new EthernetAdapter("IBM", 700.15f, "1254", 100, "157.54.0"),
                new EthernetAdapter("IBM", 700.15f, "1254", 100, "157.54.0"),
                new EthernetAdapter("Benq", 500.74f, "2515", 75, "100.20.0")
        };
        for (Device vasya : deviceList) {
            System.out.println(vasya);
        }

        System.out.println("адреси співпадають: ");
        for (int i = 0; i < deviceList.length - 1; i++) {

            boolean stringEqual;
            if (deviceList[i].hashCode() == deviceList[i + 1].hashCode()) {
                stringEqual = true;
                System.out.println("адреса об'єкта " + deviceList[i] + "\n співпадає з об'єктом " + deviceList[i + 1] + ":" + stringEqual);
            } else {
                stringEqual = false;
                System.out.println("адреса об'єкта " + deviceList[i] + "\n співпадає з об'єктом " + deviceList[i + 1] + ":" + stringEqual);
            }

        }
        System.out.println("об'єкти дорівнюють один одному: ");
        for (int i = 0; i < deviceList.length - 1; i++) {

            boolean stringRov;
            if (deviceList[i].equals(deviceList[i + 1])) {
                stringRov = true;
                System.out.println("об'єкт" + deviceList[i] +"\n дорівнює об'єкту " + deviceList[i + 1]+": " + stringRov);
            } else {
                stringRov = false;
                System.out.println("об'єкт" + deviceList[i] +"\n дорівнює об'єкту " + deviceList[i + 1]+": " + stringRov);
            }
        }
    }
}