package calcsum;

public class SumThread implements Runnable {

    private int sum;
    private int[] arrayPart;
    private Thread thr;

    public SumThread(int[] array) {
        this.arrayPart = array;
        this.thr = new Thread();
        this.thr.start();
    }

    public Thread getThr() {
        return thr;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        this.sum = Main.calculateArray(arrayPart);
    }
}