<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
    <title>Passenger Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 400px;
        }
        h2 {
            text-align: center;
            color: #333333;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        td {
            padding: 10px;
        }
        form:label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
            color: #555555;
        }
        form:input {
            width: calc(100% - 22px);
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #dddddd;
            border-radius: 5px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            width: 100%;
            background-color: #4CAF50;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        .ticket-info {
            text-align: center;
            color: #4CAF50;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Passenger Form</h2>
        
        <form:form method="post" action="/book-ticket" modelAttribute="passenger">
            <table>
                <tr>
                    <td><form:label path="id">ID:</form:label></td>
                    <td><form:input path="id" /></td>
                </tr>
                <tr>
                    <td><form:label path="name">Name:</form:label></td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td><form:label path="departure">Departure:</form:label></td>
                    <td><form:input path="departure" /></td>
                </tr>
                <tr>
                    <td><form:label path="arrival">Arrival:</form:label></td>
                    <td><form:input path="arrival" /></td>
                </tr>
                <tr>
                    <td><form:label path="dateOfjourney">Date of Journey:</form:label></td>
                    <td><form:input path="dateOfjourney" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Save" />
                    </td>
                </tr>
            </table>
        </form:form>

        
    </div>
</body>
</html>
