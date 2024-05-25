package oop.lesson6;

import java.math.BigInteger;

public class FactorialTask implements Runnable {
    private int number;
    private BigInteger factorialSum = BigInteger.ZERO;

    public FactorialTask(int number) {
        super();
        this.number = number;
    }

    public BigInteger getFactorialSum() {
        return factorialSum;
    }

    public BigInteger calculateFactorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    @Override
    public void run() {
        Thread thr = Thread.currentThread();
        for (int i = 1; i <= number; i++) {
            if (thr.isInterrupted()) {
                System.out.println(thr.getName() + " interrupted");
                return;
            }

            BigInteger fact = calculateFactorial(i);
            System.out.println(thr.getName() + "  " + i + "!= " + fact);
            factorialSum = factorialSum.add(fact);
        }
    }

}