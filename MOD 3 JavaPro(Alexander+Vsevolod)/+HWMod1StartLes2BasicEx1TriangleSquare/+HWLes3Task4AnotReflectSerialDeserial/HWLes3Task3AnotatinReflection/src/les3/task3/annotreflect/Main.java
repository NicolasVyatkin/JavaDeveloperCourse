package les3.task3.annotreflect;

/*
* 3. Написать код, который сериализирует и десериализирует в/из файла все значения полей
класса, которые отмечены аннотацией @Save.
*
* */

public class Main {
    public static void main(String[] args) {
        SourceClass sourceClass = new SourceClass();
        String serialize = null;
        try {
            serialize = Serializer.serialize(sourceClass);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("Serialized: " + serialize);

        try {
            sourceClass = Serializer.deserialize(serialize, SourceClass.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Deserialized: " + sourceClass.getS1() + " " + sourceClass.getI1() + " " + sourceClass.getD1());

    }
}