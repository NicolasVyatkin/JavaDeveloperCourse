package acad.prog.testthread;
/**
 * task 2.17.2
 * 1. Відкрийте проект під назвою TestThread. Додайте до пакету acad.prog.testthread клас MySumCount, який
 * розширює клас Thread.
 * 2. Додайте до класу MySumCount два цілочисельних поля startIndex і stopIndex із сетерами та гетерами.
 * 3. Додайте до класу MySumCount поле - масив цілого типу та сетер для нього.
 * 4. Додайте до класу MySumCount поле resultSum типу long та геттер для нього.
 * 5. Перевизначте метод run() MySumCount. Додайте код для обчислення суми елементів масиву від startIndex
 * до stopIndex і збережіть результат у полі resultSum.
 * 6. Створіть клас Main з методом main, який оголошує локальну змінну myArray як масив цілого типу
 * (розміром 1000) і заповнює елементи масиву значеннями їх індексу.
 * 7. Створіть два екземпляри MySumCount.
 * 8. Додайте код для обчислення суми елементів myArray у двох окремих потоках - перший повинен обчислювати
 * елементи за індексами від 0 (включно) до 500 (виключно), другий - елементи за індексами від 500 (включно)
 * до 1000 (виключно), та виведіть суму елементів, що розраховується кожним з потоків, та загальну суму
 * на консоль.
 * 9. Виконайте програму.
 * 10. Зазначте у документованому коментарі класів номер завдання, своє ім'я та прізвище.
 * 11. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 22) лістинги коду
 * програми та результат їх роботи.
 * */

public class MySumCount extends Thread {
    int startIndex;
    int stopIndex;
    int[] myArray;
    long resultSum;
    public int getStartIndex() {
        return startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    public long getResultSum() {
        return resultSum;
    }

    @Override
    public void run(){
        for (int i = startIndex; i <stopIndex ; i++) {
            resultSum += myArray[i];
        }
        System.out.println("Sum of arr elements from [" + getStartIndex() + " to " + getStopIndex() + ") indexes: " + getResultSum());
    }
}