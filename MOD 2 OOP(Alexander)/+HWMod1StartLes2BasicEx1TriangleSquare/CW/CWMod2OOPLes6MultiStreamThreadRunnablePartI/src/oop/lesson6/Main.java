package oop.lesson6;

public class Main {
    public static void main(String[] args) {
        System.out.println("main start");
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName());
        System.out.println(mainThread.getId());
//
//    try {
//      Thread.sleep(3000);
//    } catch (InterruptedException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
        FactorialTask task1 = new FactorialTask(10);
        FactorialTask task2 = new FactorialTask(10);
        FactorialTask task3 = new FactorialTask(10);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();//запуск потоков
        thread2.start();
        thread3.start();

        try {//преостановка main до завершения параллельных потоков
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        thread1.interrupt();//сигнал на прерывание
        thread2.interrupt();
        thread3.interrupt();

        System.out.println("Sum 1 = " + task1.getFactorialSum());
        System.out.println("Sum 2 = " + task2.getFactorialSum());
        System.out.println("Sum 3 = " + task3.getFactorialSum());

        System.out.println("main end");
    }
}