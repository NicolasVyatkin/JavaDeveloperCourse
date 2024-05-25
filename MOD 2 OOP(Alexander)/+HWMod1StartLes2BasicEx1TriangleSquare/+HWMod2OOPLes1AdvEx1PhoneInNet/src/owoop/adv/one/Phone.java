package owoop.adv.one;

import java.util.Scanner;

public class Phone {
    private String number;
    private Network network;

    public Phone(String number) {
        super();
        this.number = number;
    }

    public Phone() {
        super();
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void register(Network network) {
        network.allPhone(this);
        this.network = network;

    }

    public void call(String numb) {

        for (Phone phone : network.getPhonesList()) {
            if (phone != null && phone.number.equals(numb)) {
                phone.incoming(number);
                return;
            }
        }
        System.out.println("\nЗвонок не выполнен " + numb + " телефон не зарегистрирован в сети");
    }

    public void incoming(String num) {
        System.out.print("\nВыполняется звонок на номер: " + this.number + " с номера: " + num);
    }

    @Override
    public String toString() {
        return "| Номер " + number;
    }

}
    //второй вариант
//    private long number;
//    private Network network;
//
//    Phone(long number,Network network) {
//        this.network = network;
//        this.number = number;
//    }
//
//    public Phone(long number) {
//        this.number = number;
//    }
//
//    public Phone() {
//    }
//
//    public long getNumber() {
//        return number;
//    }
//
//    public void setNumber(long number) {
//        this.number = number;
//    }
//
//    public Network getNetwork() {
//        return network;
//    }
//
//    public void setNetwork(Network network) {
//        this.network = network;
//    }
//
//    public void incomingCall(long number) {
//        System.out.println("The abonent " + number + " is calling you");
//    }
//
//    public void call(long numberReceive) {
//
//        if ((network.checkRegistration(this.number)) == true) {      // Вот здесь всё время false. Я интуитивно понимаю, что
//            // проблема в поле Network network = new Network(), но
//            // как исправить не пойму. Если оставить просто
//            // Network network; то выкидывает NullPointerException
//
//            if (network.checkRegistration(numberReceive) == true) {
//                incomingCall(this.number);
//            } else {
//                System.out.println("The abonent you calling is not registered in network");
//            }
//        } else {
//            System.out.println("You are not registered in network");
//        }
//    }

    //первый вариант

//    private int phone;
//    private boolean registry;
//
//    public Phone(int phone) {
//        this.phone = phone;
////        this.registry = registry;
//    }
//
//    public Phone() {
//    }
//
//    public int getPhone() {
//        return phone;
//    }
//
//    public void setPhone(int phone) {
//        this.phone = phone;
//    }
//
//    public boolean isRegistry() {
//        return registry;
//    }
//
//    public void setRegistry(boolean registry) {
//        this.registry = registry;
//    }
//
//    public int registerPhone(){
//        System.out.print("Пожалуйста введите телефон для регистрации: ");
//        Scanner sc = new Scanner(System.in);
//        int pn = sc.nextInt();
//
//        return pn;
//    }
//
//

