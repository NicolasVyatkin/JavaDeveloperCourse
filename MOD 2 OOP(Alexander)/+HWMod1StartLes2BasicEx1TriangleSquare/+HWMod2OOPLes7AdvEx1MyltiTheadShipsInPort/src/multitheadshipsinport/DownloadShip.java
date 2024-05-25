package multitheadshipsinport;
import java.util.concurrent.Callable;

public class DownloadShip implements Callable<Boolean> {

    private Ship ship;
    private Port port;

    public DownloadShip(Ship ship, Port port) {
        this.ship = ship;
        this.port = port;
    }

    @Override
    public Boolean call() {
        while (true) {
            Cargo cargo = port.getCargo(ship); //берем груз
            if (cargo!=null) {
                ship.putCargo(cargo);//кладем груз на корабль
            }
            else{
                break;
            }
        }
        return true;
    }
}