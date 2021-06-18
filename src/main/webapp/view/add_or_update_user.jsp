
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Adding new user</title>
</head>
<body>

<h2> Enter new record</h2>

<br>

<form action="${pageContext.request.contextPath}/save_user" method="post">

  <input name="id" hidden value="${param.get("id")}" type="number">

  <label> firstName
    <input name="firstName" value="${param.get("firstName")}" type="text" pattern="([A-Z][a-z]*\s?)*[A-Z][a-z]*" maxlength="30" required="required"/>
  </label>
  <br><br>
  <label> secondName
    <input name="secondName" value="${param.get("secondName")}" type="text" pattern="([A-Z][a-z]*\s?)*[A-Z][a-z]*" maxlength="30" required="required"/>
  </label>
  <br><br>
  <label> age
    <input  name="age" value="${param.get("age")}" type="number" required="required" min="1" max="150"/>
  </label>
  <br><br>
  <label> email
    <input name="email" value="${param.get("email")}" type="email" required="required"/>
  </label>
  <br><br>
  <input type="submit" value="SAVE">
</form>

</body>
</html>
