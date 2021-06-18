<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
<form action="users" method="get"></form>
<h2>Users</h2>
<br>
<table border="1">
    <tr>
        <th>FirstName</th>
        <th>SecondName</th>
        <th>Age</th>
        <th>Email</th>
        <th>Operations</th>
    </tr>
    <c:forEach var="user" items="${requestScope.users}">

        <c:url var="update_button" scope="request" value="/update_user">
            <c:param name="id" value="${user.ID}"/>
            <c:param name="firstName" value="${user.firstName}"/>
            <c:param name="secondName" value="${user.secondName}"/>
            <c:param name="age" value="${user.age}"/>
            <c:param name="email" value="${user.email}"/>
        </c:url>

        <c:url var="delete_button" scope="request" value="/delete_user">
            <c:param name="id" value="${user.ID}"/>
        </c:url>

        <tr>
            <td>${user.firstName}</td>
            <td>${user.secondName}</td>
            <td>${user.age}</td>
            <td>${user.email}</td>
            <td><input type="button" value="UPDATE"
                       onclick="window.location.href = '${update_button}'"/>
                <input type="button" value="DELETE"
                       onclick="window.location.href = '${delete_button}'"/>
            </td>
        </tr>
    </c:forEach>
</table>
<form action="${pageContext.request.contextPath}/add_user" method="get">
    <input type="submit" value="ADD">
</form>
</body>
</html>
