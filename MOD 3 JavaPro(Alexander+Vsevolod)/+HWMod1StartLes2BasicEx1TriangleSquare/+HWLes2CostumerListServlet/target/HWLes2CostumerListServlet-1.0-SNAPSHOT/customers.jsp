<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="uk">
<head>

    <link rel="stylesheet" type="text/css" href="style.css">
    <title>Customer list</title>
</head>
<body>
<div class="header">Customer list</div>
    <table>
        <thead>
            <tr>
                <th>Customer ID</th>
                <th>Last Name</th>
                <th>First Name</th>
                <th>Profession/ Occupation</th>
                <th>Age</th>
                <th>Gender</th>
                <th>Work Phone</th>
                <th>Work Email</th>
                <th>Home Phone</th>
                <th>Personal Email</th>
                <th>Linkedin ID</th>
                <th>Home Street</th>
                <th>Home City</th>
                <th>Home State</th>
                <th>Home Postal Code</th>
            </tr>
        </thead>
        <tbody>
            <%=request.getAttribute("customers")%>
        </tbody>
    </table>
</body>
</html>
