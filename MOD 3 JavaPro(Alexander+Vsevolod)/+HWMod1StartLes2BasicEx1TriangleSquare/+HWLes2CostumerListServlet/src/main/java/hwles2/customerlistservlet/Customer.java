package hwles2.customerlistservlet;

public class Customer {
    private int customerID;
    private String lastName;
    private String firstName;
    private String professionOccupation;
    private int age;
    private Gender genderType;
    private String workPhone;
    private String workEmail;
    private String homePhone;
    private String personalEmail;
    private String linkedinID;
    private String homeStreet;
    private HomeState homeState;
    private String homeCity;
    private String homePostalCode;

    public Customer(int customerID, String lastName, String firstName, String professionOccupation,
                    int age, Gender genderType, String workPhone, String workEmail, String homePhone,
                    String personalEmail, String linkedinID, String homeStreet,
                     String homeCity,HomeState homeState, String homePostalCode) {
        this.customerID = customerID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.professionOccupation = professionOccupation;
        this.age = age;
        this.genderType = genderType;
        this.workPhone = workPhone;
        this.workEmail = lastName+"@we.com";
        this.homePhone = homePhone;
        this.personalEmail = firstName+"@pe.com";
        this.linkedinID = firstName+lastName;
        this.homeStreet = homeStreet;
        this.homeState = homeState;
        this.homeCity = homeCity;
        this.homePostalCode = homePostalCode;
    }

    public Customer() {

    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getProfessionOccupation() {
        return professionOccupation;
    }

    public void setProfessionOccupation(String professionOccupation) {
        this.professionOccupation = professionOccupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGenderType() {
        return genderType;
    }

    public void setGenderType(Gender genderType) {
        this.genderType = genderType;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }


    public String getLinkedinID() {
        return linkedinID;
    }

    public void setLinkedinID(String linkedinID) {
        this.linkedinID = linkedinID;
    }

    public String getHomeStreet() {
        return homeStreet;
    }

    public void setHomeStreet(String homeStreet) {
        this.homeStreet = homeStreet;
    }

    public HomeState getHomeState() {
        return homeState;
    }

    public void setHomeState(HomeState homeState) {
        this.homeState = homeState;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

    public String getHomePostalCode() {
        return homePostalCode;
    }

    public void setHomePostalCode(String homePostalCode) {
        this.homePostalCode = homePostalCode;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", professionOccupation='" + professionOccupation + '\'' +
                ", age=" + age +
                ", genderType=" + genderType +
                ", workPhone='" + workPhone + '\'' +
                ", workEmail='" + workEmail + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", personalEmail='" + personalEmail + '\'' +
                ", linkedinID='" + linkedinID + '\'' +
                ", homeStreet='" + homeStreet + '\'' +
                ", homeState=" + homeState +
                ", homeCity='" + homeCity + '\'' +
                ", homePostalCode='" + homePostalCode + '\'' +
                '}';
    }
}
