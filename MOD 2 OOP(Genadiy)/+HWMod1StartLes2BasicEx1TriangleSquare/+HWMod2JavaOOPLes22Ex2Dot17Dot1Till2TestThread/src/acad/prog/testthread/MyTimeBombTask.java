package acad.prog.testthread;
//task 2.17.1

public class MyTimeBombTask implements Runnable{
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        for (int i = 10; i >0; i--) {
            System.out.print("..."+i);
            try {
                thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print("...Boom!!!");
    }
}