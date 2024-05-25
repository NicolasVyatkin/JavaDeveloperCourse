package multitheadfilecopy;

/**
 *2) Реализуйте программу многопоточного копирования файла
 * блоками, с выводом прогресса на экран.
 * */

import java.io.File;

public class Main {
    public static void main(String[] args) {
        int bufferSize = 5;
        Action action = new Action();
        ReadingThread read = new ReadingThread(action, new File("in.txt"), bufferSize);
        ProgressThread progress = new ProgressThread(action);
        WritingThread write = new WritingThread(action, new File("out.txt"));
    }
}