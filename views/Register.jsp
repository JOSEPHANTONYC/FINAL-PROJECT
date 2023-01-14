<%-- 
    Document   : Register
    Created on : 09-Jan-2023, 03:05:48
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
        <form  name="frm_customer" id="frm_customer" action="RegisterControllers?accion=registrar" method="POST" >
        <h1>Enter data</h1>
            <span>Name:</span><input type="text" name="name" id="name" value="" placeholder="enter your name"><br/><br/>
            <span>Surname:</span><input type="text" name="surname" id="surname" value="" placeholder="enter your surname"><br/><br/>
            <span>Birth:</span><input type="date" name="birth" id="birth" value="" placeholder="enter your birth date"><br/><br/>
            <span>Phone Number:</span><input type="number" name="phone" id="phone" value="" placeholder="enter your phone number"><br/><br/>
             <span>Email:</span><input type="email" name="email" id="email" value="" placeholder="enter your email"><br/><br/>
            <span>Password:</span><input type="password" name="password" id="password" value="" placeholder="enter a password"><br/><br/>
            
             <input type="button" class="btn" name="" value="Register" onclick="javascript:validar_formulario();"> 
            <!-- <input type="submit" value="Register"> -->
        </form>  
         <script>
            function validar_formulario(){
                var name = document.frm_customer.name.value;
                var surname = document.frm_customer.surname.value;
                var birth = document.frm_customer.birth.value;
                var phone = document.frm_customer.phone.value;
                var email = document.frm_customer.email.value;
                if(name==="" || surname === "" || birth==="" || phone === "" || email==="" ){
                    alert("Debe ingresar todos los datos!!!");
                }else{
                    document.frm_customer.submit();
                }
            }
        </script>
    </body>
</html>
