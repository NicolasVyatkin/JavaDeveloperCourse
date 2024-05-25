import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Luska", 8);
        Cat cat2 = new Cat("Luska", 8);

        System.out.println(cat1.toString());
        System.out.println(cat2.toString());

        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));

        System.out.println("=====================================");

        Cat cat3 = null;
        try {
            cat3 = cat1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(cat3);
        //checking objects
        System.out.println(cat3!=cat1);//two unconnected objects
        System.out.println(cat3.getClass());//objects should be with the same class
        System.out.println(cat1.getClass());//objects should be with the same class
        System.out.println(cat3.equals(cat1));//objects must equal
        System.out.println("=====================================");

        // getClass method

        Class catClass = cat1.getClass();
        Field[] catFields = catClass.getDeclaredFields();
        for ( int i = 0; i < catFields. length; i++) {
            System. out.println( catFields[ i]);
        }

        //changing age field thrue the tru-catch

        //REFLEXY methods for data bases and lableries

        try {
            Field catAge = catClass.getDeclaredField( "age" );
            catAge.setAccessible( true);
            catAge.setInt( cat1, 18);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(cat1);
    }
}