package acad.prog.testcollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 2.15.2
 *
 * @author Kolin Vyatkin
 * 1. Додайте до проекту TestCollection узагальнений клас ArrayBox, який інкапсулює список елементів
 * довільного числового типу та має конструктор, що приймає як параметри розмір списку та рядок-назву
 * типу елементів масиву.
 * 2. Конструктор повинен заповнювати список елементами відповідного типу з випадковими позитивними та
 * негативними значеннями. У разі, якщо параметр назва типу заданий неправильним, метод повинен генерувати
 * IllegalArgumentException з відповідним повідомленням.
 * 3. Додайте до класу ArrayBox метод, що повертає список з елементами списку-поля класу із позитивними
 * значеннями.
 * 4. Додайте до методу main() класу Main код, що створює об'єкти класу ArrayBox і перевіряє роботу метода
 * відбору позитивних значень для списків:
 * - Byte з розміром списку 7 елементів.
 * - Integer з розміром списку 6 елементів.
 * - Float з розміром списку 5 елементів.
 * 5. Виконайте програму.
 */
public class ArrayBox<E extends Number> {
    private List<E> numberList;

    public ArrayBox() {
    }

    public ArrayBox(int size, String typeName) {
        Random rnd = new Random();
        switch (typeName.toLowerCase()) {
            case "byte" -> {
                List<Byte> byteList = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    byteList.add(i, (byte) (Math.random() * Math.pow(2, 8) - Math.pow(2, 8) / 2));
                }
                this.numberList = (List<E>) new ArrayList<Byte>(byteList);
            }
            case "short" -> {
                List<Short> shortList = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    shortList.add(i, (short) (Math.random() * Math.pow(2, 16) - Math.pow(2, 16) / 2));
                }
                this.numberList = (List<E>) new ArrayList<Short>(shortList);
            }
            case "integer" -> {
                List<Integer> intList = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    intList.add(i, (int) (Math.random() * Math.pow(2, 32) - Math.pow(2, 32) / 2));
                }
                this.numberList = (List<E>) new ArrayList<Integer>(intList);
            }
            case "long" -> {
                List<Long> longList = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    longList.add(i, (long) (Math.random() * Math.pow(2, 64) - Math.pow(2, 64) / 2));
                }
                this.numberList = (List<E>) new ArrayList<Long>(longList);
            }
            case "float" -> {
                List<Float> floatList = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    floatList.add(i, Float.intBitsToFloat(rnd.nextInt()));
                }
                this.numberList = (List<E>) new ArrayList<Float>(floatList);
            }
            case "double" -> {
                List<Double> doubleList = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    doubleList.add(i, Double.longBitsToDouble(rnd.nextLong()));
                }
                this.numberList = (List<E>) new ArrayList<Double>(doubleList);
            }
            default -> throw new IllegalArgumentException("Wrong Type-Name");
        }
    }

    public List<E> positiveElements() {
        List<E> positiveList = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i).doubleValue() > 0) {
                positiveList.add(numberList.get(i));
            }
        }
        return positiveList;
    }

    public List<E> getNumberList() {
        return numberList;
    }

    public void setNumberList(List<E> numberList) {
        this.numberList = numberList;
    }

    @Override
    public String toString() {
        return "ArrayBox{" +
                "numberList=" + numberList +
                '}';
    }
}