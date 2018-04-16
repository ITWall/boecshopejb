<%-- 
    Document   : listAccount
    Created on : Apr 15, 2018, 10:44:52 PM
    Author     : nguye
--%>

<%@page import="entities.Address"%>
<%@page import="entities.Account"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            List<Account> listAccount = (List<Account>) session.getAttribute("listAccount");
            for(int i=0; i<listAccount.size(); i++){
                %>
                <p><%=listAccount.get(i).getUsername()%></p><br>
        <%
            }
        %>
    </body>
</html>
