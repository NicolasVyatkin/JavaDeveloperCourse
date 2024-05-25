package hwoop.adv.one;

public class UpDownTransformer extends TextTransformer {
    public UpDownTransformer(String transformer) {
        super(transformer);
    }

    public UpDownTransformer() {
    }

    public String textTransform(String text) {

        char[] array = text.toCharArray();

        String result = "";
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (i % 2 != 1) {
                array[i] = Character.toUpperCase(c);
            } else {
                array[i] = Character.toLowerCase(c);
            }
            result = result + array[i];
        }
        return result;
    }

    @Override
    public String toString() {
        return "Новый текстовый забор: " + textTransform(getTransformer());
    }

}
