package annotationsreflaction;

public class TestClass {

    @AnnotationTest(a = 2, b = 5)
    public static void test(int a, int b) {
        System.out.println("Parameters that where taken from annotation are: " + a + " and " + b);
    }
}
