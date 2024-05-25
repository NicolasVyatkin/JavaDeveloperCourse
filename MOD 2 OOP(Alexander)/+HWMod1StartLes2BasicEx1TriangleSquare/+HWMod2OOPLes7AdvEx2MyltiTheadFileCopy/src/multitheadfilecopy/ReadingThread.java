package multitheadfilecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingThread implements Runnable {
    private Action action;
    private File in;
    private byte[] array;
    private Thread thr;

    public ReadingThread() {
        super();
    }

    public ReadingThread(Action action, File in, int bufferSize) {
        super();
        this.action = action;
        this.in = in;
        array = new byte[bufferSize];
        thr = new Thread(this);
        thr.start();
    }

    @Override
    public void run() {
        action.setFileLength(in.length());
        try (FileInputStream fis = new FileInputStream(in)) {
            for (int n = 0; (n = fis.read(array)) > 0; ) {
                synchronized (action) {
                    action.setData(array, n);
                    action.wait();
                }
            }
        } catch (InterruptedException | IOException e) {
            System.out.println(e.getMessage());
        }
        action.setData(new byte[0], 0);
    }
}
