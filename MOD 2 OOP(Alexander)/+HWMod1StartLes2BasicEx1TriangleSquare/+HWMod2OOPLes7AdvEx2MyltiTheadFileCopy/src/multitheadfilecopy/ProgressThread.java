package multitheadfilecopy;

public class ProgressThread implements Runnable {

    private Action action;
    private Thread thr;

    public ProgressThread() {
        super();
    }

    public ProgressThread(Action action) {
        super();
        this.action = action;
        thr = new Thread(this);
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thr.start();
    }

    @Override
    public void run() {
        for (int i = 1; (i < (action.getFileLength()) / action.getBufferSize()); i++) {
            synchronized (action) {
                try {
                    action.wait();
                    action.showProgress(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}