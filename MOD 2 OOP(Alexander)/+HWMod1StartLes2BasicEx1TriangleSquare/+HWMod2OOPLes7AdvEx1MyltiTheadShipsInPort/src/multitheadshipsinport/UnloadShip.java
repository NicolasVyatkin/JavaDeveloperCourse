package multitheadshipsinport;

import java.util.concurrent.Callable;

public class UnloadShip implements Callable<Boolean> {

    private Ship ship;
    private Port port;

    public UnloadShip(Ship ship, Port port) {
        this.port = port;
        this.ship = ship;
    }

    @Override
    public Boolean call() {
        while (true){
            Cargo cargo = ship.getCagro();
            if(cargo == null){
                break;
            }
            port.putCargoToPort(cargo);
        }
        return true;
    }
}