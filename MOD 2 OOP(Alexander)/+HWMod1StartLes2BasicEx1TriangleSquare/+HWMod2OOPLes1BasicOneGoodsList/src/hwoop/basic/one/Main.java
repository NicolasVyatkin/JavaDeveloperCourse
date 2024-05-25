package hwoop.basic.one;
/**
 * @author Kolin Vyatkin
 */

public class Main {
    public static void main(String[] args) {
        /*
            1) Создайте пользовательский класс для описания товара (предположим, это задел для
        интернет-магазина). В качестве свойств товара можете использовать значение цены,
        описание, вес товара. Создайте пару экземпляров вашего класса и протестируйте их
        работу.
         */

        Goods[] goodsList = {
                new Goods(2500.33, 3.75, "IBM laptop"),
                new Goods(3333.33, 5.12, "BQ laptop"),
                new Goods(4333.33, 3.12, "Asus laptop")
        };
        for (Goods device : goodsList) {
            System.out.println(device);
        }
    }
}



