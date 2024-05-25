package acad.prog.testmap;


import java.util.Arrays;
import java.util.HashMap;

public class MyTranslator {
    HashMap<String, String> dictionary;

    public MyTranslator() {
        this.dictionary = new HashMap<String, String>();
    }

    public void addNewWord(String en, String uk) {
        this.dictionary.put(en, uk);
    }

    public String translate(String en) { //переклад окремого слова

        if (this.dictionary.containsKey(en)) {
            return this.dictionary.get(en);
        } else {
            return "Word " + en + " not found!";
        }
    }

    public String translateSentence(String en) { //переклад речення
        String[] arraySentence = en.split(" ");
        for (int i = 0; i < arraySentence.length; i++) {
            if (!this.dictionary.containsKey(arraySentence[i])) {
                arraySentence[i] = " not found ";
            }else{
                arraySentence[i] = this.dictionary.get(arraySentence[i]);
            }
        }
        return Arrays.toString(arraySentence);
    }

}
