package fuelpack;
/**
 * 3)Один литр топлива стоит 1.2$. Ваш автомобиль тратит на 100 км пути 8 литров топлива.
 * Вы собрались в поездку в соседний город. Расстояние до этого города составляет 120
 * км. Вычислите и выведите на экран сколько вам нужно заплатить за топливо для
 * поездки.
 * */

public class Main {


    public static void main(String[] args) {
        double fuelPrice = 1.2;
        float fuelUse = 8/100f;
        double totalSum = 2*120*fuelPrice*fuelUse;
        System.out.println("Total price of the fuel is "+totalSum+" $");
    }
}