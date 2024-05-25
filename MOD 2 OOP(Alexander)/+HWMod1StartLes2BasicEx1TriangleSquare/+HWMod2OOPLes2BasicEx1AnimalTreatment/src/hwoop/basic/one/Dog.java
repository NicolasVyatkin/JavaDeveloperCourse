package hwoop.basic.one;

public class Dog extends Animal {
    private String name;

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {

        return "bow-wow";
    }

    public void eat() {
        System.out.println("She eats " + this.getRation());
    }

    public void sleep() {
        System.out.println("She sleeps when the owner gave the command");
    }

    @Override
    public String toString() {
        return "This is a dog, her name is " + name +
                ", her color is " + getColor() +
                ", her waigth is " + getWeight() +
                ", then I call her she says " + getVoice();
    }
}
