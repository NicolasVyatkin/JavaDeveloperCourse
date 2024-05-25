package multitheadfilecopy;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingThread implements Runnable {
    private Action action;
    private File out;
    private Thread thr;

    public WritingThread() {
        super();
    }

    public WritingThread(Action action, File out) {
        super();
        this.action = action;
        this.out = out;
        thr = new Thread(this);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thr.start();
    }

    @Override
    public void run() {
        try (FileOutputStream fos = new FileOutputStream(out)) {
            while (action.getBufferSize() != 0) {
                synchronized (action) {
                    fos.write(action.getData(), 0, action.getBytesNumber());
                    action.wait();
                }
            }
        } catch (InterruptedException | IOException e) {
            e.getMessage();
        }
        System.out.print("Copying is done    — 100%\n");
    }
}
