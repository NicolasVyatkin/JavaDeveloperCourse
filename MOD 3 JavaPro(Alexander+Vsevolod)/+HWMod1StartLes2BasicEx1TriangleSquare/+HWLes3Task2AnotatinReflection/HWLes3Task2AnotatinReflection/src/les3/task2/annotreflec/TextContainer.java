package les3.task2.annotreflec;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@SaveTo(path = "/home/ddexster/filetest.txt")
public class TextContainer {

    protected String s = "This is the line to save into file!";

    @Saver
    public void save(String path) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(path))) {
            writer.println(this.s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
