package lection10.hwbasic1and2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.Map.Entry;

public class FileDictionaryTranslator {


    private Map<String, String> dict = new HashMap<>();

    public FileDictionaryTranslator(Map<String, String> dict) {
        super();
        this.dict = dict;
    }

    public FileDictionaryTranslator() {
        super();
    }

    public Map<String, String> getDict() {
        return dict;
    }

    public void setDict(Map<String, String> dict) {
        this.dict = dict;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dict);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FileDictionaryTranslator other = (FileDictionaryTranslator) obj;
        return Objects.equals(dict, other.dict);
    }

    @Override
    public String toString() {
        return "lection10.hwbasic1and2.Dictionary [dict=" + dict + "]";
    }

    public String addToDict(String key, String value) {
        return dict.put(key, value);
    }


    public Set<Entry<String, String>> entrySet() {
        return dict.entrySet();
    }


    public static void fillingDictionaryByUser(FileDictionaryTranslator dict) {
        Scanner sc = new Scanner(System.in);

        boolean isExit = false;
        while (!isExit) {
            System.out.println("Please enter a word in English or type \"stop\" if " +
                    "you want to finish filling the dictionary: ");
            String en = sc.nextLine();
            isExit = en.equals("stop");
            if (!isExit) {
                System.out.println("Please enter Ukrainian translation of this word: ");
                String ua = sc.nextLine();
                dict.addToDict(en, ua);
            }
        }
    }


    public static void addTranslationFromFile(File fileDictionary, FileDictionaryTranslator dict) {
        String translationString = "";
        try {
            Scanner sc = new Scanner(fileDictionary);
            for (; sc.hasNext(); ) {
                translationString = sc.nextLine();
                String[] temp = translationString.split(";");
                dict.addToDict(temp[0], temp[1]);
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }

    public static String readTextFromFile(File fileIn) {
        String text = "";
        try {
            Scanner sc = new Scanner(fileIn);
            for (; sc.hasNextLine(); ) {
                text = text + sc.nextLine();
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        return text;
    }

    public static void writeTranslationToFile(File fileOut, String translation) {
        try (PrintWriter pw = new PrintWriter(fileOut)) {
            pw.println(translation);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Translation added to file " + fileOut + " successfully");


    }

    public String translateToUkrainian(String textEn) {
        String[] textToArray = textEn.toLowerCase().split(" ");
        List<String> textUa = new ArrayList<>();
        for (String wordEn : textToArray) {
            if (dict.containsKey(wordEn)) {
                System.out.println("The translation of the english word " + "'" + textEn + "'"
                        + " is - " + dict.get(wordEn));
                textUa.add(dict.get(wordEn));
            } else {
                textUa.add("There is no sutch word dictionary");
            }
        }
        String translation = String.join(" ", textUa);
        return translation;

    }

    public static void createFileDictionary(File fileDictionary, FileDictionaryTranslator dict) {

        Set<Map.Entry<String, String>> dictSet = dict.entrySet();
        String translationString = "";
        String del = ";";

        try (PrintWriter pw = new PrintWriter(fileDictionary)) {
            for (Map.Entry<String, String> dic : dictSet) {
                translationString = dic.getKey() + ";" + dic.getValue();
                pw.println(translationString);
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }
}