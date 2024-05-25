package sample;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Cat cat1 = new Cat();
        cat1.name = "Barsic";
        cat1.color = "Black";
        cat1.weight = 4;

        Cat cat2 = new Cat("Tichon", 6, "White");

//    cat2.name = "Tichon";
//    cat2.color = "White";
//    cat2.weight = 6;

        Cat cat3 = cat1;

        System.out.println(cat1);
        System.out.println(cat2);

        System.out.println(cat1.meow());
        cat1.jump();

    }

}