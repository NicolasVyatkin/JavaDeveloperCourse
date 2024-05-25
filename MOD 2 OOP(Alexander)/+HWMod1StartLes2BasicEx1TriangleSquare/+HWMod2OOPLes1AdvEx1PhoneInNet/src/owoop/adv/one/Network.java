package owoop.adv.one;

public class Network {
    private Phone[] phonesList;

    public Network(Phone[] phonesList) {
        super();
        this.phonesList = phonesList;
    }

    public Network(int a) {
        phonesList = new Phone[a];
    }

    public Network() {
        super();
    }

    public Phone[] getPhonesList() {
        return phonesList;
    }

    public void setPhonesList(Phone[] phonesList) {
        this.phonesList = phonesList;
    }

    public void allPhone(Phone phone) {
        for (int i = 0; i < phonesList.length; i++) {
            if (phonesList[i] == null) {
                phonesList[i] = phone;
                System.out.print(phone.toString() + "- зарегистрирован ");
                return;

            }

        }
    }
}

    //второй вариант
//    Phone[] phones = new Phone[100];
//
//    public void registrationOfNewAbonent(Phone phone) {
//        for (int i = 0; i < phones.length; i++) {
//            if (phones[i] != null) {
//                continue;
//            } else {
//                phones[i] = new Phone();
//                break;
//            }
//        }
//    }
//
//    public boolean checkRegistration(long number) {
//        for (int i = 0; i < phones.length; i++) {
//            if (phones[i] == null) continue;
//
//            if (number == phones[i].getNumber()) {
//                return true;
//            }
//        }
//        return false;
//    }

