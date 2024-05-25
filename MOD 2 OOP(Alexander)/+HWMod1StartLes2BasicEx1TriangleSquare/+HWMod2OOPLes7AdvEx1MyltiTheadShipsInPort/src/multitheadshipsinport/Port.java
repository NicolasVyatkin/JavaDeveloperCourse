package multitheadshipsinport;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Port {

    private String name;
    private int docCount;
    private ArrayList<Ship> shipList = new ArrayList<Ship>();
    private ArrayList<Cargo> cargoList = new ArrayList<Cargo>();

    public Port(String name, int docCount) {
        this.name = name;
        this.docCount = docCount;
    }

    public String getName() {
        return name;
    }

    List<Cargo> getCargoList() {
        return cargoList;
    }

    synchronized public Cargo getCargo(Ship ship) {
        if(!ship.isFull()) {
            if (cargoList.size() != 0) {
                Cargo buffer = cargoList.get(0);
                cargoList.remove(0);
                return buffer;
            }
            else{
                System.out.println("The port " + name + " is empty");
                return null;
            }
        }
        else{
            System.out.println("The ship " + ship.getName() + " is full");
            return null;
        }

    }

    public ArrayList<Ship> getShipList() {
        return shipList;
    }

    public int getDocCount() {
        return docCount;
    }

    public void putCargoToPort(Cargo c){
        cargoList.add(c);
    }

    public void putShipToPort(Ship s){
        shipList.add(s);
        s.setPort(this);
        System.out.println("The ship " + s.getName() + " ship came to port " + name);
    }

    //метод который загрузит все корабли которые на данный момент находятся в  порту
    public void  downloadAllShipsInPort(){
        ExecutorService ex = Executors.newFixedThreadPool(docCount);
        ArrayList<DownloadShip> threadList = new ArrayList<DownloadShip>();
        for(int i = 0; i < shipList.size(); i++) {
            threadList.add(new DownloadShip(shipList.get(i),this));
            ex.submit(threadList.get(i));
        }
        try {
            ex.invokeAll(threadList);
        }
        catch (Exception e){
            System.out.println("Eror");
        }
        ex.shutdown();
    }

    //метод который разгрузит все корабли которые на данный момент находятся в  порту
    public void UnloadAllShipsInPort(){
        ExecutorService ex = Executors.newFixedThreadPool(docCount);
        ArrayList<UnloadShip> threadList = new ArrayList<UnloadShip>();
        for(int i = 0; i < shipList.size(); i++) {
            threadList.add(new UnloadShip(shipList.get(i),this));
            ex.submit(threadList.get(i));
        }
        try {
            ex.invokeAll(threadList);
        }
        catch (Exception e){
            System.out.println("Eror");
        }
        ex.shutdown();
    }
}