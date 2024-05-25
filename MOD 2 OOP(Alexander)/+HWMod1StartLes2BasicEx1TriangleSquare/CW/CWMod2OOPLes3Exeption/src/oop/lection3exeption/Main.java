package oop.lection3exeption;


import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Задача 1
//        File file = new File("price.txt");
//        Integer price = null;
//        try {
//            Scanner sc = new Scanner(file);
//            price = sc.nextInt();
//        } catch (IOException e) {
//            System.out.println("File not found");
//        } catch (InputMismatchException e) {
//            System.out.println("Error file format");
//        }finally {
//            System.out.println("Thank you for using our service :) ");
//        }
//        System.out.println("price = " + price);

        //Задача 2
        // TODO Auto-generated method stub
        File file = new File("price.txt");
        Integer price = null;
        try {
            Scanner sc = new Scanner(file);
            price = sc.nextInt();
            if (price < 0) {
                price = null;
                throw new NegativePriceException();
            }

        } catch (IOException e) {
            System.out.println("File not found");
        } catch (InputMismatchException e) {
            System.out.println("Error file format");
        } catch (NegativePriceException e) {
            System.out.println("Negative price");
        } finally {
            System.out.println("Thank you for using our service :) ");
        }
        System.out.println("price = " + price);
    }

    //Документация к методу

    /**
     * Method demonstrate throw Exception.
     *
     * @param text String. Non null
     * @return void
     * @throws IOException
     * @author Alexander Ts: e-mail - some@com
     */
    public static void doIt(String text) throws IOException {
        if (text.equals("go")) {
            throw new IOException("^)");
        }
        System.out.println(text);
    }


}
