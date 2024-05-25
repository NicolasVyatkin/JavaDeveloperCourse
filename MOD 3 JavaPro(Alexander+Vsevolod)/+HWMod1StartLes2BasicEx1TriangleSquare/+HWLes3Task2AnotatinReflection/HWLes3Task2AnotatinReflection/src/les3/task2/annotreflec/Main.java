package les3.task2.annotreflec;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
*2. Написать класс TextContainer, который содержит в себе строку. С помощью механизма
*        аннотаций указать 1) в какой файл должен сохраниться текст 2) метод, который выполнит
*        сохранение. Написать класс Saver, который сохранит поле класса TextContainer в указанный
*        файл.
*@SaveTo(path=“c:\\file.txt”)
*class Container {
*    String text = “…”;
*    @Saver
*    public void save(..) {…}
*}
*/

public class Main {
    public static void main(String[] args) {
        TextContainer textContainer = new TextContainer();
        Class<?> cls = textContainer.getClass();
        SaveTo saveTo = cls.getAnnotation(SaveTo.class);
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Saver.class)) {
                try {
                    method.invoke(textContainer, saveTo.path());
                    System.out.println("FileWriter finished operation successfully");
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}