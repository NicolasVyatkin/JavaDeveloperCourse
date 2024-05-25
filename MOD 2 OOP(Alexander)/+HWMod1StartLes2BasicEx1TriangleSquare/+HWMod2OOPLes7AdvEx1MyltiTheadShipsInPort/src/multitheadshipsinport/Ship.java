package multitheadshipsinport;

import java.util.ArrayList;

public class Ship {

    private String name;
    private int cargoMaxCount;
    private Port port;
    private ArrayList<Cargo> cargosArr = new ArrayList<Cargo>();

    public Ship(String name, int cargoMaxCount) {
        this.name = name;
        this.cargoMaxCount = cargoMaxCount;
    }

    public String getName() {
        return name;
    }

    public int getCargoMaxCount() {
        return cargoMaxCount;
    }

    public ArrayList<Cargo> getCargosArr() {
        return cargosArr;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }

    synchronized public boolean isFull() {
        if (cargosArr.size() < cargoMaxCount){
            return false;
        }
        else return true;
    }

    synchronized public boolean putCargo(Cargo c){
        if(!isFull()){
            try{
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println("ERROR");
            }
            cargosArr.add(c);
            System.out.println(c.getClass().getSimpleName()+ " " + c.getNumber()+ " is add to " + name);
            return true;
        }
        else {
            System.out.println("The ship " + name + " is full");
            return false;
        }
    }

    synchronized public Cargo getCagro(){
        if(cargosArr.size()!=0){
            try{
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println("ERROR");
            }
            Cargo bufferCargo = cargosArr.get(0);
            System.out.println(bufferCargo.getClass().getSimpleName()+ " " + bufferCargo.getNumber()+ " get from" + name);
            cargosArr.remove(0);
            return bufferCargo;
        }
        else{
            System.out.println("The ship " + name + " is empty");
            return null;
        }
    }
}