package acad.prog.testgenerics;

/**
 * @author Kolin Vyatkin
 * Task 2.14.3
 * 1. Відкрийте проект під назвою TestGenerics.
 * 2. Додайте до пакету acad.prog.testgenerics узагальнений клас MyMixer із полем-масивом для елементів
 * змінного типу та конструктором, який задає цей масив значенням масиву-параметру.
 * 3. Додайте до класу MyMixer звичайний метод shuffle(), який перемішує елементи масиву та повертає йогою
 * 4. Додайте до методу main класу Main код, який створює два масиви різних типів:
 * Перший — це масив цілих чисел зі значеннями {1,2,3,4,5,6,7,8,9}
 * Другий — це масив рядків: {"один","два", …}.
 * 5. Створіть два об’єкти типу MyMixer і використовуючи кожен із масивів, викличте метод shuffle() і
 * виведіть результат на консоль.
 * 6. Виконайте програму.
 *    Приклад виведення програми:
 *    [6,7,4,3,2,9,1,5,8]
 *    ["дев'ять", "один", "два", "п'ять",…]
 * 7. Зазначте у документованому коментарі класів номер завдання, своє ім'я та прізвище.
 * 8. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 18) лістинги
 * коду програми та результат їх роботи.
 * */


import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MyMixer<T> {
    T[] tArray;

    public MyMixer(T[] tArray) {
        this.tArray = tArray;
    }

    @Override
    public String toString() {
        return "MyMixer{" +
                "tArray=" + Arrays.toString(tArray) +
                '}';
    }

    public T[] shuffle(){

        List<T> res = Arrays.asList(this.tArray);
        Collections.shuffle(res);

        for (int i = 0; i < res.size(); i++) {
            tArray[i] = res.get(i);
        }

        return this.tArray;
    }
}
