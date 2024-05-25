package hwoop.basic.one;

public class Veterinarian {
    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public Veterinarian() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void treatment(Animal animal) {
        if (animal.getClass().equals(Cat.class)) {
            System.out.println("Veterinarian " + this.getName() + " can heal your cat");
        } else if (animal.getClass().equals(Dog.class)) {
            System.out.println("Veterinarian " + this.getName() + " can heal your dog");
        } else System.out.println("This animal out of the competition of the doctor");

    }
}
//    @Override
//    public String toString() {
//        return "Veterinarian " + name +
//                " will heal";
//    }

//    public void treatment(Animal animalOne){
//
//        if (animalOne.getClass().equals(Cat.class)){
//            animalOne = (Cat) catOne;
//            System.out.println("Veterinarian " + veterinarian.getName() + " will heal " + catOne.getName()+" if it got ill.");
//        }else System.out.println("((");
//    }
