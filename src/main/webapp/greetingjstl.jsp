<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Greeting</title>
        <link rel="stylesheet" type="text/css" href="index.css">
</head>
<body>
<h1>Subbed</h1>
<c:forEach var="p" items="${people}">
    <p><c:out value="${p.name}"/> : <c:out value="${p.email}"/><p>
</c:forEach>
<a href="index.html">Go back to the <em>index</em> page.</a>
<br>
</body>
</html>
