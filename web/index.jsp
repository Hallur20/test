<%-- 
    Document   : index
    Created on : Mar 30, 2017, 2:57:09 PM
    Author     : hvn15
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%= request.getAttribute("map").toString()%>
    </body>
</html>
