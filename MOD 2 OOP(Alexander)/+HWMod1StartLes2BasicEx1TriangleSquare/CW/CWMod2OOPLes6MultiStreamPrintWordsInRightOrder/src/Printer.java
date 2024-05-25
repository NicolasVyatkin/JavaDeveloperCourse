public class Printer {

    private Long thr = null;

    public synchronized void printText(String text) {
        Thread curThr = Thread.currentThread();
        for (; thr != null && thr == curThr.getId();) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println(text);
        thr = curThr.getId();
        notifyAll();
    }
}
