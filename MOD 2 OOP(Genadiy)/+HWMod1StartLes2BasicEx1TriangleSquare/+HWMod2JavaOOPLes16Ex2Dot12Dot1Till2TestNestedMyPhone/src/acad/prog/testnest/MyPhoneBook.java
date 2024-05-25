package acad.prog.testnest;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * Task 2.12.1-2.12.2
 * @author Kolin Vyatkin
 */
public class MyPhoneBook {
    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];

    public void addPhoneNumber(String name, String phone) {

        for (int i = 0; i < phoneNumbers.length; i++) {
            if (phoneNumbers[i] == null) {
                phoneNumbers[i] = new PhoneNumber(name, phone);
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
            public int compare(PhoneNumber pn1, PhoneNumber pn2) {

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
            public int compare(PhoneNumber pn1, PhoneNumber pn2) {

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
