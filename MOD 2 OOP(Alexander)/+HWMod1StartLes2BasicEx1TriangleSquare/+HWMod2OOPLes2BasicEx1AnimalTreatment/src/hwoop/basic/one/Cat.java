package hwoop.basic.one;

public class Cat extends Animal {
    private String name;

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {

        return "mio-mio";
    }

    public void eat() {
        System.out.println("He eats " + this.getRation());
    }

    public void sleep() {
        System.out.println("He sleeps every time then I'm not looking at him");
    }

    @Override
    public String toString() {
        return "This is a cat, his name is " + name +
                ", his color is " + getColor() +
                ", his waigth is " + getWeight() +
                ", then I call him he says " + getVoice();

    }

}
