<%--
  Created by IntelliJ IDEA.
  User: sbotnaru
  Date: 3/5/2019
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Proces Form</title>
</head>
<body>

<center>


    <h2>Spring MVC and List Example</h2>

    <c:if test="${not empty lists}">

        <ul>
            <c:forEach var="listValue" items="${lists}">
                <li>${listValue}</li>
            </c:forEach>
        </ul>

    </c:if>
  <%--  <img src="${pageContext.request.contextPath}/pages/hello.gif">--%>
<a  href="/mvc_test_no_xml_war_exploded/">Go back ->></a>

</center>
</body>
</html>
