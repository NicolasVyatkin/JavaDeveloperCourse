package hwoop.basic.one;

public class Goods {
    protected double price;
    protected double weigth;
    protected String name;

    public Goods(double price, double weigth, String name) {
        this.price = price;
        this.weigth = weigth;
        this.name = name;
    }

    public Goods() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "price=" + price +
                ", weigth=" + weigth +
                ", name='" + name + '\'' +
                '}';
    }
}
