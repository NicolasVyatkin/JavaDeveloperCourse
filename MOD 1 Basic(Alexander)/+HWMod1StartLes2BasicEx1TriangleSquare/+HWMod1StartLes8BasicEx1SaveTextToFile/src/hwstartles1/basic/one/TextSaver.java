package hwstartles1.basic.one;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TextSaver {
    //Функционал для записи введённого в файл

    private String text;
    private File file;

    public TextSaver(String text, File file) {
        this.text = text;
        this.file = file;
    }

    public TextSaver() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void saveTextToFile(String text, File file) {
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(text);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
