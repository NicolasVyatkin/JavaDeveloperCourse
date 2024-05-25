package com.gmail.niglasksend.progacad.hw2_2_4;

import com.gmail.niglasksend.progacad.hw2_2_4.List;

/**
 * Class that resolves the 2.2.4. task
 *
 * @author Kolin Vyatkin
 * @version 1.0
 * 1. Створіть клас “MyWindow” з полями (width (типу double), height (типу double), numberOfGlass (типу int),
 *      color (типу String), isOpen (boolean)).
 * 2. Створіть п’ять екземплярів класу MyWindow із різними значеннями полів.
 * 3. Додайте до класу MyWindow конструктор без параметрів, який буде ініціалізувати поля класу деякими
 *      значеннями за замовчуванням.
 * 4. Створіть екземпляр класу MyWindow за допомогою конструктора без параметрів.
 * 5. Додайте до класу MyWindow перевантажені конструктори, які ініціалізують поля класу, залежно від
 *      параметрів:
 * 	        MyWindow (ширина, висота),
 * 	        MyWindow (ширина, висота, кількість скла)...
 * 	        По закінченні, клас MyWindow повинен мати чотири конструктори).
 * 6. Додайте до класу MyWindow метод “printFields”, який виводить на екран значення усіх полів.
 * 7. Напишіть клас з методом main, у якому створіть масив для п'яти об'єктів MyWindow і заповніть його,
 *      створивши об’єкти MyWindow за допомогою різних конструкторів. Викличте метод “printFields” для кожного
 *      елемента масиву.
 */
public class Main {
    public static void main(String[] args) {

        MyWindow myWindow1 = new MyWindow(10.5,5.25,3,"green",true);
        MyWindow myWindow2 = new MyWindow(12.5,6.3,3,"white",true);
        MyWindow myWindow3 = new MyWindow(8.5,3.3,2,"red",false);
        MyWindow myWindow4 = new MyWindow(6.5,2.8,2,"yellow",true);
        MyWindow myWindow5 = new MyWindow(11.4,6.3,4,"black",false);

        final List myWindows = new List(new String[]{});

        myWindows.addWindow(myWindow1);
        myWindows.addWindow(myWindow2);
        myWindows.addWindow(myWindow3);
        myWindows.addWindow(myWindow4);
        myWindows.addWindow(myWindow5);

        myWindows.printFields();
        System.out.println();
    }
}