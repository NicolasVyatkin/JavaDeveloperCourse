package HW1_121022;


public class dataTypeMat {
    byte num1 = 100; //8bit діапазон -128 127
    short num2 = 200; //16bit діапазон -32768 32767
    static int num9 = 11;
    static int num10 = 5;


    static int num3 = 300; //32bit змінна доступна лише у цьому класі
    public int num7 = 700; //32bit змінна доступна для інших класів
    public static int num8 = 800; //32bit змінна доступна для інших класів, але є константою

    long num4 = 400; //64bit

    float num5 = 1.1f; //32bit 6-7 знаків після коми
    double num6 = 1.222; //64bit до 15 знаків після коми

    char sumVol = '\u2122'; //16bit

    boolean isTrue = true; //1bit true or false


    // Математичні дії
    public static void main(String[] args){
    int result1 = num10 + num9;
    int result2 = num10 - num9;
    double result3 = num9 / num10;
    int result4 = num10 * num9;
    int result5 = num10 % num9;

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5); // залишок ділення

        // && - оператор порівняння і (перше та друге наприклад)
        // || - оператор порівняння або (перше або друге)

        if (num10 == num10 && result1>=result2) {
            System.out.println("працює");
        } else {
            System.out.println("ne працює");
        }

        if (num10 != num10 || result1<=result2) {
            System.out.println("працює");
        } else {
            System.out.println("ne працює");
        }

}
}
