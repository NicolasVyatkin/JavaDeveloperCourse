package lection10.hwbasic1and2;

import java.io.File;

//1. Написать программу - переводчик, которая будет переводить
//        текст в файле English.in, написанный на английском языке, на
//        украинский язык, согласно заранее составленному словарю.
//        Результат сохранить в файл Ukrainian.out.
// 2. Сделать ф-ю ручного наполнения словаря и возможность его
//        сохранения на диск.

public class Main {

    public static void main(String[] args) {
        FileDictionaryTranslator fileDict = new FileDictionaryTranslator();
        fileDict.addToDict("red", "червоний");
        fileDict.addToDict("orange", "помаранчевий");
        fileDict.addToDict("yellow", "жовтий");
        fileDict.addToDict("green", "зелений");
        fileDict.addToDict("blue", "блакитний");
        fileDict.addToDict("darkblue", "синій");
        fileDict.addToDict("violet", "фіолетовий");


        FileDictionaryTranslator.fillingDictionaryByUser(fileDict);

        File fileDictionary = new File("lection10.hwbasic1and2.Dictionary.csv");
        FileDictionaryTranslator.createFileDictionary(fileDictionary, fileDict);

        FileDictionaryTranslator.addTranslationFromFile(fileDictionary, fileDict);

        File fileIn = new File("English.csv");
        String text = FileDictionaryTranslator.readTextFromFile(fileIn);

        String translation = fileDict.translateToUkrainian("green");

        File fileOut = new File("Ukrainian.csv");
        FileDictionaryTranslator.writeTranslationToFile(fileOut, translation);
    }


}