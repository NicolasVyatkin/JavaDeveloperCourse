package hwoop.basic.one;
/**
 * @author Kolin Vyatkin
    * Задание для самостоятельной проработки.
    * Основной уровень.
    * 1) Создать класс Animal.
    *   У него должны быть поля:
            * ● String ration (чем питается животное)
            * ● String color (какого оно цвета)
            * ● int weight (вес)
        *  Методы:
            * ● Стандартные (методы получения и установки, toString() и т. д.)
            * ● String getVoice() (подать голос)
            * ● void eat() (есть)
            * ● void sleep() (спать)
    * 2) Создать классы Cat, Dog как подклассы Animal. Добавьте новое поле String name. Переопределите методы
        * getVoice(), eat(), sleep().
    * 3) Создайте класс Veterinarian.
        *  Поля:
            * ● String name
            *  Методы:
            * ● Стандартные
            * ● void treatment(Animal animal) (Лечение животного. Лечить можно и кошек и собак)
 */
public class Main {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian("Stepan Gzhitskyi");
        Cat catOne = new Cat("tasty fish", "green", 8, "Emerald");
        Dog dogOne = new Dog("dog food", "chocolate", 12, "Zeya");

        System.out.println("Cat:");
        System.out.println(catOne);
        catOne.sleep();
        catOne.eat();
        System.out.println("Dog:");
        System.out.println(dogOne);
        dogOne.sleep();
        dogOne.eat();
        System.out.println("Treatment:");

        veterinarian.treatment(dogOne);
        veterinarian.treatment(catOne);

    }
}