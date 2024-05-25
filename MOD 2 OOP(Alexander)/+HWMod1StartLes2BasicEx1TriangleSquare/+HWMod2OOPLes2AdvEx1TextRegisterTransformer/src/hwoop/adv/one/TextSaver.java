package hwoop.adv.one;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class TextSaver {
    private TextTransformer transformer;
    private File file;
    public TextSaver(TextTransformer transformer, File file) {
        super();
        this.transformer = transformer;
        this.file = file;
    }

    public TextSaver() {
        super();
    }

    public TextTransformer getTransformer() {
        return transformer;
    }

    public void setTransformer(TextTransformer transformer) {
        this.transformer = transformer;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "TextSaver {transformer=" + transformer + ", file=" + file + "}";
    }

    public void saveTextToFile(String text) {
        String textTransformered = transformer.textTransform(text);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(textTransformered);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//public class TextSaver {
//
//    private TextTransformer transformer;
//    File file = new File("text.txt");
//
//    public void saveTextToFile(String text, File file) {
//        try (PrintWriter pw = new PrintWriter(file)) {
//            pw.println(text);
//        }catch (IOException e){
//            System.out.println(e);
//
//    }
//
//}



