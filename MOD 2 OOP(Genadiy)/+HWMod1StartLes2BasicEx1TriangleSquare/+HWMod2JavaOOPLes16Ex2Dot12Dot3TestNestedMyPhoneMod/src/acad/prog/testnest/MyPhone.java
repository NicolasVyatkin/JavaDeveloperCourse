package acad.prog.testnest;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * Task 2.12.3
 * @author Kolin Vyatkin
 */
public class MyPhone {
    private MyPhoneBook phoneBook;

    public MyPhone() { }

    public void switchOn() {
        System.out.println("Завантаження записів телефонної книги");
        this.phoneBook = new MyPhoneBook();

        phoneBook.addPhoneNumber("Саша", "+380501234567");
        phoneBook.addPhoneNumber("Борис", "+380679878888");
        phoneBook.addPhoneNumber("Iris", "+13888888888");
        phoneBook.addPhoneNumber("Natti", "+380739787545");
        phoneBook.addPhoneNumber("Ivan", "+380505535750");

        phoneBook.addPhoneNumber("Mali", "+380999999999");
        phoneBook.addPhoneNumber("John", "+380980000000");
        phoneBook.addPhoneNumber("Nancy", "+380688888888");
        phoneBook.addPhoneNumber("Olesya", "+380911111111");
        phoneBook.addPhoneNumber("Max", "+380352222222");

        System.out.println("OK!");
    }

    void call(int index) {
        System.out.println("Виклик: " + phoneBook.phoneNumbers[index]);
    }

    private class MyPhoneBook {
        private MyPhoneBook.PhoneNumber[] phoneNumbers = new MyPhoneBook.PhoneNumber[10];

        public void addPhoneNumber(String name, String phone) {

            for (int i = 0; i < phoneNumbers.length; i++) {
                if (phoneNumbers[i] == null) {
                    phoneNumbers[i] = new MyPhoneBook.PhoneNumber(name, phone);
                    break;
                }
            }
        }

        public void printPhoneBook() {
            Arrays.stream(phoneNumbers)
                    .filter(Objects::nonNull)
                    .forEach(System.out::println);
        }

        public void sortByName() {
            Arrays.sort(phoneNumbers, new Comparator<>() {
                @Override
                public int compare(MyPhoneBook.PhoneNumber pn1, MyPhoneBook.PhoneNumber pn2) {

                    if(pn1 == null) {
                        return (pn1 == pn2) ? 0 : 1;

                    } else if (pn2 == null) {
                        return -1;
                    }

                    return pn1.name.compareTo(pn2.name);
                }
            });
        }

        public void sortByPhoneNumber() {
            Arrays.sort(phoneNumbers, new Comparator<>() {
                @Override
                public int compare(MyPhoneBook.PhoneNumber pn1, MyPhoneBook.PhoneNumber pn2) {

                    if(pn1 == null) {
                        return (pn1 == pn2) ? 0 : 1;

                    } else if (pn2 == null) {
                        return -1;
                    }

                    return pn1.phone.compareTo(pn2.phone);
                }
            });
        }

        static class PhoneNumber {
            private String name;
            private String phone;

            public PhoneNumber(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            public String getName() {
                return name;
            }

            public String getPhone() {
                return phone;
            }

            @Override
            public String toString() {
                return "name: " + name + ", phone: " + phone;
            }
        }
    }
}