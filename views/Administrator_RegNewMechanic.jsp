<%-- 
    Document   : Administrator_RegNewMechanic
    Created on : 14-Jan-2023, 17:08:51
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
        <form  name="frm_login" id="frm_login" action="RegisterControllers?accion=registrarNewMechanic" method="POST" >
        <h1>REGISTER NEW MECHANIC</h1>
            <span>Name:</span><input type="text" name="name" id="name" value="" placeholder="enter your name"><br/><br/>
            <span>Surname:</span><input type="text" name="surname" id="surname" value="" placeholder="enter your surname"><br/><br/>
            <span>Phone Number:</span><input type=" text" name="phone" id="phone" value="" placeholder="enter your phone number"><br/><br/>
             <span>Email:</span><input type="text" name="email" id="email" value="" placeholder="enter your email"><br/><br/>
            <span>Password:</span><input type="text" name="password" id="password" value="" placeholder="enter a password"><br/><br/>
            
            <input type="submit" value="Register">
            <a href="CustomerController?accion=log_out">LOGOUT</a>
        </form>  
      
        
        
    </body>
</html>
