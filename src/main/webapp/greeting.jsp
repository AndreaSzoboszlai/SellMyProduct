<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.codecool.web.model.Person" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Greeting</title>
    <link rel="stylesheet" type="text/css" href="index.css">
</head>
<body>
<% List<Person> people = (List<Person>) request.getAttribute("people"); %>
<% for (Person p : people) { %>
    <p><%= p.getName() %> : <%= p.getEmail() %></p>
<% } %>
<p>${email}</p>
<%= (String)request.getAttribute("name") %> <br>
<%= (String)request.getAttribute("email") %>
<p>Successfully subscribed!</p>

<a href="index.html">Go back to the <em>index</em> page.</a> <br>

<p>Back</p>
<br>
</body>
</html>
