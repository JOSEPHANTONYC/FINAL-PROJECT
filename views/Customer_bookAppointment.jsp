<%-- 
    Document   : Customer_bookAppoinmet
    Created on : 14-Jan-2023, 16:16:14
    Author     : janto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <span class="h1">BOOK AND APPOINTMENT</span> <a class="btn btn-danger" href="CustomerController?accion=mainPage">MAIN PAGE</a>
        <a class="btn btn-success" href="CustomerController?accion=log_out">LOG OUT</a><br/>
        
        <h3>CLICK IN ONE OPTION</h3>
        <a class="btn btn-info" href="CustomerController?accion=annulaService">ANNUAL SERVICE</a><br/><br/>
        <a class="btn btn-info" href="CustomerController?accion=majorService">MAJOR SERVICE</a><br/><br/>
        <a class="btn btn-info" href="CustomerController?accion=repairFault">REPAIR/FAULT</a><br/><br/>
        <a class="btn btn-info" href="CustomerController?accion=majorRepair">MAJOR REPAIR</a><br/><br/>
        
    </body>
</html>
