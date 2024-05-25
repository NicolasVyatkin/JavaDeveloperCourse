package hwles2.customerlistservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CustomerViewServlet extends HttpServlet {


    private List<Customer> customers
            = Arrays.asList(
            new Customer(101, "Goldsmith", "Frances", "College student", 21, Gender.woman, "(137)777-0101", "", "(137)999-0101", "", "", "13 1st Street", "Ogunquit", HomeState.ME, "03907"),
            new Customer(102, "Cullen", "Tom", "Farm worcker", 42, Gender.man, "(137)777-0102", "", "(137)999-0102", "", "", "13 3rd Street", "May", HomeState.OK, "41256"),
            new Customer(103, "Redman", "Stuart Richard", "Calculator factory", 35, Gender.man, "(137)777-0103", "", "(137)999-0103", "", "", "15 3rd Street", "May", HomeState.TX, "25666"),
            new Customer(104, "Flagg", "Randall", "Antagonist", 2000, Gender.man, "(137)777-0104", "", "(137)999-0104", "", "", "16 4th Street", "Ogunquit", HomeState.ME, "03907"),
            new Customer(105, "Brentner", "Ralph", "Farmer", 45, Gender.man, "(137)777-0105", "", "(137)999-0105", "", "", "17 5th Street", "Okie City", HomeState.OK, "77521"),
            new Customer(106, "Lauder", "Harold", "High school student", 16, Gender.man, "(137)777-0106", "", "(137)999-0106", "", "", "18 6th Street", "Ogunquit", HomeState.ME, "03907"),
            new Customer(107, "Bateman", "Glen", "Sociology hrofessor", 57, Gender.woman, "(137)777-0107", "", "(137)999-0107", "", "", "19 7th Street", "Woodsville", HomeState.NH, "78731"),
            new Customer(108, "Underwood", "Larry", "Musician", 45, Gender.man, "(137)777-0108", "", "(137)999-0108", "", "", "12 8th Street", "New York", HomeState.NY, "72312"),
            new Customer(109, "Henreid", "Lloyd", "Criminal", 41, Gender.man, "(137)777-0109", "", "(137)999-0109", "", "", "11 9th Street", "Newada", HomeState.NV, "14375"),
            new Customer(110, "Freemantle", "Abagail", "Farmer", 108, Gender.woman, "(137)777-0110", "", "(137)999-0110", "", "", "12 4th Street", "Hemingford Home", HomeState.NE, "45786"),
            new Customer(111, "Cross", "Nadine", "Teacher", 33, Gender.woman, "(137)777-0111", "", "(137)999-0111", "", "", "13 8th Street", "Ogunquit", HomeState.ME, "03907"),
            new Customer(112, "Andros", "Nick", "Odd jobs", 32, Gender.man, "(137)777-0112", "", "(137)999-0112", "", "", "14 9th Street", "Caslin", HomeState.NE, "17397"),
            new Customer(113, "Elbert", "Donald Merwin", "Odd jobs", 30, Gender.man, "(137)777-0113", "", "(137)999-0113", "", "", "15 3th Street", "Powtanville", HomeState.IN, "83921"),
            new Customer(114, "Bachman", "Richard", "Writer", 75, Gender.man, "(137)777-0114", "", "(137)999-0114", "", "", "16 6th Street", "Portland", HomeState.ME, "03910"),
            new Customer(115, "Kroger", "Patty", "Teacher", 38, Gender.woman, "(137)777-0115", "", "(137)999-0115", "", "", "17 8th Streetut", "Okie City", HomeState.OK, "78952")
    );


    public CustomerViewServlet() {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customers", getCustomerTable());
        request.getRequestDispatcher("/customers.jsp").forward(request, response);
    }

    public String getCustomerTable() {
        StringBuilder sb = new StringBuilder();
        for (Customer customer : customers) {
            sb.append("<tr><td>")
                    .append(customer.getCustomerID())
                    .append("</td><td>")
                    .append(customer.getLastName())
                    .append("</td><td>")
                    .append(customer.getFirstName())
                    .append("</td><td>")
                    .append(customer.getProfessionOccupation())
                    .append("</td><td>")
                    .append(customer.getAge())
                    .append("</td><td>")
                    .append(customer.getGenderType())
                    .append("</td><td>")
                    .append(customer.getWorkPhone())
                    .append("</td><td>")
                    .append(customer.getWorkEmail())
                    .append("</td><td>")
                    .append(customer.getHomePhone())
                    .append("</td><td>")
                    .append(customer.getPersonalEmail())
                    .append("</td><td>")
                    .append(customer.getLinkedinID())
                    .append("</td><td>")
                    .append(customer.getHomeStreet())
                    .append("</td><td>")
                    .append(customer.getHomeCity())
                    .append("</td><td>")
                    .append(customer.getHomeState())
                    .append("</td><td>")
                    .append(customer.getHomePostalCode())
                    .append("</td></tr>");
        }
        return sb.toString();

    }

    public void setGroupName(String s) {
    }
}
