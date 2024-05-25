package hwoop.adv.one;

public class TextTransformer {
    private String transformer;

    public TextTransformer(String transformer) {
        this.transformer = transformer;
    }

    public TextTransformer() {
    }

    public String textTransform(String text) {
        System.out.println("Введённый текст в верхнем регистре: " + text.toUpperCase());
        return text.toUpperCase();
    }

    public String getTransformer() {
        return transformer;
    }

    public void setTransformer(String transformer) {
        this.transformer = transformer;
    }

    @Override
    public String toString() {
        return "TextTransformer{" +
                "transformer='" + transformer + '\'' +
                "to upper case = " + transformer.toUpperCase();

    }
}
