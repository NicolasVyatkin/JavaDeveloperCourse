package annotationsreflaction;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
*1. Создать аннотацию, которая принимает параметры для метода. Написать код, который
*        вызовет метод, помеченный этой аннотацией, и передаст параметры аннотации в
*        вызываемый метод.
*@Test(a=2, b=5
*public void test(int a, int b) {…}
 */





public class Main {
    public static void main(String[] args) {
        Class<?> cls = TestClass.class;

        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(AnnotationTest.class)) {
                AnnotationTest test = method.getAnnotation(AnnotationTest.class);
                try {
                    method.invoke(cls, test.a(), test.b());
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}