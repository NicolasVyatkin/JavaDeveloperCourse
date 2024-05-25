package hwoop.adv.one;

public class InverseTransformer extends TextTransformer{
    public InverseTransformer(String transformer) {
        super(transformer);
    }

    public InverseTransformer() {
    }
    public String textTransform(String text) {
        char[] array = text.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }

    @Override
    public String toString() {
        return "Введённый текст в реверсированной форме: "+textTransform(getTransformer());
    }
}
