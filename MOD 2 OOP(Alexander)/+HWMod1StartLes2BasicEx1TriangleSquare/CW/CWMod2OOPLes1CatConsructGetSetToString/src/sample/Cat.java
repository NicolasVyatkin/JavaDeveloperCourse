package sample;

public class Cat {
    String name;
    int weight;
    String color;

    public Cat(String name, int weight, String color) {
        super();
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public Cat() {
        super();
    }

    public String meow() {
        return "meow meow";
    }

    public void jump() {
        System.out.println("hop");
    }

    public String toString() {
        return "Cat [name=" + name + ", weight=" + weight + ", color=" + color + "]";
    }
}
