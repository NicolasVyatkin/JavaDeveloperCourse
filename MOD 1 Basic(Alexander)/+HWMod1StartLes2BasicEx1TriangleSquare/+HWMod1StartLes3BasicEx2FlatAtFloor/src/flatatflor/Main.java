package flatatflor;

import java.util.Scanner;

/**
 * 2) Есть девятиэтажный дом, в котором 5 подъездов. Номер подъезда начинается с единицы. На
 * одном этаже 4 квартиры. Напишите программу которая, получит номер квартиры с клавиатуры, и
 * выведет на экран, на каком этаже, какого подъезда расположена эта квартира. Если такой
 * квартиры нет в этом доме, то нужно сообщить об этом пользователю.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Flat: ");
        x = sc.nextInt();
        int entrance = (x - 1) / 36 + 1;
        int flor = (x - 36 * (entrance - 1) - 1) / 4 + 1;
        if (x > 0 && x <= 180) {
            System.out.println("Entrance: " + entrance);

            System.out.println("Flor: " + flor);
        } else {
            System.out.println("There is no such flat in this house");
        }
    }
}