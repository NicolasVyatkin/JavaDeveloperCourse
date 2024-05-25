package acad.prog.testthread;
/**
 * Homework 2.17.1-2.17.2
 * @author Kolin Vyatkin
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //2.17.1
        MyTimeBomb bomb1 = new MyTimeBomb();
        bomb1.start();

        MyTimeBombTask bomb2 = new MyTimeBombTask();
        Thread th = new Thread(bomb2);
        th.start();

        //2.17.2
        // Sum of array's elements calculation with two threads using

//        int array[] = new int[1000];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//        }
//
//        MySumCount msc1 = new MySumCount();
//        msc1.setMyArray(array);
//        msc1.setStartIndex(0);
//        msc1.setStopIndex(500);
//        msc1.start();
//
//
//        MySumCount msc2 = new MySumCount();
//        msc2.setMyArray(array);
//        msc2.setStartIndex(msc1.getStopIndex());
//        msc2.setStopIndex(1000);
//        msc2.start();
//        msc2.join();
//
//        System.out.println("Sum of arr elements from [0 to 1000) indexes: "
//                + (msc1.getResultSum() + msc2.getResultSum()));
    }
}
