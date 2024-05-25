package factorial;

/**
 * 1) Создайте сто потоков которые будут вычислять факториал
 * числа равного номеру этого потока и выводить результат на
 * экран.
 * */

public class Main {
    public static void main(String[] args) {

        Thread[] threads = new Thread[100];
        int i = 0;

        while (i < 100) {
            try {
                threads[i] = new Thread(new MyThread(i));
                threads[i].start();
                threads[i].join(); //Or without this method to calculate thread factorials synchronously
                i++;
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
