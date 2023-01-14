<%-- 
    Document   : Customer1
    Created on : 12-Jan-2023, 01:01:03
    Author     : janto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>CUSTOMER</h1>
        <form  name="frm_inde" id="frm_inde" action="CustomerController" method="POST" >
        <a href="CustomerController?accion=log_out">LOG OUT</a><br/>
        <a href="CustomerController?accion=last_service">LAST SERVICE</a><br/>
        <a href="CustomerController?accion=book_an">BOOK AN APPOINTMENT</a><br/>
        <a href="CustomerController?accion=booked">BOOKED</a>
        </form>
    </body>
</html>
