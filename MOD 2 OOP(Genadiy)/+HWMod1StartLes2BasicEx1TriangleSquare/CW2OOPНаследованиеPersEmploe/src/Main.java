public class Main {
    public static void main(String[] args) {

        Employee employeeOne = new Employee("Alex","Ivanov",10,"dev1");
        Employee employeeTwo = new Employee("Alex","Petrov",11,"dev2");

        System.out.println(employeeTwo.getLastName());
        System.out.println(employeeTwo.hashCode());
        System.out.println(employeeTwo.toString());

        Employee employee1 = new Employee("Oleksander", "Ts", 1, "Sci dev");//upcasting
        Object obj = employee1;
        Person person = employee1;

        Person[] persons = new Person[10];
        persons[0] = employee1;


    }
}