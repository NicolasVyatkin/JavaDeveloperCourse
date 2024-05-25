package asciiarthashmap;

/*
*4. Реализуйте программу, которая сопоставит каждой букве ее
представление в виде ASCII - art, например
     *
    * *
    * *
А *******
 *       *
*         *
Ваша программа должна дать возможность вывода произвольного
текста на экран в виде его ASCII-art представления.
* */

public class Main {
    public static void main(String[] args) {
        Abet enAbet = new Abet();
        enAbet.loadAbet("abet.txt");

        Art art = new Art(enAbet);
        art.print("H");
    }
}