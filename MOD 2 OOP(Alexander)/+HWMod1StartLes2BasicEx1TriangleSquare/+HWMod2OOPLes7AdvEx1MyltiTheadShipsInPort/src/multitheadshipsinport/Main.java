package multitheadshipsinport;

/**
 * 1) Существуют три корабля. На каждом из них 10 ящиков груза.
 * Они одновременно прибыли в порт в котором только два
 * дока. Скорость разгрузки 1 ящик в 0.5 сек. Напишите
 * программу которая управляя кораблями позволит им
 * правильно разгрузить груз.
 * */

public class Main {
    public static void main(String[] args){

        //создадим 2 порта
        Port port1 = new Port("Istanbul", 10);
        Port port2 = new Port("Odessa", 2);

        //положим в один порт товары
        for (int i = 0; i < 50; i++){
            port1.putCargoToPort(new Box(i+1));
            System.out.println(port1.getCargoList().get(i).getNumber());
        }

        //что у нас теперь лежит в портах
        System.out.println("In port " + port1.getName() + " is " + port1.getCargoList().size() + " cargos");
        System.out.println("In port " + port2.getName() + " is " + port2.getCargoList().size() + " cargos");

        System.out.println();

        //создадим корабли
        Ship ship1 = new Ship("Titanic1", 10);
        Ship ship2 = new Ship("Titanic2", 10);
        Ship ship3 = new Ship("Titanic3", 10);

        //отправим корабли в турцию
        port1.putShipToPort(ship1);
        port1.putShipToPort(ship2);
        port1.putShipToPort(ship3);
        //заргузим корабли
        port1.downloadAllShipsInPort();

        System.out.println();

        //корабли приплыли в украину
        port2.putShipToPort(ship1);
        port2.putShipToPort(ship2);
        port2.putShipToPort(ship3);
        //разгрузим корабли
        port2.UnloadAllShipsInPort();

        System.out.println();

        //проверим что теперь лежит в портах
        System.out.println("In port " + port1.getName() + " is " + port1.getCargoList().size() + " cargos");
        System.out.println("In port " + port2.getName() + " is " + port2.getCargoList().size() + " cargos");
    }
}