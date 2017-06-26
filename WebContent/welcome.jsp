<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login successful</title>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #111111;
}
.container
{
  style="border-style: solid; border-color:red"
  width:100%; height:80%;
}
</style>
</head>
<body class="container">
<img style="width:100px; height:50px;" src = "images/1.png" />
<%-- <%= session.getAttribute( "loginId" ) %> --%>
<ul>
<li><a href="#">CloudIndia</a></li>
<li><a href="register.html">Services</a></li>
<li><a href="register.html">Today Sale</a></li>
<li><a href="#">Welcome <%= session.getAttribute( "loginId" ) %></a></li>
<li><a href="Logout">Logout</a></li>
</ul>

</body>
</html>